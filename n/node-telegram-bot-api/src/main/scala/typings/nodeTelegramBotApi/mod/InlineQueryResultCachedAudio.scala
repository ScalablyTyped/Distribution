package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.audio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineQueryResultCachedAudio
  extends StObject
     with InlineQueryResultBase
     with InlineQueryResult {
  
  var audio_file_id: String
  
  var caption: js.UndefOr[String] = js.undefined
  
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  
  var `type`: audio
}
object InlineQueryResultCachedAudio {
  
  @scala.inline
  def apply(audio_file_id: String, id: String): InlineQueryResultCachedAudio = {
    val __obj = js.Dynamic.literal(audio_file_id = audio_file_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("audio")
    __obj.asInstanceOf[InlineQueryResultCachedAudio]
  }
  
  @scala.inline
  implicit class InlineQueryResultCachedAudioMutableBuilder[Self <: InlineQueryResultCachedAudio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio_file_id(value: String): Self = StObject.set(x, "audio_file_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setInput_message_content(value: InputMessageContent): Self = StObject.set(x, "input_message_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_message_contentUndefined: Self = StObject.set(x, "input_message_content", js.undefined)
    
    @scala.inline
    def setType(value: audio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
