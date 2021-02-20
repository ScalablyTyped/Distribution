package typings.murmurhash3js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object x64 {
    
    @JSImport("murmurhash3js", "x64.hash128")
    @js.native
    def hash128(`val`: String): String = js.native
    @JSImport("murmurhash3js", "x64.hash128")
    @js.native
    def hash128(`val`: String, seed: Double): String = js.native
  }
  
  object x86 {
    
    @JSImport("murmurhash3js", "x86.hash128")
    @js.native
    def hash128(`val`: String): String = js.native
    @JSImport("murmurhash3js", "x86.hash128")
    @js.native
    def hash128(`val`: String, seed: Double): String = js.native
    
    @JSImport("murmurhash3js", "x86.hash32")
    @js.native
    def hash32(`val`: String): Double = js.native
    @JSImport("murmurhash3js", "x86.hash32")
    @js.native
    def hash32(`val`: String, seed: Double): Double = js.native
  }
}
