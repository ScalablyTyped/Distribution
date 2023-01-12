package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineQueryResultLocationBase
  extends StObject
     with InlineQueryResultBase {
  
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  
  var latitude: Double
  
  var longitude: Double
  
  var thumb_height: js.UndefOr[Double] = js.undefined
  
  var thumb_url: js.UndefOr[String] = js.undefined
  
  var thumb_width: js.UndefOr[Double] = js.undefined
  
  var title: String
}
object InlineQueryResultLocationBase {
  
  inline def apply(id: String, latitude: Double, longitude: Double, title: String): InlineQueryResultLocationBase = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultLocationBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlineQueryResultLocationBase] (val x: Self) extends AnyVal {
    
    inline def setInput_message_content(value: InputMessageContent): Self = StObject.set(x, "input_message_content", value.asInstanceOf[js.Any])
    
    inline def setInput_message_contentUndefined: Self = StObject.set(x, "input_message_content", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setThumb_height(value: Double): Self = StObject.set(x, "thumb_height", value.asInstanceOf[js.Any])
    
    inline def setThumb_heightUndefined: Self = StObject.set(x, "thumb_height", js.undefined)
    
    inline def setThumb_url(value: String): Self = StObject.set(x, "thumb_url", value.asInstanceOf[js.Any])
    
    inline def setThumb_urlUndefined: Self = StObject.set(x, "thumb_url", js.undefined)
    
    inline def setThumb_width(value: Double): Self = StObject.set(x, "thumb_width", value.asInstanceOf[js.Any])
    
    inline def setThumb_widthUndefined: Self = StObject.set(x, "thumb_width", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
