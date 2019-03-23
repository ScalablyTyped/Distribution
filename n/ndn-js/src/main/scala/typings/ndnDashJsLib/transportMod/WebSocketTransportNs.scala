package typings
package ndnDashJsLib.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/transport", "WebSocketTransport")
@js.native
object WebSocketTransportNs extends js.Object {
  @js.native
  class ConnectionInfo protected ()
    extends ndnDashJsLib.transportMod.TransportConnectionInfo {
    def this(hostOrUri: java.lang.String) = this()
    def this(hostOrUri: java.lang.String, port: scala.Double) = this()
    def equals(other: ConnectionInfo): scala.Boolean = js.native
  }
  
}

