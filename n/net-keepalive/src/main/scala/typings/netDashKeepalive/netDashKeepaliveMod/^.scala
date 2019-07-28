package typings.netDashKeepalive.netDashKeepaliveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("net-keepalive", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def setKeepAliveInterval(socket: NodeJSSocketWithFileDescriptor, intvl: Double): Double = js.native
  def setKeepAliveProbes(socket: NodeJSSocketWithFileDescriptor, cnt: Double): Double = js.native
}

