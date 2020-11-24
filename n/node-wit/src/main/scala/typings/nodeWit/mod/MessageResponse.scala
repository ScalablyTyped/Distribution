package typings.nodeWit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageResponse extends js.Object {
  
  var _text: String = js.native
  
  var entities: js.Any = js.native
  
  var msg_id: String = js.native
}
object MessageResponse {
  
  @scala.inline
  def apply(_text: String, entities: js.Any, msg_id: String): MessageResponse = {
    val __obj = js.Dynamic.literal(_text = _text.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], msg_id = msg_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageResponse]
  }
  
  @scala.inline
  implicit class MessageResponseOps[Self <: MessageResponse] (val x: Self) extends AnyVal {
    
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
    def set_text(value: String): Self = this.set("_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntities(value: js.Any): Self = this.set("entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsg_id(value: String): Self = this.set("msg_id", value.asInstanceOf[js.Any])
  }
}
