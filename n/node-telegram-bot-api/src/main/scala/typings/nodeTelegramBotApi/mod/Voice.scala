package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Voice extends FileBase {
  var duration: Double = js.native
  var mime_type: js.UndefOr[String] = js.native
}

object Voice {
  @scala.inline
  def apply(duration: Double, file_id: String): Voice = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], file_id = file_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Voice]
  }
  @scala.inline
  implicit class VoiceOps[Self <: Voice] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setMime_type(value: String): Self = this.set("mime_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMime_type: Self = this.set("mime_type", js.undefined)
  }
  
}

