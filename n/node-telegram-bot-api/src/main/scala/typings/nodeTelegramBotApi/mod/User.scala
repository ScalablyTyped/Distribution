package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  var first_name: String = js.native
  var id: Double = js.native
  var is_bot: Boolean = js.native
  var language_code: js.UndefOr[String] = js.native
  var last_name: js.UndefOr[String] = js.native
  var username: js.UndefOr[String] = js.native
}

object User {
  @scala.inline
  def apply(first_name: String, id: Double, is_bot: Boolean): User = {
    val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_bot = is_bot.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  @scala.inline
  implicit class UserOps[Self <: User] (val x: Self) extends AnyVal {
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
    def setFirst_name(value: String): Self = this.set("first_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs_bot(value: Boolean): Self = this.set("is_bot", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage_code(value: String): Self = this.set("language_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage_code: Self = this.set("language_code", js.undefined)
    @scala.inline
    def setLast_name(value: String): Self = this.set("last_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_name: Self = this.set("last_name", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

