package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineQueryResultLocationBase extends InlineQueryResultBase {
  
  var input_message_content: js.UndefOr[InputMessageContent] = js.native
  
  var latitude: Double = js.native
  
  var longitude: Double = js.native
  
  var thumb_height: js.UndefOr[Double] = js.native
  
  var thumb_url: js.UndefOr[String] = js.native
  
  var thumb_width: js.UndefOr[Double] = js.native
  
  var title: String = js.native
}
object InlineQueryResultLocationBase {
  
  @scala.inline
  def apply(id: String, latitude: Double, longitude: Double, title: String): InlineQueryResultLocationBase = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultLocationBase]
  }
  
  @scala.inline
  implicit class InlineQueryResultLocationBaseMutableBuilder[Self <: InlineQueryResultLocationBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput_message_content(value: InputMessageContent): Self = StObject.set(x, "input_message_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_message_contentUndefined: Self = StObject.set(x, "input_message_content", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumb_height(value: Double): Self = StObject.set(x, "thumb_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumb_heightUndefined: Self = StObject.set(x, "thumb_height", js.undefined)
    
    @scala.inline
    def setThumb_url(value: String): Self = StObject.set(x, "thumb_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumb_urlUndefined: Self = StObject.set(x, "thumb_url", js.undefined)
    
    @scala.inline
    def setThumb_width(value: Double): Self = StObject.set(x, "thumb_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumb_widthUndefined: Self = StObject.set(x, "thumb_width", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
