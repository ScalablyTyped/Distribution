package typings
package ndnDashJsLib.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/transport", "TcpTransport")
@js.native
object TcpTransportNs extends js.Object {
  @js.native
  class ConnectionInfo protected ()
    extends ndnDashJsLib.transportMod.TransportConnectionInfo {
    def this(host: java.lang.String, port: scala.Double) = this()
    def equals(other: ConnectionInfo): scala.Boolean = js.native
  }
  
}

