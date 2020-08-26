package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginUrl extends js.Object {
  var bot_username: js.UndefOr[String] = js.native
  var forward_text: js.UndefOr[String] = js.native
  var request_write_acces: js.UndefOr[Boolean] = js.native
  var url: String = js.native
}

object LoginUrl {
  @scala.inline
  def apply(url: String): LoginUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginUrl]
  }
  @scala.inline
  implicit class LoginUrlOps[Self <: LoginUrl] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setBot_username(value: String): Self = this.set("bot_username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBot_username: Self = this.set("bot_username", js.undefined)
    @scala.inline
    def setForward_text(value: String): Self = this.set("forward_text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForward_text: Self = this.set("forward_text", js.undefined)
    @scala.inline
    def setRequest_write_acces(value: Boolean): Self = this.set("request_write_acces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest_write_acces: Self = this.set("request_write_acces", js.undefined)
  }
  
}

