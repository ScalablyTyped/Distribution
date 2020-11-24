package typings.ndnJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ndn-js", "TcpTransport")
@js.native
class TcpTransport ()
  extends typings.ndnJs.transportMod.Transport
@JSImport("ndn-js", "TcpTransport")
@js.native
object TcpTransport extends js.Object {
  
  @js.native
  class ConnectionInfo protected ()
    extends typings.ndnJs.transportMod.TcpTransport.ConnectionInfo {
    def this(host: String, port: Double) = this()
  }
}
