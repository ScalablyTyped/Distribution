package typings.pem.pemMod

import typings.pem.Anon_Modulus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pem", "getModulus")
@js.native
object getModulus extends js.Object {
  def apply(certificate: String, callback: Callback[Anon_Modulus]): Unit = js.native
  def apply(certificate: String, password: String, callback: Callback[Anon_Modulus]): Unit = js.native
}

