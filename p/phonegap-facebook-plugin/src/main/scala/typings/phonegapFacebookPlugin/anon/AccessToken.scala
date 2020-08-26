package typings.phonegapFacebookPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessToken extends js.Object {
  var accessToken: String = js.native
  var expiresIn: String = js.native
  var secret: String = js.native
  var session_key: Boolean = js.native
  var sig: String = js.native
  var userID: String = js.native
}

object AccessToken {
  @scala.inline
  def apply(
    accessToken: String,
    expiresIn: String,
    secret: String,
    session_key: Boolean,
    sig: String,
    userID: String
  ): AccessToken = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], session_key = session_key.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessToken]
  }
  @scala.inline
  implicit class AccessTokenOps[Self <: AccessToken] (val x: Self) extends AnyVal {
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
    def setExpiresIn(value: String): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession_key(value: Boolean): Self = this.set("session_key", value.asInstanceOf[js.Any])
    @scala.inline
    def setSig(value: String): Self = this.set("sig", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserID(value: String): Self = this.set("userID", value.asInstanceOf[js.Any])
  }
  
}

