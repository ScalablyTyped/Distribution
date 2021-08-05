package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputMediaBase extends StObject {
  
  var caption: js.UndefOr[String] = js.undefined
  
  var media: String
  
  var parse_mode: js.UndefOr[ParseMode] = js.undefined
}
object InputMediaBase {
  
  inline def apply(media: String): InputMediaBase = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputMediaBase]
  }
  
  extension [Self <: InputMediaBase](x: Self) {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setParse_mode(value: ParseMode): Self = StObject.set(x, "parse_mode", value.asInstanceOf[js.Any])
    
    inline def setParse_modeUndefined: Self = StObject.set(x, "parse_mode", js.undefined)
  }
}
