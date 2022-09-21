package typings.node.netMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.node.netMod.TcpNetConnectOpts
  - typings.node.netMod.IpcNetConnectOpts
*/
trait NetConnectOpts extends StObject
object NetConnectOpts {
  
  inline def IpcNetConnectOpts(path: String): typings.node.netMod.IpcNetConnectOpts = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.node.netMod.IpcNetConnectOpts]
  }
  
  inline def TcpNetConnectOpts(port: Double): typings.node.netMod.TcpNetConnectOpts = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.node.netMod.TcpNetConnectOpts]
  }
}
