package typings.node.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.node.netMod.TcpNetConnectOpts
  - typings.node.netMod.IpcNetConnectOpts
*/
trait NetConnectOpts extends js.Object

object NetConnectOpts {
  @scala.inline
  def TcpNetConnectOpts(port: Double): NetConnectOpts = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetConnectOpts]
  }
  @scala.inline
  def IpcNetConnectOpts(path: String): NetConnectOpts = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetConnectOpts]
  }
}

