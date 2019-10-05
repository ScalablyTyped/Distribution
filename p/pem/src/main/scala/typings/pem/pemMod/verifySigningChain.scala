package typings.pem.pemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pem", "verifySigningChain")
@js.native
object verifySigningChain extends js.Object {
  def apply(certificate: String, ca: js.Array[String], callback: Callback[Boolean]): Unit = js.native
}

