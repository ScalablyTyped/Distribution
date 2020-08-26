package typings.playmusic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginOptions extends js.Object {
  var androidId: js.UndefOr[String] = js.native
  var email: js.UndefOr[String] = js.native
  var password: js.UndefOr[String] = js.native
}

object LoginOptions {
  @scala.inline
  def apply(): LoginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginOptions]
  }
  @scala.inline
  implicit class LoginOptionsOps[Self <: LoginOptions] (val x: Self) extends AnyVal {
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
    def setAndroidId(value: String): Self = this.set("androidId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidId: Self = this.set("androidId", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
  }
  
}

