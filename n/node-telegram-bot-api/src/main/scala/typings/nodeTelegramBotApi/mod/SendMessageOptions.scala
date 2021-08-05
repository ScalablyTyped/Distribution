package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendMessageOptions
  extends StObject
     with SendBasicOptions {
  
  var disable_web_page_preview: js.UndefOr[Boolean] = js.undefined
  
  var parse_mode: js.UndefOr[ParseMode] = js.undefined
}
object SendMessageOptions {
  
  inline def apply(): SendMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendMessageOptions]
  }
  
  extension [Self <: SendMessageOptions](x: Self) {
    
    inline def setDisable_web_page_preview(value: Boolean): Self = StObject.set(x, "disable_web_page_preview", value.asInstanceOf[js.Any])
    
    inline def setDisable_web_page_previewUndefined: Self = StObject.set(x, "disable_web_page_preview", js.undefined)
    
    inline def setParse_mode(value: ParseMode): Self = StObject.set(x, "parse_mode", value.asInstanceOf[js.Any])
    
    inline def setParse_modeUndefined: Self = StObject.set(x, "parse_mode", js.undefined)
  }
}
