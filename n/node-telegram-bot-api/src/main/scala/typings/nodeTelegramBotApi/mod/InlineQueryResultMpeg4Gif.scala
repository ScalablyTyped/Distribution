package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.mpeg4_gif
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineQueryResultMpeg4Gif
  extends StObject
     with InlineQueryResultBase
     with InlineQueryResult {
  
  var caption: js.UndefOr[String] = js.undefined
  
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  
  var mpeg4_duration: js.UndefOr[Double] = js.undefined
  
  var mpeg4_height: js.UndefOr[Double] = js.undefined
  
  var mpeg4_url: String
  
  var mpeg4_width: js.UndefOr[Double] = js.undefined
  
  var thumb_url: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: mpeg4_gif
}
object InlineQueryResultMpeg4Gif {
  
  inline def apply(id: String, mpeg4_url: String): InlineQueryResultMpeg4Gif = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mpeg4_url = mpeg4_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("mpeg4_gif")
    __obj.asInstanceOf[InlineQueryResultMpeg4Gif]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlineQueryResultMpeg4Gif] (val x: Self) extends AnyVal {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setInput_message_content(value: InputMessageContent): Self = StObject.set(x, "input_message_content", value.asInstanceOf[js.Any])
    
    inline def setInput_message_contentUndefined: Self = StObject.set(x, "input_message_content", js.undefined)
    
    inline def setMpeg4_duration(value: Double): Self = StObject.set(x, "mpeg4_duration", value.asInstanceOf[js.Any])
    
    inline def setMpeg4_durationUndefined: Self = StObject.set(x, "mpeg4_duration", js.undefined)
    
    inline def setMpeg4_height(value: Double): Self = StObject.set(x, "mpeg4_height", value.asInstanceOf[js.Any])
    
    inline def setMpeg4_heightUndefined: Self = StObject.set(x, "mpeg4_height", js.undefined)
    
    inline def setMpeg4_url(value: String): Self = StObject.set(x, "mpeg4_url", value.asInstanceOf[js.Any])
    
    inline def setMpeg4_width(value: Double): Self = StObject.set(x, "mpeg4_width", value.asInstanceOf[js.Any])
    
    inline def setMpeg4_widthUndefined: Self = StObject.set(x, "mpeg4_width", js.undefined)
    
    inline def setThumb_url(value: String): Self = StObject.set(x, "thumb_url", value.asInstanceOf[js.Any])
    
    inline def setThumb_urlUndefined: Self = StObject.set(x, "thumb_url", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: mpeg4_gif): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
