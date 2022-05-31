package typings.ndnJs.global.ndn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ndn.WebSocketTransport")
@js.native
class WebSocketTransport ()
  extends typings.ndnJs.mod.WebSocketTransport
object WebSocketTransport {
  
  @JSGlobal("ndn.WebSocketTransport.ConnectionInfo")
  @js.native
  class ConnectionInfo protected ()
    extends typings.ndnJs.mod.WebSocketTransport.ConnectionInfo {
    def this(hostOrUri: String) = this()
    def this(hostOrUri: String, port: Double) = this()
  }
}
