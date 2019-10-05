package typings.nodegit.transportMod

import typings.nodegit.certMod.Cert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/transport", "Transport")
@js.native
class Transport_ () extends js.Object {
  def init(version: Double): Double = js.native
  def smartCertificateCheck(cert: Cert, valid: Double, hostName: String): Double = js.native
}

