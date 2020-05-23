package typings.passportFacebook.mod

import typings.passportFacebook.passportFacebookBooleans.`true`
import typings.passportFacebook.passportFacebookStrings.page
import typings.passportFacebook.passportFacebookStrings.popup
import typings.passportFacebook.passportFacebookStrings.reauthenticate
import typings.passportFacebook.passportFacebookStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionWithRequest extends StrategyOption {
  var passReqToCallback: `true`
}

object StrategyOptionWithRequest {
  @scala.inline
  def apply(
    callbackURL: String,
    clientID: String,
    clientSecret: String,
    passReqToCallback: `true`,
    authNonce: String = null,
    authType: reauthenticate = null,
    authorizationURL: String = null,
    display: page | popup | touch = null,
    enableProof: js.UndefOr[Boolean] = js.undefined,
    graphAPIVersion: String = null,
    profileFields: js.Array[String] = null,
    profileURL: String = null,
    scopeSeparator: String = null,
    tokenURL: String = null
  ): StrategyOptionWithRequest = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
    if (authNonce != null) __obj.updateDynamic("authNonce")(authNonce.asInstanceOf[js.Any])
    if (authType != null) __obj.updateDynamic("authType")(authType.asInstanceOf[js.Any])
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(enableProof)) __obj.updateDynamic("enableProof")(enableProof.get.asInstanceOf[js.Any])
    if (graphAPIVersion != null) __obj.updateDynamic("graphAPIVersion")(graphAPIVersion.asInstanceOf[js.Any])
    if (profileFields != null) __obj.updateDynamic("profileFields")(profileFields.asInstanceOf[js.Any])
    if (profileURL != null) __obj.updateDynamic("profileURL")(profileURL.asInstanceOf[js.Any])
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator.asInstanceOf[js.Any])
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptionWithRequest]
  }
}

