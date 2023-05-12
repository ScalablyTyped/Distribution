package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendBasicOptions extends StObject {
  
  var allow_sending_without_reply: js.UndefOr[Boolean] = js.undefined
  
  var disable_notification: js.UndefOr[Boolean] = js.undefined
  
  var message_thread_id: js.UndefOr[Double] = js.undefined
  
  var protect_content: js.UndefOr[Boolean] = js.undefined
  
  var reply_markup: js.UndefOr[InlineKeyboardMarkup | ReplyKeyboardMarkup | ReplyKeyboardRemove | ForceReply] = js.undefined
  
  var reply_to_message_id: js.UndefOr[Double] = js.undefined
}
object SendBasicOptions {
  
  inline def apply(): SendBasicOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendBasicOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendBasicOptions] (val x: Self) extends AnyVal {
    
    inline def setAllow_sending_without_reply(value: Boolean): Self = StObject.set(x, "allow_sending_without_reply", value.asInstanceOf[js.Any])
    
    inline def setAllow_sending_without_replyUndefined: Self = StObject.set(x, "allow_sending_without_reply", js.undefined)
    
    inline def setDisable_notification(value: Boolean): Self = StObject.set(x, "disable_notification", value.asInstanceOf[js.Any])
    
    inline def setDisable_notificationUndefined: Self = StObject.set(x, "disable_notification", js.undefined)
    
    inline def setMessage_thread_id(value: Double): Self = StObject.set(x, "message_thread_id", value.asInstanceOf[js.Any])
    
    inline def setMessage_thread_idUndefined: Self = StObject.set(x, "message_thread_id", js.undefined)
    
    inline def setProtect_content(value: Boolean): Self = StObject.set(x, "protect_content", value.asInstanceOf[js.Any])
    
    inline def setProtect_contentUndefined: Self = StObject.set(x, "protect_content", js.undefined)
    
    inline def setReply_markup(value: InlineKeyboardMarkup | ReplyKeyboardMarkup | ReplyKeyboardRemove | ForceReply): Self = StObject.set(x, "reply_markup", value.asInstanceOf[js.Any])
    
    inline def setReply_markupUndefined: Self = StObject.set(x, "reply_markup", js.undefined)
    
    inline def setReply_to_message_id(value: Double): Self = StObject.set(x, "reply_to_message_id", value.asInstanceOf[js.Any])
    
    inline def setReply_to_message_idUndefined: Self = StObject.set(x, "reply_to_message_id", js.undefined)
  }
}
