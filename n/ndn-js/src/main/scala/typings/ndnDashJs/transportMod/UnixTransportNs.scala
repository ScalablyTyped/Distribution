package typings.ndnDashJs.transportMod

import typings.ndnDashJs.transportMod.UnixTransportNs.ConnectionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/transport", "UnixTransport")
@js.native
object UnixTransportNs extends js.Object {
  @js.native
  class ConnectionInfo protected () extends TransportConnectionInfo {
    def this(filePath: String) = this()
    def equals(other: ConnectionInfo): Boolean = js.native
  }
  
}

