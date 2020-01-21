package typings.ndnJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "WebSocketTransport")
@js.native
class WebSocketTransport ()
  extends typings.ndnJs.transportMod.Transport

@JSImport("ndn-js", "WebSocketTransport")
@js.native
object WebSocketTransport extends js.Object {
  @js.native
  class ConnectionInfo protected ()
    extends typings.ndnJs.transportMod.WebSocketTransport.ConnectionInfo {
    def this(hostOrUri: String) = this()
    def this(hostOrUri: String, port: Double) = this()
  }
  
}

