package typings.nodeTelegramBotApi.mod

import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputMediaVideo
  extends InputMediaBase
     with InputMedia {
  var duration: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var supports_streaming: js.UndefOr[Boolean] = js.native
  var `type`: video = js.native
  var width: js.UndefOr[Double] = js.native
}

object InputMediaVideo {
  @scala.inline
  def apply(media: String, `type`: video): InputMediaVideo = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputMediaVideo]
  }
  @scala.inline
  implicit class InputMediaVideoOps[Self <: InputMediaVideo] (val x: Self) extends AnyVal {
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
    def setType(value: video): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setSupports_streaming(value: Boolean): Self = this.set("supports_streaming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupports_streaming: Self = this.set("supports_streaming", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

