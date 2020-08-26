package typings.passportGithub2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyOptionsBase extends OAuth2StrategyOptionsWithoutRequiredURLs {
  var authorizationURL: js.UndefOr[String] = js.native
  @JSName("callbackURL")
  var callbackURL_StrategyOptionsBase: String = js.native
  @JSName("scope")
  var scope_StrategyOptionsBase: js.UndefOr[js.Array[String]] = js.native
  @JSName("state")
  var state_StrategyOptionsBase: js.UndefOr[String] = js.native
  var tokenURL: js.UndefOr[String] = js.native
  var userAgent: js.UndefOr[String] = js.native
  var userEmailURL: js.UndefOr[String] = js.native
  var userProfileURL: js.UndefOr[String] = js.native
}

object StrategyOptionsBase {
  @scala.inline
  def apply(callbackURL: String, clientID: String, clientSecret: String): StrategyOptionsBase = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptionsBase]
  }
  @scala.inline
  implicit class StrategyOptionsBaseOps[Self <: StrategyOptionsBase] (val x: Self) extends AnyVal {
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
    def setAuthorizationURL(value: String): Self = this.set("authorizationURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizationURL: Self = this.set("authorizationURL", js.undefined)
    @scala.inline
    def setScopeVarargs(value: String*): Self = this.set("scope", js.Array(value :_*))
    @scala.inline
    def setScope(value: js.Array[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setTokenURL(value: String): Self = this.set("tokenURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenURL: Self = this.set("tokenURL", js.undefined)
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
    @scala.inline
    def setUserEmailURL(value: String): Self = this.set("userEmailURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserEmailURL: Self = this.set("userEmailURL", js.undefined)
    @scala.inline
    def setUserProfileURL(value: String): Self = this.set("userProfileURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProfileURL: Self = this.set("userProfileURL", js.undefined)
  }
  
}

