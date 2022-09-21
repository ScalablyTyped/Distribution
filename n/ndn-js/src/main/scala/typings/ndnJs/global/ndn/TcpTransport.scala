package typings.ndnJs.global.ndn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ndn.TcpTransport")
@js.native
open class TcpTransport ()
  extends typings.ndnJs.mod.TcpTransport
object TcpTransport {
  
  @JSGlobal("ndn.TcpTransport.ConnectionInfo")
  @js.native
  open class ConnectionInfo protected ()
    extends typings.ndnJs.mod.TcpTransport.ConnectionInfo {
    def this(host: String, port: Double) = this()
  }
}
