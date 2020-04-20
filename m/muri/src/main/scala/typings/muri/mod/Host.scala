package typings.muri.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.muri.mod.DefaultHost
  - typings.muri.mod.SocketHost
*/
trait Host extends js.Object

object Host {
  @scala.inline
  def DefaultHost(host: String, port: Double): Host = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
  @scala.inline
  def SocketHost(ipc: String): Host = {
    val __obj = js.Dynamic.literal(ipc = ipc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
}

