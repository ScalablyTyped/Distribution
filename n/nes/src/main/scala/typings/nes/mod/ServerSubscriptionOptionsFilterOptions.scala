package typings.nes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerSubscriptionOptionsFilterOptions extends js.Object {
  var credentials: js.UndefOr[js.Any] = js.native
  var params: js.UndefOr[js.Any] = js.native
  var socket: Socket = js.native
}

object ServerSubscriptionOptionsFilterOptions {
  @scala.inline
  def apply(socket: Socket): ServerSubscriptionOptionsFilterOptions = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSubscriptionOptionsFilterOptions]
  }
  @scala.inline
  implicit class ServerSubscriptionOptionsFilterOptionsOps[Self <: ServerSubscriptionOptionsFilterOptions] (val x: Self) extends AnyVal {
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
    def setSocket(value: Socket): Self = this.set("socket", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredentials(value: js.Any): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
  
}

