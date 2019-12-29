package typings.netDashKeepalive

import typings.node.NodeJS.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("net-keepalive", JSImport.Namespace)
@js.native
object netDashKeepaliveMod extends js.Object {
  def setKeepAliveInterval(socket: NodeJSSocketWithFileDescriptor, intvl: Double): Double = js.native
  def setKeepAliveProbes(socket: NodeJSSocketWithFileDescriptor, cnt: Double): Double = js.native
  type NodeJSSocketWithFileDescriptor = Socket | Anon_Handle
}

