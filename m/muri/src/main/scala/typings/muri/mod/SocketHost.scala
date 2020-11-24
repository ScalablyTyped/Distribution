package typings.muri.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketHost extends Host {
  
  var ipc: String = js.native
}
object SocketHost {
  
  @scala.inline
  def apply(ipc: String): SocketHost = {
    val __obj = js.Dynamic.literal(ipc = ipc.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketHost]
  }
  
  @scala.inline
  implicit class SocketHostOps[Self <: SocketHost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIpc(value: String): Self = this.set("ipc", value.asInstanceOf[js.Any])
  }
}
