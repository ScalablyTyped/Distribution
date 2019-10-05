package typings.nodegit

import typings.nodegit.strDashArrayMod.Strarray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/str-array", JSImport.Namespace)
@js.native
object strDashArrayMod extends js.Object {
  @js.native
  class Strarray () extends js.Object {
    var count: Double = js.native
    var strings: js.Array[String] = js.native
    def copy(src: Strarray): Double = js.native
    def free(): Unit = js.native
  }
  
}

