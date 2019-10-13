package typings.ndnDashJs.ndnDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "TcpTransport")
@js.native
class TcpTransport ()
  extends typings.ndnDashJs.transportMod.Transport

@JSImport("ndn-js", "TcpTransport")
@js.native
object TcpTransport extends js.Object {
  @js.native
  class ConnectionInfo protected ()
    extends typings.ndnDashJs.transportMod.TcpTransport.ConnectionInfo {
    def this(host: String, port: Double) = this()
  }
  
}

