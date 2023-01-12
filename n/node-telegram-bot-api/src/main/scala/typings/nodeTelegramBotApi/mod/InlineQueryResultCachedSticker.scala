package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.sticker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineQueryResultCachedSticker
  extends StObject
     with InlineQueryResultBase
     with InlineQueryResult {
  
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  
  var sticker_file_id: String
  
  var `type`: sticker
}
object InlineQueryResultCachedSticker {
  
  inline def apply(id: String, sticker_file_id: String): InlineQueryResultCachedSticker = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sticker_file_id = sticker_file_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("sticker")
    __obj.asInstanceOf[InlineQueryResultCachedSticker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlineQueryResultCachedSticker] (val x: Self) extends AnyVal {
    
    inline def setInput_message_content(value: InputMessageContent): Self = StObject.set(x, "input_message_content", value.asInstanceOf[js.Any])
    
    inline def setInput_message_contentUndefined: Self = StObject.set(x, "input_message_content", js.undefined)
    
    inline def setSticker_file_id(value: String): Self = StObject.set(x, "sticker_file_id", value.asInstanceOf[js.Any])
    
    inline def setType(value: sticker): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
