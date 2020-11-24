package typings.meteor.meteorMod.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Connection **/
@js.native
trait Connection extends js.Object {
  
  var clientAddress: String = js.native
  
  def close(): Unit = js.native
  
  var httpHeaders: js.Object = js.native
  
  var id: String = js.native
  
  def onClose(callback: js.Function0[Unit]): Unit = js.native
}
object Connection {
  
  @scala.inline
  def apply(
    clientAddress: String,
    close: () => Unit,
    httpHeaders: js.Object,
    id: String,
    onClose: js.Function0[Unit] => Unit
  ): Connection = {
    val __obj = js.Dynamic.literal(clientAddress = clientAddress.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), httpHeaders = httpHeaders.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onClose = js.Any.fromFunction1(onClose))
    __obj.asInstanceOf[Connection]
  }
  
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
    
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
    def setClientAddress(value: String): Self = this.set("clientAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHttpHeaders(value: js.Object): Self = this.set("httpHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClose(value: js.Function0[Unit] => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
  }
}
