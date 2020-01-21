package typings.pem.mod

import typings.pem.AnonModulus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pem", "getModulus")
@js.native
object getModulus extends js.Object {
  def apply(certificate: String, callback: Callback[AnonModulus]): Unit = js.native
  def apply(certificate: String, password: String, callback: Callback[AnonModulus]): Unit = js.native
}

