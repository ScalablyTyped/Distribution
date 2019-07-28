package typings.ndnDashJs.transportMod

import typings.ndnDashJs.transportMod.TcpTransportNs.ConnectionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/transport", "TcpTransport")
@js.native
object TcpTransportNs extends js.Object {
  @js.native
  class ConnectionInfo protected () extends TransportConnectionInfo {
    def this(host: String, port: Double) = this()
    def equals(other: ConnectionInfo): Boolean = js.native
  }
  
}

