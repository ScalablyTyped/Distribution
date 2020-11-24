package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.voice
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
  implicit class InlineQueryResultVoiceOps[Self <: InlineQueryResultVoice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: voice): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoice_url(value: String): Self = this.set("voice_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setInput_message_content(value: InputMessageContent): Self = this.set("input_message_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput_message_content: Self = this.set("input_message_content", js.undefined)
    
    @scala.inline
    def setVoice_duration(value: Double): Self = this.set("voice_duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoice_duration: Self = this.set("voice_duration", js.undefined)
  }
}
