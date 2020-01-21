package typings.pem.mod

import typings.pem.AnonDhparam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pem", "createDhparam")
@js.native
object createDhparam extends js.Object {
  def apply(callback: Callback[AnonDhparam]): Unit = js.native
  def apply(keyBitsize: Double, callback: Callback[AnonDhparam]): Unit = js.native
}

