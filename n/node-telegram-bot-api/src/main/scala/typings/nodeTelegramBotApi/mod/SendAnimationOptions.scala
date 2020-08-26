package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendAnimationOptions extends SendBasicOptions {
  var caption: js.UndefOr[String] = js.native
  var duration: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var parse_mode: js.UndefOr[ParseMode] = js.native
  var width: js.UndefOr[Double] = js.native
}

object SendAnimationOptions {
  @scala.inline
  def apply(): SendAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendAnimationOptions]
  }
  @scala.inline
  implicit class SendAnimationOptionsOps[Self <: SendAnimationOptions] (val x: Self) extends AnyVal {
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
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setParse_mode(value: ParseMode): Self = this.set("parse_mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParse_mode: Self = this.set("parse_mode", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

