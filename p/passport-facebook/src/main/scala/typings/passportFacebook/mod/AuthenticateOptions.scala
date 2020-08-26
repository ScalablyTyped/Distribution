package typings.passportFacebook.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticateOptions
  extends typings.passport.mod.AuthenticateOptions {
  var authType: js.UndefOr[String] = js.native
}

object AuthenticateOptions {
  @scala.inline
  def apply(): AuthenticateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticateOptions]
  }
  @scala.inline
  implicit class AuthenticateOptionsOps[Self <: AuthenticateOptions] (val x: Self) extends AnyVal {
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
    def setAuthType(value: String): Self = this.set("authType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthType: Self = this.set("authType", js.undefined)
  }
  
}

