package typings
package ndnDashJsLib.ndnDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "WebSocketTransport")
@js.native
object WebSocketTransportNs extends js.Object {
  @js.native
  class ConnectionInfo protected ()
    extends ndnDashJsLib.transportMod.WebSocketTransportNs.ConnectionInfo {
    def this(hostOrUri: java.lang.String) = this()
    def this(hostOrUri: java.lang.String, port: scala.Double) = this()
  }
  
}

