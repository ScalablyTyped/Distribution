package typings.nodegit.transportMod

import typings.nodegit.certMod.Cert
import typings.nodegit.remoteMod.Remote
import typings.nodegit.strDashArrayMod.Strarray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/transport", "Transport")
@js.native
class Transport () extends js.Object {
  def init(version: Double): Double = js.native
  def smartCertificateCheck(cert: Cert, valid: Double, hostName: String): Double = js.native
}

/* static members */
@JSImport("nodegit/transport", "Transport")
@js.native
object Transport extends js.Object {
  def sshWithPaths(owner: Remote, payload: String): js.Promise[Transport] = js.native
  def sshWithPaths(owner: Remote, payload: js.Array[String]): js.Promise[Transport] = js.native
  def sshWithPaths(owner: Remote, payload: Strarray): js.Promise[Transport] = js.native
  def unregister(prefix: String): Double = js.native
}

