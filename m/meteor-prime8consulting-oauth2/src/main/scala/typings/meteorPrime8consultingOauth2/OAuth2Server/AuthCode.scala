package typings.meteorPrime8consultingOauth2.OAuth2Server

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthCode extends js.Object {
  var authCode: String = js.native
  var clientId: String = js.native
  var expires: Date = js.native
  var userId: String = js.native
}

object AuthCode {
  @scala.inline
  def apply(authCode: String, clientId: String, expires: Date, userId: String): AuthCode = {
    val __obj = js.Dynamic.literal(authCode = authCode.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthCode]
  }
  @scala.inline
  implicit class AuthCodeOps[Self <: AuthCode] (val x: Self) extends AnyVal {
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
    def setAuthCode(value: String): Self = this.set("authCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpires(value: Date): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
  
}

