package typings.nodemailerSmtpPool.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthOptions extends js.Object {
  var pass: js.UndefOr[String] = js.native
  var user: js.UndefOr[String] = js.native
  var xoauth2: js.UndefOr[js.Any] = js.native
}

object AuthOptions {
  @scala.inline
  def apply(): AuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthOptions]
  }
  @scala.inline
  implicit class AuthOptionsOps[Self <: AuthOptions] (val x: Self) extends AnyVal {
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
    def setPass(value: String): Self = this.set("pass", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePass: Self = this.set("pass", js.undefined)
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    @scala.inline
    def setXoauth2(value: js.Any): Self = this.set("xoauth2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXoauth2: Self = this.set("xoauth2", js.undefined)
  }
  
}

