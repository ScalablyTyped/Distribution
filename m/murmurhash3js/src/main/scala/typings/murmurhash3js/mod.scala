package typings.murmurhash3js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object x64 {
    
    @JSImport("murmurhash3js", "x64")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def hash128(`val`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hash128")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def hash128(`val`: String, seed: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hash128")(`val`.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  object x86 {
    
    @JSImport("murmurhash3js", "x86")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def hash128(`val`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hash128")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def hash128(`val`: String, seed: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hash128")(`val`.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def hash32(`val`: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hash32")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
    @scala.inline
    def hash32(`val`: String, seed: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hash32")(`val`.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
