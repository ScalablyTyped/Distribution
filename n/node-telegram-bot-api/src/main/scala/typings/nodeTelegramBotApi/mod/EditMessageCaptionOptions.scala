package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditMessageCaptionOptions
  extends StObject
     with EditMessageReplyMarkupOptions {
  
  var reply_markup: js.UndefOr[InlineKeyboardMarkup] = js.undefined
}
object EditMessageCaptionOptions {
  
  inline def apply(): EditMessageCaptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditMessageCaptionOptions]
  }
  
  extension [Self <: EditMessageCaptionOptions](x: Self) {
    
    inline def setReply_markup(value: InlineKeyboardMarkup): Self = StObject.set(x, "reply_markup", value.asInstanceOf[js.Any])
    
    inline def setReply_markupUndefined: Self = StObject.set(x, "reply_markup", js.undefined)
  }
}
