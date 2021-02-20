package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineQueryResultVideo
  extends InlineQueryResultBase
     with InlineQueryResult {
  
  var caption: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var input_message_content: js.UndefOr[InputMessageContent] = js.native
  
  var mime_type: String = js.native
  
  var thumb_url: String = js.native
  
  var title: String = js.native
  
  var `type`: video = js.native
  
  var video_duration: js.UndefOr[Double] = js.native
  
  var video_height: js.UndefOr[Double] = js.native
  
  var video_url: String = js.native
  
  var video_width: js.UndefOr[Double] = js.native
}
object InlineQueryResultVideo {
  
  @scala.inline
  def apply(id: String, mime_type: String, thumb_url: String, title: String, `type`: video, video_url: String): InlineQueryResultVideo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mime_type = mime_type.asInstanceOf[js.Any], thumb_url = thumb_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], video_url = video_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultVideo]
  }
  
  @scala.inline
  implicit class InlineQueryResultVideoMutableBuilder[Self <: InlineQueryResultVideo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setInput_message_content(value: InputMessageContent): Self = StObject.set(x, "input_message_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_message_contentUndefined: Self = StObject.set(x, "input_message_content", js.undefined)
    
    @scala.inline
    def setMime_type(value: String): Self = StObject.set(x, "mime_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumb_url(value: String): Self = StObject.set(x, "thumb_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: video): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_duration(value: Double): Self = StObject.set(x, "video_duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_durationUndefined: Self = StObject.set(x, "video_duration", js.undefined)
    
    @scala.inline
    def setVideo_height(value: Double): Self = StObject.set(x, "video_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_heightUndefined: Self = StObject.set(x, "video_height", js.undefined)
    
    @scala.inline
    def setVideo_url(value: String): Self = StObject.set(x, "video_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_width(value: Double): Self = StObject.set(x, "video_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_widthUndefined: Self = StObject.set(x, "video_width", js.undefined)
  }
}
