package typings
package murmurhash3jsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("murmurhash3js", JSImport.Namespace)
@js.native
object murmurhash3jsMod extends js.Object {
  @JSName("x64")
  @js.native
  object x64Ns extends js.Object {
    def hash128(`val`: java.lang.String): java.lang.String = js.native
    def hash128(`val`: java.lang.String, seed: scala.Double): java.lang.String = js.native
  }
  
  @JSName("x86")
  @js.native
  object x86Ns extends js.Object {
    def hash128(`val`: java.lang.String): java.lang.String = js.native
    def hash128(`val`: java.lang.String, seed: scala.Double): java.lang.String = js.native
    def hash32(`val`: java.lang.String): scala.Double = js.native
    def hash32(`val`: java.lang.String, seed: scala.Double): scala.Double = js.native
  }
  
}

