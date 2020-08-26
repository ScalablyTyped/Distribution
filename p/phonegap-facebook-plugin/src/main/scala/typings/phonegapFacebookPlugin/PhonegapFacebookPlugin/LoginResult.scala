package typings.phonegapFacebookPlugin.PhonegapFacebookPlugin

import typings.phonegapFacebookPlugin.anon.AccessToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Callback Results
/**
  * Result for the login() and getLoginStatus() success callbacks.
  */
@js.native
trait LoginResult extends js.Object {
  var authResponse: AccessToken = js.native
  var status: String = js.native
}

object LoginResult {
  @scala.inline
  def apply(authResponse: AccessToken, status: String): LoginResult = {
    val __obj = js.Dynamic.literal(authResponse = authResponse.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginResult]
  }
  @scala.inline
  implicit class LoginResultOps[Self <: LoginResult] (val x: Self) extends AnyVal {
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
    def setAuthResponse(value: AccessToken): Self = this.set("authResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

