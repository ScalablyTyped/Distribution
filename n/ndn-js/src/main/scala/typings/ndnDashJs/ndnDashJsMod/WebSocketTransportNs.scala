package typings.ndnDashJs.ndnDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "WebSocketTransport")
@js.native
object WebSocketTransportNs extends js.Object {
  @js.native
  class ConnectionInfo protected ()
    extends typings.ndnDashJs.transportMod.WebSocketTransportNs.ConnectionInfo {
    def this(hostOrUri: String) = this()
    def this(hostOrUri: String, port: Double) = this()
  }
  
}

