package typings.ndnJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ndn-js", "TcpTransport")
@js.native
open class TcpTransport ()
  extends typings.ndnJs.transportMod.TcpTransport
object TcpTransport {
  
  @JSImport("ndn-js", "TcpTransport.ConnectionInfo")
  @js.native
  open class ConnectionInfo protected ()
    extends typings.ndnJs.transportMod.TcpTransport.ConnectionInfo {
    def this(host: String, port: Double) = this()
  }
}
