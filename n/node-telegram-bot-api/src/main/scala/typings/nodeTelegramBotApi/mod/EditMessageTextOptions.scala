package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditMessageTextOptions
  extends StObject
     with EditMessageCaptionOptions {
  
  var disable_web_page_preview: js.UndefOr[Boolean] = js.undefined
  
  var parse_mode: js.UndefOr[ParseMode] = js.undefined
}
object EditMessageTextOptions {
  
  @scala.inline
  def apply(): EditMessageTextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditMessageTextOptions]
  }
  
  @scala.inline
  implicit class EditMessageTextOptionsMutableBuilder[Self <: EditMessageTextOptions] (val x: Self) extends AnyVal {
    
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
