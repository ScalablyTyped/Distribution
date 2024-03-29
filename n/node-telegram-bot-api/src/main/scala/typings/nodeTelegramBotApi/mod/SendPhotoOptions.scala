package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendPhotoOptions
  extends StObject
     with SendBasicOptions {
  
  var caption: js.UndefOr[String] = js.undefined
  
  var has_spoiler: js.UndefOr[Boolean] = js.undefined
  
  var parse_mode: js.UndefOr[ParseMode] = js.undefined
}
object SendPhotoOptions {
  
  inline def apply(): SendPhotoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendPhotoOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendPhotoOptions] (val x: Self) extends AnyVal {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setHas_spoiler(value: Boolean): Self = StObject.set(x, "has_spoiler", value.asInstanceOf[js.Any])
    
    inline def setHas_spoilerUndefined: Self = StObject.set(x, "has_spoiler", js.undefined)
    
    inline def setParse_mode(value: ParseMode): Self = StObject.set(x, "parse_mode", value.asInstanceOf[js.Any])
    
    inline def setParse_modeUndefined: Self = StObject.set(x, "parse_mode", js.undefined)
  }
}
