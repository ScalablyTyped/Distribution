package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendPhotoOptions extends SendBasicOptions {
  
  var caption: js.UndefOr[String] = js.native
  
  var parse_mode: js.UndefOr[ParseMode] = js.native
}
object SendPhotoOptions {
  
  @scala.inline
  def apply(): SendPhotoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendPhotoOptions]
  }
  
  @scala.inline
  implicit class SendPhotoOptionsMutableBuilder[Self <: SendPhotoOptions] (val x: Self) extends AnyVal {
    
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
