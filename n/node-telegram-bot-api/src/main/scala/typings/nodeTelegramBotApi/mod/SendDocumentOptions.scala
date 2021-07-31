package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendDocumentOptions
  extends StObject
     with SendBasicOptions {
  
  var caption: js.UndefOr[String] = js.undefined
  
  var parse_mode: js.UndefOr[ParseMode] = js.undefined
}
object SendDocumentOptions {
  
  @scala.inline
  def apply(): SendDocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendDocumentOptions]
  }
  
  @scala.inline
  implicit class SendDocumentOptionsMutableBuilder[Self <: SendDocumentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setParse_mode(value: ParseMode): Self = StObject.set(x, "parse_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse_modeUndefined: Self = StObject.set(x, "parse_mode", js.undefined)
  }
}
