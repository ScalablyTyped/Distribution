package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.voice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineQueryResultVoice
  extends InlineQueryResultBase
     with InlineQueryResult {
  
  var caption: js.UndefOr[String] = js.native
  
  var input_message_content: js.UndefOr[InputMessageContent] = js.native
  
  var title: String = js.native
  
  var `type`: voice = js.native
  
  var voice_duration: js.UndefOr[Double] = js.native
  
  var voice_url: String = js.native
}
object InlineQueryResultVoice {
  
  @scala.inline
  def apply(id: String, title: String, `type`: voice, voice_url: String): InlineQueryResultVoice = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], voice_url = voice_url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultVoice]
  }
  
  @scala.inline
  implicit class InlineQueryResultVoiceMutableBuilder[Self <: InlineQueryResultVoice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setInput_message_content(value: InputMessageContent): Self = StObject.set(x, "input_message_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_message_contentUndefined: Self = StObject.set(x, "input_message_content", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: voice): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoice_duration(value: Double): Self = StObject.set(x, "voice_duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoice_durationUndefined: Self = StObject.set(x, "voice_duration", js.undefined)
    
    @scala.inline
    def setVoice_url(value: String): Self = StObject.set(x, "voice_url", value.asInstanceOf[js.Any])
  }
}
