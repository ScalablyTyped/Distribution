package typings.ndnJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ndn-js", "WebSocketTransport")
@js.native
class WebSocketTransport ()
  extends typings.ndnJs.transportMod.WebSocketTransport
object WebSocketTransport {
  
  @JSImport("ndn-js", "WebSocketTransport.ConnectionInfo")
  @js.native
  class ConnectionInfo protected ()
    extends typings.ndnJs.transportMod.WebSocketTransport.ConnectionInfo {
    def this(hostOrUri: String) = this()
    def this(hostOrUri: String, port: Double) = this()
  }
}
