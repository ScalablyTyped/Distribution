package typings.nodeRedRuntime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommsConnection extends js.Object {
  
  def send(): Unit = js.native
  
  var session: String = js.native
  
  var user: js.Object = js.native
}
object CommsConnection {
  
  @scala.inline
  def apply(send: () => Unit, session: String, user: js.Object): CommsConnection = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction0(send), session = session.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommsConnection]
  }
  
  @scala.inline
  implicit class CommsConnectionOps[Self <: CommsConnection] (val x: Self) extends AnyVal {
    
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
    def setSend(value: () => Unit): Self = this.set("send", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSession(value: String): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: js.Object): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
