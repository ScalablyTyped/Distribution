package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Transport")
@js.native
class Transport ()
  extends nodegitLib.transportMod.Transport

@JSImport("nodegit", "Transport")
@js.native
object Transport extends js.Object {
  def sshWithPaths(owner: nodegitLib.remoteMod.Remote, payload: java.lang.String): js.Promise[nodegitLib.transportMod.Transport] = js.native
  def sshWithPaths(owner: nodegitLib.remoteMod.Remote, payload: js.Array[java.lang.String]): js.Promise[nodegitLib.transportMod.Transport] = js.native
  def sshWithPaths(owner: nodegitLib.remoteMod.Remote, payload: nodegitLib.strDashArrayMod.Strarray): js.Promise[nodegitLib.transportMod.Transport] = js.native
  def unregister(prefix: java.lang.String): scala.Double = js.native
}

