package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// METHODS OPTIONS ///
@js.native
trait PollingOptions extends js.Object {
  var autoStart: js.UndefOr[Boolean] = js.native
  var interval: js.UndefOr[String | Double] = js.native
  var params: js.UndefOr[GetUpdatesOptions] = js.native
}

object PollingOptions {
  @scala.inline
  def apply(): PollingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollingOptions]
  }
  @scala.inline
  implicit class PollingOptionsOps[Self <: PollingOptions] (val x: Self) extends AnyVal {
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
    def setAutoStart(value: Boolean): Self = this.set("autoStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoStart: Self = this.set("autoStart", js.undefined)
    @scala.inline
    def setInterval(value: String | Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setParams(value: GetUpdatesOptions): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
  
}

