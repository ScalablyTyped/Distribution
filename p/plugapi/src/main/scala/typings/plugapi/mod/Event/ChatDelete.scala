package typings.plugapi.mod.Event

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatDelete extends js.Object {
  
  var chatID: String = js.native
  
  var mi: Double = js.native
}
object ChatDelete {
  
  @scala.inline
  def apply(chatID: String, mi: Double): ChatDelete = {
    val __obj = js.Dynamic.literal(chatID = chatID.asInstanceOf[js.Any], mi = mi.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatDelete]
  }
  
  @scala.inline
  implicit class ChatDeleteOps[Self <: ChatDelete] (val x: Self) extends AnyVal {
    
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
    def setChatID(value: String): Self = this.set("chatID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMi(value: Double): Self = this.set("mi", value.asInstanceOf[js.Any])
  }
}
