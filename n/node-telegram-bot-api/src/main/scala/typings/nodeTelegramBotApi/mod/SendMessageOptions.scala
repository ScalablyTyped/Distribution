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
  
  @scala.inline
  def apply(): SendMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendMessageOptions]
  }
  
  @scala.inline
  implicit class SendMessageOptionsMutableBuilder[Self <: SendMessageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisable_web_page_preview(value: Boolean): Self = StObject.set(x, "disable_web_page_preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisable_web_page_previewUndefined: Self = StObject.set(x, "disable_web_page_preview", js.undefined)
    
    @scala.inline
    def setParse_mode(value: ParseMode): Self = StObject.set(x, "parse_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse_modeUndefined: Self = StObject.set(x, "parse_mode", js.undefined)
  }
}
