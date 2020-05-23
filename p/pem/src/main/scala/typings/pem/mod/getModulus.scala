package typings.pem.mod

import typings.pem.anon.Modulus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pem", "getModulus")
@js.native
object getModulus extends js.Object {
  def apply(certificate: String, callback: Callback[Modulus]): Unit = js.native
  def apply(certificate: String, password: String, callback: Callback[Modulus]): Unit = js.native
}

