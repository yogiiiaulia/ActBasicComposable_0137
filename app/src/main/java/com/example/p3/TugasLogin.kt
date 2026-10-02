package com.example.p3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "Background Image",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Login",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )

            Text(
                text = "Ini adalah halaman login,",
                fontSize = 16.sp,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(30.dp))

            Image(
                painter = painterResource(id = R.drawable.fotoatas),
                contentDescription = "Logo Kampus",
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "Nama",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red
            )

            Text(
                text = "Yogi aulia ardiano",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )

            Text(
                text = "20240104137",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )


        }

    }
}