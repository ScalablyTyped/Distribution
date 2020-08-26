package typings.nodeWit.mod

import typings.nodeWit.mod.log.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WitOption extends js.Object {
  var accessToken: String = js.native
  var actions: js.UndefOr[js.Any] = js.native
  var logger: js.UndefOr[Logger] = js.native
}

object WitOption {
  @scala.inline
  def apply(accessToken: String): WitOption = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[WitOption]
  }
  @scala.inline
  implicit class WitOptionOps[Self <: WitOption] (val x: Self) extends AnyVal {
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setActions(value: js.Any): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
  }
  
}

