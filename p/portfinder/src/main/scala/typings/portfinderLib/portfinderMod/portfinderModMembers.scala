package typings
package portfinderLib.portfinderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("portfinder", JSImport.Namespace)
@js.native
object portfinderModMembers extends js.Object {
  var basePort: scala.Double = js.native
  def getPort(callback: portfinderLib.PortfinderCallback): scala.Unit = js.native
  def getPort(options: PortFinderOptions, callback: portfinderLib.PortfinderCallback): scala.Unit = js.native
  def getPortPromise(): stdLib.Promise[scala.Double] = js.native
  def getPortPromise(options: PortFinderOptions): stdLib.Promise[scala.Double] = js.native
}

