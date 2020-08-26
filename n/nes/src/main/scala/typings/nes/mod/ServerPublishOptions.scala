package typings.nes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerPublishOptions extends js.Object {
  var internal: js.UndefOr[js.Any] = js.native
  var user: js.UndefOr[js.Any] = js.native
}

object ServerPublishOptions {
  @scala.inline
  def apply(): ServerPublishOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerPublishOptions]
  }
  @scala.inline
  implicit class ServerPublishOptionsOps[Self <: ServerPublishOptions] (val x: Self) extends AnyVal {
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
    def setInternal(value: js.Any): Self = this.set("internal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternal: Self = this.set("internal", js.undefined)
    @scala.inline
    def setUser(value: js.Any): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

