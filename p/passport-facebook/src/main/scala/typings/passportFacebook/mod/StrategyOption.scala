package typings.passportFacebook.mod

import typings.passportFacebook.passportFacebookStrings.page
import typings.passportFacebook.passportFacebookStrings.popup
import typings.passportFacebook.passportFacebookStrings.reauthenticate
import typings.passportFacebook.passportFacebookStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyOption extends js.Object {
  var authNonce: js.UndefOr[String] = js.native
  var authType: js.UndefOr[reauthenticate] = js.native
  var authorizationURL: js.UndefOr[String] = js.native
  var callbackURL: String = js.native
  var clientID: String = js.native
  var clientSecret: String = js.native
  var display: js.UndefOr[page | popup | touch] = js.native
  var enableProof: js.UndefOr[Boolean] = js.native
  var graphAPIVersion: js.UndefOr[String] = js.native
  var profileFields: js.UndefOr[js.Array[String]] = js.native
  var profileURL: js.UndefOr[String] = js.native
  var scopeSeparator: js.UndefOr[String] = js.native
  var tokenURL: js.UndefOr[String] = js.native
}

object StrategyOption {
  @scala.inline
  def apply(callbackURL: String, clientID: String, clientSecret: String): StrategyOption = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOption]
  }
  @scala.inline
  implicit class StrategyOptionOps[Self <: StrategyOption] (val x: Self) extends AnyVal {
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
    def setClientID(value: String): Self = this.set("clientID", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthNonce(value: String): Self = this.set("authNonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthNonce: Self = this.set("authNonce", js.undefined)
    @scala.inline
    def setAuthType(value: reauthenticate): Self = this.set("authType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthType: Self = this.set("authType", js.undefined)
    @scala.inline
    def setAuthorizationURL(value: String): Self = this.set("authorizationURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizationURL: Self = this.set("authorizationURL", js.undefined)
    @scala.inline
    def setDisplay(value: page | popup | touch): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setEnableProof(value: Boolean): Self = this.set("enableProof", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableProof: Self = this.set("enableProof", js.undefined)
    @scala.inline
    def setGraphAPIVersion(value: String): Self = this.set("graphAPIVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraphAPIVersion: Self = this.set("graphAPIVersion", js.undefined)
    @scala.inline
    def setProfileFieldsVarargs(value: String*): Self = this.set("profileFields", js.Array(value :_*))
    @scala.inline
    def setProfileFields(value: js.Array[String]): Self = this.set("profileFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileFields: Self = this.set("profileFields", js.undefined)
    @scala.inline
    def setProfileURL(value: String): Self = this.set("profileURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileURL: Self = this.set("profileURL", js.undefined)
    @scala.inline
    def setScopeSeparator(value: String): Self = this.set("scopeSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopeSeparator: Self = this.set("scopeSeparator", js.undefined)
    @scala.inline
    def setTokenURL(value: String): Self = this.set("tokenURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenURL: Self = this.set("tokenURL", js.undefined)
  }
  
}

