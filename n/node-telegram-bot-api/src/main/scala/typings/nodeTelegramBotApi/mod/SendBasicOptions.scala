package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendBasicOptions extends StObject {
  
  var disable_notification: js.UndefOr[Boolean] = js.undefined
  
  var reply_markup: js.UndefOr[InlineKeyboardMarkup | ReplyKeyboardMarkup | ReplyKeyboardRemove | ForceReply] = js.undefined
  
  var reply_to_message_id: js.UndefOr[Double] = js.undefined
}
object SendBasicOptions {
  
  inline def apply(): SendBasicOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendBasicOptions]
  }
  
  extension [Self <: SendBasicOptions](x: Self) {
    
    inline def setDisable_notification(value: Boolean): Self = StObject.set(x, "disable_notification", value.asInstanceOf[js.Any])
    
    inline def setDisable_notificationUndefined: Self = StObject.set(x, "disable_notification", js.undefined)
    
    inline def setReply_markup(value: InlineKeyboardMarkup | ReplyKeyboardMarkup | ReplyKeyboardRemove | ForceReply): Self = StObject.set(x, "reply_markup", value.asInstanceOf[js.Any])
    
    inline def setReply_markupUndefined: Self = StObject.set(x, "reply_markup", js.undefined)
    
    inline def setReply_to_message_id(value: Double): Self = StObject.set(x, "reply_to_message_id", value.asInstanceOf[js.Any])
    
    inline def setReply_to_message_idUndefined: Self = StObject.set(x, "reply_to_message_id", js.undefined)
  }
}
