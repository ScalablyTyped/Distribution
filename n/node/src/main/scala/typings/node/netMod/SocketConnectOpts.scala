package typings.node.netMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.node.netMod.TcpSocketConnectOpts
  - typings.node.netMod.IpcSocketConnectOpts
*/
trait SocketConnectOpts extends StObject
object SocketConnectOpts {
  
  inline def IpcSocketConnectOpts(path: String): typings.node.netMod.IpcSocketConnectOpts = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.node.netMod.IpcSocketConnectOpts]
  }
  
  inline def TcpSocketConnectOpts(port: Double): typings.node.netMod.TcpSocketConnectOpts = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.node.netMod.TcpSocketConnectOpts]
  }
}
