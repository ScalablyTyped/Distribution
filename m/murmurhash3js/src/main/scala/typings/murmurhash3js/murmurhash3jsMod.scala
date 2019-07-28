package typings.murmurhash3js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("murmurhash3js", JSImport.Namespace)
@js.native
object murmurhash3jsMod extends js.Object {
  @JSName("x64")
  @js.native
  object x64Ns extends js.Object {
    def hash128(`val`: String): String = js.native
    def hash128(`val`: String, seed: Double): String = js.native
  }
  
  @JSName("x86")
  @js.native
  object x86Ns extends js.Object {
    def hash128(`val`: String): String = js.native
    def hash128(`val`: String, seed: Double): String = js.native
    def hash32(`val`: String): Double = js.native
    def hash32(`val`: String, seed: Double): Double = js.native
  }
  
}

