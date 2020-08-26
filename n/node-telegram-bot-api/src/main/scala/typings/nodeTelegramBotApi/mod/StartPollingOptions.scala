package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartPollingOptions extends ConstructorOptions {
  var restart: js.UndefOr[Boolean] = js.native
}

object StartPollingOptions {
  @scala.inline
  def apply(): StartPollingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPollingOptions]
  }
  @scala.inline
  implicit class StartPollingOptionsOps[Self <: StartPollingOptions] (val x: Self) extends AnyVal {
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
    def setRestart(value: Boolean): Self = this.set("restart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestart: Self = this.set("restart", js.undefined)
  }
  
}

