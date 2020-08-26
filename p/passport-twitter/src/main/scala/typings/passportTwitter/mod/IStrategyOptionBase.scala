package typings.passportTwitter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStrategyOptionBase extends js.Object {
  var accessTokenURL: js.UndefOr[String] = js.native
  var callbackURL: String = js.native
  var consumerKey: String = js.native
  var consumerSecret: String = js.native
  var forceLogin: js.UndefOr[Boolean] = js.native
  var includeEmail: js.UndefOr[Boolean] = js.native
  var includeEntities: js.UndefOr[Boolean] = js.native
  var includeStatus: js.UndefOr[Boolean] = js.native
  var requestTokenURL: js.UndefOr[String] = js.native
  var screenName: js.UndefOr[String] = js.native
  var sessionKey: js.UndefOr[String] = js.native
  var skipExtendedUserProfile: js.UndefOr[Boolean] = js.native
  var userAuthorizationURL: js.UndefOr[String] = js.native
  var userProfileURL: js.UndefOr[String] = js.native
}

object IStrategyOptionBase {
  @scala.inline
  def apply(callbackURL: String, consumerKey: String, consumerSecret: String): IStrategyOptionBase = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStrategyOptionBase]
  }
  @scala.inline
  implicit class IStrategyOptionBaseOps[Self <: IStrategyOptionBase] (val x: Self) extends AnyVal {
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
    def setForceLogin(value: Boolean): Self = this.set("forceLogin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceLogin: Self = this.set("forceLogin", js.undefined)
    @scala.inline
    def setIncludeEmail(value: Boolean): Self = this.set("includeEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeEmail: Self = this.set("includeEmail", js.undefined)
    @scala.inline
    def setIncludeEntities(value: Boolean): Self = this.set("includeEntities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeEntities: Self = this.set("includeEntities", js.undefined)
    @scala.inline
    def setIncludeStatus(value: Boolean): Self = this.set("includeStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeStatus: Self = this.set("includeStatus", js.undefined)
    @scala.inline
    def setRequestTokenURL(value: String): Self = this.set("requestTokenURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestTokenURL: Self = this.set("requestTokenURL", js.undefined)
    @scala.inline
    def setScreenName(value: String): Self = this.set("screenName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenName: Self = this.set("screenName", js.undefined)
    @scala.inline
    def setSessionKey(value: String): Self = this.set("sessionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionKey: Self = this.set("sessionKey", js.undefined)
    @scala.inline
    def setSkipExtendedUserProfile(value: Boolean): Self = this.set("skipExtendedUserProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipExtendedUserProfile: Self = this.set("skipExtendedUserProfile", js.undefined)
    @scala.inline
    def setUserAuthorizationURL(value: String): Self = this.set("userAuthorizationURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserAuthorizationURL: Self = this.set("userAuthorizationURL", js.undefined)
    @scala.inline
    def setUserProfileURL(value: String): Self = this.set("userProfileURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProfileURL: Self = this.set("userProfileURL", js.undefined)
  }
  
}

