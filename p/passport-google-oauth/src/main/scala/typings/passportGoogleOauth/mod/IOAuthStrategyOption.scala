package typings.passportGoogleOauth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOAuthStrategyOption extends js.Object {
  var accessTokenURL: js.UndefOr[String] = js.native
  var callbackURL: String = js.native
  var consumerKey: String = js.native
  var consumerSecret: String = js.native
  var requestTokenURL: js.UndefOr[String] = js.native
  var sessionKey: js.UndefOr[String] = js.native
  var userAuthorizationURL: js.UndefOr[String] = js.native
}

object IOAuthStrategyOption {
  @scala.inline
  def apply(callbackURL: String, consumerKey: String, consumerSecret: String): IOAuthStrategyOption = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOAuthStrategyOption]
  }
  @scala.inline
  implicit class IOAuthStrategyOptionOps[Self <: IOAuthStrategyOption] (val x: Self) extends AnyVal {
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
    def setCallbackURL(value: String): Self = this.set("callbackURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsumerKey(value: String): Self = this.set("consumerKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsumerSecret(value: String): Self = this.set("consumerSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessTokenURL(value: String): Self = this.set("accessTokenURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessTokenURL: Self = this.set("accessTokenURL", js.undefined)
    @scala.inline
    def setRequestTokenURL(value: String): Self = this.set("requestTokenURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestTokenURL: Self = this.set("requestTokenURL", js.undefined)
    @scala.inline
    def setSessionKey(value: String): Self = this.set("sessionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionKey: Self = this.set("sessionKey", js.undefined)
    @scala.inline
    def setUserAuthorizationURL(value: String): Self = this.set("userAuthorizationURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserAuthorizationURL: Self = this.set("userAuthorizationURL", js.undefined)
  }
  
}

