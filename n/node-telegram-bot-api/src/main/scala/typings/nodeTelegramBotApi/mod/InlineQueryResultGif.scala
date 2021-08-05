package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.gif
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineQueryResultGif
  extends StObject
     with InlineQueryResultBase
     with InlineQueryResult {
  
  var caption: js.UndefOr[String] = js.undefined
  
  var gif_duration: js.UndefOr[Double] = js.undefined
  
  var gif_height: js.UndefOr[Double] = js.undefined
  
  var gif_url: String
  
  var gif_width: js.UndefOr[Double] = js.undefined
  
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  
  var thumb_url: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: gif
}
object InlineQueryResultGif {
  
  inline def apply(gif_url: String, id: String): InlineQueryResultGif = {
    val __obj = js.Dynamic.literal(gif_url = gif_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("gif")
    __obj.asInstanceOf[InlineQueryResultGif]
  }
  
  extension [Self <: InlineQueryResultGif](x: Self) {
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setGif_duration(value: Double): Self = StObject.set(x, "gif_duration", value.asInstanceOf[js.Any])
    
    inline def setGif_durationUndefined: Self = StObject.set(x, "gif_duration", js.undefined)
    
    inline def setGif_height(value: Double): Self = StObject.set(x, "gif_height", value.asInstanceOf[js.Any])
    
    inline def setGif_heightUndefined: Self = StObject.set(x, "gif_height", js.undefined)
    
    inline def setGif_url(value: String): Self = StObject.set(x, "gif_url", value.asInstanceOf[js.Any])
    
    inline def setGif_width(value: Double): Self = StObject.set(x, "gif_width", value.asInstanceOf[js.Any])
    
    inline def setGif_widthUndefined: Self = StObject.set(x, "gif_width", js.undefined)
    
    inline def setInput_message_content(value: InputMessageContent): Self = StObject.set(x, "input_message_content", value.asInstanceOf[js.Any])
    
    inline def setInput_message_contentUndefined: Self = StObject.set(x, "input_message_content", js.undefined)
    
    inline def setThumb_url(value: String): Self = StObject.set(x, "thumb_url", value.asInstanceOf[js.Any])
    
    inline def setThumb_urlUndefined: Self = StObject.set(x, "thumb_url", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: gif): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
