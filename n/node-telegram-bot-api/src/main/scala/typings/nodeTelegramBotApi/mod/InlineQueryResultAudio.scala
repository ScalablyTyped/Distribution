package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.audio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class InlineQueryResultAudioOps[Self <: InlineQueryResultAudio] (val x: Self) extends AnyVal {
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
    def setAudio_url(value: String): Self = this.set("audio_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: audio): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudio_duration(value: Double): Self = this.set("audio_duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudio_duration: Self = this.set("audio_duration", js.undefined)
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setInput_message_content(value: InputMessageContent): Self = this.set("input_message_content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput_message_content: Self = this.set("input_message_content", js.undefined)
    @scala.inline
    def setPerformer(value: String): Self = this.set("performer", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformer: Self = this.set("performer", js.undefined)
  }
  
}

