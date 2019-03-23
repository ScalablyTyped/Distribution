package typings
package ndnDashJsLib.ndnDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "TcpTransport")
@js.native
object TcpTransportNs extends js.Object {
  @js.native
  class ConnectionInfo protected ()
    extends ndnDashJsLib.transportMod.TcpTransportNs.ConnectionInfo {
    def this(host: java.lang.String, port: scala.Double) = this()
  }
  
}

