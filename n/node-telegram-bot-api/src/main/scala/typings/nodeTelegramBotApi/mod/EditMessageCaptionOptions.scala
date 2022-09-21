package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditMessageCaptionOptions
  extends StObject
     with EditMessageReplyMarkupOptions {
  
  var caption_entities: js.UndefOr[js.Array[MessageEntity]] = js.undefined
  
  var parse_mode: js.UndefOr[ParseMode] = js.undefined
  
  var reply_markup: js.UndefOr[InlineKeyboardMarkup] = js.undefined
}
object EditMessageCaptionOptions {
  
  inline def apply(): EditMessageCaptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditMessageCaptionOptions]
  }
  
  extension [Self <: EditMessageCaptionOptions](x: Self) {
    
    inline def setCaption_entities(value: js.Array[MessageEntity]): Self = StObject.set(x, "caption_entities", value.asInstanceOf[js.Any])
    
    inline def setCaption_entitiesUndefined: Self = StObject.set(x, "caption_entities", js.undefined)
    
    inline def setCaption_entitiesVarargs(value: MessageEntity*): Self = StObject.set(x, "caption_entities", js.Array(value*))
    
    inline def setParse_mode(value: ParseMode): Self = StObject.set(x, "parse_mode", value.asInstanceOf[js.Any])
    
    inline def setParse_modeUndefined: Self = StObject.set(x, "parse_mode", js.undefined)
    
    inline def setReply_markup(value: InlineKeyboardMarkup): Self = StObject.set(x, "reply_markup", value.asInstanceOf[js.Any])
    
    inline def setReply_markupUndefined: Self = StObject.set(x, "reply_markup", js.undefined)
  }
}
