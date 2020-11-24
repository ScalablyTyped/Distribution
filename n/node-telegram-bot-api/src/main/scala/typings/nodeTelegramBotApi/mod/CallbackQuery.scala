package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallbackQuery extends js.Object {
  
  var chat_instance: String = js.native
  
  var data: js.UndefOr[String] = js.native
  
  var from: User = js.native
  
  var game_short_name: js.UndefOr[String] = js.native
  
  var id: String = js.native
  
  var inline_message_id: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[Message] = js.native
}
object CallbackQuery {
  
  @scala.inline
  def apply(chat_instance: String, from: User, id: String): CallbackQuery = {
    val __obj = js.Dynamic.literal(chat_instance = chat_instance.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackQuery]
  }
  
  @scala.inline
  implicit class CallbackQueryOps[Self <: CallbackQuery] (val x: Self) extends AnyVal {
    
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
    def setChat_instance(value: String): Self = this.set("chat_instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: User): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setGame_short_name(value: String): Self = this.set("game_short_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGame_short_name: Self = this.set("game_short_name", js.undefined)
    
    @scala.inline
    def setInline_message_id(value: String): Self = this.set("inline_message_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline_message_id: Self = this.set("inline_message_id", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
