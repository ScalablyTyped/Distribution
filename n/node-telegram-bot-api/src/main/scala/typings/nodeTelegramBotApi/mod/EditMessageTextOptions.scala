package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditMessageTextOptions
  extends StObject
     with EditMessageCaptionOptions {
  
  var disable_web_page_preview: js.UndefOr[Boolean] = js.undefined
}
object EditMessageTextOptions {
  
  inline def apply(): EditMessageTextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditMessageTextOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditMessageTextOptions] (val x: Self) extends AnyVal {
    
    inline def setDisable_web_page_preview(value: Boolean): Self = StObject.set(x, "disable_web_page_preview", value.asInstanceOf[js.Any])
    
    inline def setDisable_web_page_previewUndefined: Self = StObject.set(x, "disable_web_page_preview", js.undefined)
  }
}
