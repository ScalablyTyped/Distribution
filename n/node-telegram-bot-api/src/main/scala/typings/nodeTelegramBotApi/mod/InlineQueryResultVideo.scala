package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineQueryResultVideo
  extends StObject
     with InlineQueryResultBase
     with InlineQueryResult {
  
  var caption: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  
  var mime_type: String
  
  var thumb_url: String
  
  var title: String
  
  var `type`: video
  
  var video_duration: js.UndefOr[Double] = js.undefined
  
  var video_height: js.UndefOr[Double] = js.undefined
  
  var video_url: String
  
  var video_width: js.UndefOr[Double] = js.undefined
}
object InlineQueryResultVideo {
  
  inline def apply(id: String, mime_type: String, thumb_url: String, title: String, video_url: String): InlineQueryResultVideo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], thumb_url = thumb_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], video_url = video_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("video")
    __obj.asInstanceOf[InlineQueryResultVideo]
  }
  
  extension [Self <: InlineQueryResultVideo](x: Self) {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInput_message_content(value: InputMessageContent): Self = StObject.set(x, "input_message_content", value.asInstanceOf[js.Any])
    
    inline def setInput_message_contentUndefined: Self = StObject.set(x, "input_message_content", js.undefined)
    
    inline def setMime_type(value: String): Self = StObject.set(x, "mime_type", value.asInstanceOf[js.Any])
    
    inline def setThumb_url(value: String): Self = StObject.set(x, "thumb_url", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: video): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVideo_duration(value: Double): Self = StObject.set(x, "video_duration", value.asInstanceOf[js.Any])
    
    inline def setVideo_durationUndefined: Self = StObject.set(x, "video_duration", js.undefined)
    
    inline def setVideo_height(value: Double): Self = StObject.set(x, "video_height", value.asInstanceOf[js.Any])
    
    inline def setVideo_heightUndefined: Self = StObject.set(x, "video_height", js.undefined)
    
    inline def setVideo_url(value: String): Self = StObject.set(x, "video_url", value.asInstanceOf[js.Any])
    
    inline def setVideo_width(value: Double): Self = StObject.set(x, "video_width", value.asInstanceOf[js.Any])
    
    inline def setVideo_widthUndefined: Self = StObject.set(x, "video_width", js.undefined)
  }
}
