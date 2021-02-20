package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.audio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineQueryResultAudio
  extends InlineQueryResultBase
     with InlineQueryResult {
  
  var audio_duration: js.UndefOr[Double] = js.native
  
  var audio_url: String = js.native
  
  var caption: js.UndefOr[String] = js.native
  
  var input_message_content: js.UndefOr[InputMessageContent] = js.native
  
  var performer: js.UndefOr[String] = js.native
  
  var title: String = js.native
  
  var `type`: audio = js.native
}
object InlineQueryResultAudio {
  
  @scala.inline
  def apply(audio_url: String, id: String, title: String, `type`: audio): InlineQueryResultAudio = {
    val __obj = js.Dynamic.literal(audio_url = audio_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultAudio]
  }
  
  @scala.inline
  implicit class InlineQueryResultAudioMutableBuilder[Self <: InlineQueryResultAudio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio_duration(value: Double): Self = StObject.set(x, "audio_duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudio_durationUndefined: Self = StObject.set(x, "audio_duration", js.undefined)
    
    @scala.inline
    def setAudio_url(value: String): Self = StObject.set(x, "audio_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setInput_message_content(value: InputMessageContent): Self = StObject.set(x, "input_message_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_message_contentUndefined: Self = StObject.set(x, "input_message_content", js.undefined)
    
    @scala.inline
    def setPerformer(value: String): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: audio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
