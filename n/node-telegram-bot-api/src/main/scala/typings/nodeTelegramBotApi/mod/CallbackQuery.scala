package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackQuery extends StObject {
  
  var chat_instance: String
  
  var data: js.UndefOr[String] = js.undefined
  
  var from: User
  
  var game_short_name: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var inline_message_id: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[Message] = js.undefined
}
object CallbackQuery {
  
  @scala.inline
  def apply(chat_instance: String, from: User, id: String): CallbackQuery = {
    val __obj = js.Dynamic.literal(chat_instance = chat_instance.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackQuery]
  }
  
  @scala.inline
  implicit class CallbackQueryMutableBuilder[Self <: CallbackQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChat_instance(value: String): Self = StObject.set(x, "chat_instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setFrom(value: User): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGame_short_name(value: String): Self = StObject.set(x, "game_short_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGame_short_nameUndefined: Self = StObject.set(x, "game_short_name", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInline_message_id(value: String): Self = StObject.set(x, "inline_message_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInline_message_idUndefined: Self = StObject.set(x, "inline_message_id", js.undefined)
    
    @scala.inline
    def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
