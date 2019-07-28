package typings.ndnDashJs.transportMod

import typings.ndnDashJs.transportMod.WebSocketTransportNs.ConnectionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/transport", "WebSocketTransport")
@js.native
object WebSocketTransportNs extends js.Object {
  @js.native
  class ConnectionInfo protected () extends TransportConnectionInfo {
    def this(hostOrUri: String) = this()
    def this(hostOrUri: String, port: Double) = this()
    def equals(other: ConnectionInfo): Boolean = js.native
  }
  
}

