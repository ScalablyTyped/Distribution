package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.gif
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineQueryResultCachedGif
  extends StObject
     with InlineQueryResultBase
     with InlineQueryResult {
  
  var caption: js.UndefOr[String] = js.undefined
  
  var gif_file_id: String
  
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: gif
}
object InlineQueryResultCachedGif {
  
  @scala.inline
  def apply(gif_file_id: String, id: String): InlineQueryResultCachedGif = {
    val __obj = js.Dynamic.literal(gif_file_id = gif_file_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("gif")
    __obj.asInstanceOf[InlineQueryResultCachedGif]
  }
  
  @scala.inline
  implicit class InlineQueryResultCachedGifMutableBuilder[Self <: InlineQueryResultCachedGif] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setGif_file_id(value: String): Self = StObject.set(x, "gif_file_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_message_content(value: InputMessageContent): Self = StObject.set(x, "input_message_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_message_contentUndefined: Self = StObject.set(x, "input_message_content", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: gif): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
