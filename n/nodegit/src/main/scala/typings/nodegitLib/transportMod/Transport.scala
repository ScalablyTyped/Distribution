package typings
package nodegitLib.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/transport", "Transport")
@js.native
class Transport () extends js.Object {
  def init(version: scala.Double): scala.Double = js.native
  def smartCertificateCheck(cert: nodegitLib.certMod.Cert, valid: scala.Double, hostName: java.lang.String): scala.Double = js.native
}

@JSImport("nodegit/transport", "Transport")
@js.native
object Transport extends js.Object {
  def sshWithPaths(owner: nodegitLib.remoteMod.Remote, payload: java.lang.String): stdLib.Promise[nodegitLib.transportMod.Transport] = js.native
  def sshWithPaths(owner: nodegitLib.remoteMod.Remote, payload: js.Array[java.lang.String]): stdLib.Promise[nodegitLib.transportMod.Transport] = js.native
  def sshWithPaths(owner: nodegitLib.remoteMod.Remote, payload: nodegitLib.strDashArrayMod.Strarray): stdLib.Promise[nodegitLib.transportMod.Transport] = js.native
  def unregister(prefix: java.lang.String): scala.Double = js.native
}

