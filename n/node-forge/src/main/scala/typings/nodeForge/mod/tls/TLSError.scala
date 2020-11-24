package typings.nodeForge.mod.tls

import typings.nodeForge.nodeForgeStrings.client
import typings.nodeForge.nodeForgeStrings.server
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TLSError extends Error {
  
  var alert: Alert = js.native
  
  var origin: server | client = js.native
  
  var send: Boolean = js.native
}
object TLSError {
  
  @scala.inline
  def apply(alert: Alert, message: String, name: String, origin: server | client, send: Boolean): TLSError = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], send = send.asInstanceOf[js.Any])
    __obj.asInstanceOf[TLSError]
  }
  
  @scala.inline
  implicit class TLSErrorOps[Self <: TLSError] (val x: Self) extends AnyVal {
    
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
    def setAlert(value: Alert): Self = this.set("alert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: server | client): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSend(value: Boolean): Self = this.set("send", value.asInstanceOf[js.Any])
  }
}
