package typings.murmurhash3js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("murmurhash3js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object x64 extends js.Object {
    def hash128(`val`: String): String = js.native
    def hash128(`val`: String, seed: Double): String = js.native
  }
  
  @js.native
  object x86 extends js.Object {
    def hash128(`val`: String): String = js.native
    def hash128(`val`: String, seed: Double): String = js.native
    def hash32(`val`: String): Double = js.native
    def hash32(`val`: String, seed: Double): Double = js.native
  }
  
}

