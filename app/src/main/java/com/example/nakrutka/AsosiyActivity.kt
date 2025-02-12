package com.example.nakrutka

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.nakrutka.databinding.ActivityAsosiyBinding

class AsosiyActivity : AppCompatActivity() {
    lateinit var binding: ActivityAsosiyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asosiy)
            binding = ActivityAsosiyBinding.inflate(layoutInflater)
            setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView2,
                AsosiyFragment()).commit()
binding.navView.setOnItemSelectedListener {
              when(it.itemId) {
                  R.id.homenav -> {
                      supportFragmentManager.beginTransaction()
                          .replace(R.id.fragmentContainerView2,
                              AsosiyFragment()).commit()
                      return@setOnItemSelectedListener true
                  }
                  R.id.profilnav -> {
                      supportFragmentManager.beginTransaction()
                          .replace(R.id.fragmentContainerView2,
                             ProfilFragment()).commit()
                      return@setOnItemSelectedListener true
                  }
                  else -> false
              }
               return@setOnItemSelectedListener true
}
            }
    }
