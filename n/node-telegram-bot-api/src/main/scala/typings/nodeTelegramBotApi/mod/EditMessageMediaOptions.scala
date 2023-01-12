package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditMessageMediaOptions extends StObject {
  
  var chat_id: js.UndefOr[Double | String] = js.undefined
  
  var inline_message_id: js.UndefOr[String] = js.undefined
  
  var message_id: js.UndefOr[Double] = js.undefined
  
  var reply_markup: js.UndefOr[InlineKeyboardMarkup] = js.undefined
}
object EditMessageMediaOptions {
  
  inline def apply(): EditMessageMediaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditMessageMediaOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditMessageMediaOptions] (val x: Self) extends AnyVal {
    
    inline def setChat_id(value: Double | String): Self = StObject.set(x, "chat_id", value.asInstanceOf[js.Any])
    
    inline def setChat_idUndefined: Self = StObject.set(x, "chat_id", js.undefined)
    
    inline def setInline_message_id(value: String): Self = StObject.set(x, "inline_message_id", value.asInstanceOf[js.Any])
    
    inline def setInline_message_idUndefined: Self = StObject.set(x, "inline_message_id", js.undefined)
    
    inline def setMessage_id(value: Double): Self = StObject.set(x, "message_id", value.asInstanceOf[js.Any])
    
    inline def setMessage_idUndefined: Self = StObject.set(x, "message_id", js.undefined)
    
    inline def setReply_markup(value: InlineKeyboardMarkup): Self = StObject.set(x, "reply_markup", value.asInstanceOf[js.Any])
    
    inline def setReply_markupUndefined: Self = StObject.set(x, "reply_markup", js.undefined)
  }
}
