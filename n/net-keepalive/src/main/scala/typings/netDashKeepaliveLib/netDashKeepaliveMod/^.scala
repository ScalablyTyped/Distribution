package typings
package netDashKeepaliveLib.netDashKeepaliveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("net-keepalive", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def setKeepAliveInterval(
    socket: netDashKeepaliveLib.netDashKeepaliveMod.NodeJSSocketWithFileDescriptor,
    intvl: scala.Double
  ): scala.Double = js.native
  def setKeepAliveProbes(socket: netDashKeepaliveLib.netDashKeepaliveMod.NodeJSSocketWithFileDescriptor, cnt: scala.Double): scala.Double = js.native
}

