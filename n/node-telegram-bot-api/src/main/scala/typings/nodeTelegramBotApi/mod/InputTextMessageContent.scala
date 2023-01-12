package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped object */ trait InputTextMessageContent extends StObject {
  
  var disable_web_page_preview: js.UndefOr[Boolean] = js.undefined
  
  var message_text: String
  
  var parse_mode: js.UndefOr[ParseMode] = js.undefined
}
object InputTextMessageContent {
  
  inline def apply(message_text: String): InputTextMessageContent = {
    val __obj = js.Dynamic.literal(message_text = message_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputTextMessageContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputTextMessageContent] (val x: Self) extends AnyVal {
    
    inline def setDisable_web_page_preview(value: Boolean): Self = StObject.set(x, "disable_web_page_preview", value.asInstanceOf[js.Any])
    
    inline def setDisable_web_page_previewUndefined: Self = StObject.set(x, "disable_web_page_preview", js.undefined)
    
    inline def setMessage_text(value: String): Self = StObject.set(x, "message_text", value.asInstanceOf[js.Any])
    
    inline def setParse_mode(value: ParseMode): Self = StObject.set(x, "parse_mode", value.asInstanceOf[js.Any])
    
    inline def setParse_modeUndefined: Self = StObject.set(x, "parse_mode", js.undefined)
  }
}
