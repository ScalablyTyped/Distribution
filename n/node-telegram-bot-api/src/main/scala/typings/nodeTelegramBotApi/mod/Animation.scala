package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation
  extends StObject
     with FileBase {
  
  var duration: Double
  
  var file_name: js.UndefOr[String] = js.undefined
  
  var height: Double
  
  var mime_type: js.UndefOr[String] = js.undefined
  
  var thumb: js.UndefOr[PhotoSize] = js.undefined
  
  var width: Double
}
object Animation {
  
  inline def apply(duration: Double, file_id: String, file_unique_id: String, height: Double, width: Double): Animation = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], file_id = file_id.asInstanceOf[js.Any], file_unique_id = file_unique_id.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  
  extension [Self <: Animation](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setFile_name(value: String): Self = StObject.set(x, "file_name", value.asInstanceOf[js.Any])
    
    inline def setFile_nameUndefined: Self = StObject.set(x, "file_name", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMime_type(value: String): Self = StObject.set(x, "mime_type", value.asInstanceOf[js.Any])
    
    inline def setMime_typeUndefined: Self = StObject.set(x, "mime_type", js.undefined)
    
    inline def setThumb(value: PhotoSize): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
