package typings
package ndnDashJsLib.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/transport", "UnixTransport")
@js.native
object UnixTransportNs extends js.Object {
  @js.native
  class ConnectionInfo protected ()
    extends ndnDashJsLib.transportMod.TransportConnectionInfo {
    def this(filePath: java.lang.String) = this()
    def equals(other: ConnectionInfo): scala.Boolean = js.native
  }
  
}

