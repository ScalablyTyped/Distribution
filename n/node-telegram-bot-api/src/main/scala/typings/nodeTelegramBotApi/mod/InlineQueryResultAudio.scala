package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.audio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineQueryResultAudio
  extends StObject
     with InlineQueryResultBase
     with InlineQueryResult {
  
  var audio_duration: js.UndefOr[Double] = js.undefined
  
  var audio_url: String
  
  var caption: js.UndefOr[String] = js.undefined
  
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  
  var performer: js.UndefOr[String] = js.undefined
  
  var title: String
  
  var `type`: audio
}
object InlineQueryResultAudio {
  
  inline def apply(audio_url: String, id: String, title: String): InlineQueryResultAudio = {
    val __obj = js.Dynamic.literal(audio_url = audio_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("audio")
    __obj.asInstanceOf[InlineQueryResultAudio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlineQueryResultAudio] (val x: Self) extends AnyVal {
    
    inline def setAudio_duration(value: Double): Self = StObject.set(x, "audio_duration", value.asInstanceOf[js.Any])
    
    inline def setAudio_durationUndefined: Self = StObject.set(x, "audio_duration", js.undefined)
    
    inline def setAudio_url(value: String): Self = StObject.set(x, "audio_url", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setInput_message_content(value: InputMessageContent): Self = StObject.set(x, "input_message_content", value.asInstanceOf[js.Any])
    
    inline def setInput_message_contentUndefined: Self = StObject.set(x, "input_message_content", js.undefined)
    
    inline def setPerformer(value: String): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: audio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
