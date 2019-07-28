package typings.passportDashGoogleDashOauth.passportDashGoogleDashOauthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOAuth2StrategyOption extends js.Object {
  var accessType: js.UndefOr[String] = js.undefined
  var approval_prompt: js.UndefOr[String] = js.undefined
  var authorizationURL: js.UndefOr[String] = js.undefined
  var callbackURL: String
  var clientID: String
  var clientSecret: String
  var display: js.UndefOr[String] = js.undefined
  var hostedDomain: js.UndefOr[String] = js.undefined
  var loginHint: js.UndefOr[String] = js.undefined
  var openIDRealm: js.UndefOr[String] = js.undefined
  var prompt: js.UndefOr[String] = js.undefined
  var requestVisibleActions: js.UndefOr[String] = js.undefined
  var tokenURL: js.UndefOr[String] = js.undefined
  var userID: js.UndefOr[String] = js.undefined
  var userProfileURL: js.UndefOr[String] = js.undefined
}

object IOAuth2StrategyOption {
  @scala.inline
  def apply(
    callbackURL: String,
    clientID: String,
    clientSecret: String,
    accessType: String = null,
    approval_prompt: String = null,
    authorizationURL: String = null,
    display: String = null,
    hostedDomain: String = null,
    loginHint: String = null,
    openIDRealm: String = null,
    prompt: String = null,
    requestVisibleActions: String = null,
    tokenURL: String = null,
    userID: String = null,
    userProfileURL: String = null
  ): IOAuth2StrategyOption = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, clientID = clientID, clientSecret = clientSecret)
    if (accessType != null) __obj.updateDynamic("accessType")(accessType)
    if (approval_prompt != null) __obj.updateDynamic("approval_prompt")(approval_prompt)
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL)
    if (display != null) __obj.updateDynamic("display")(display)
    if (hostedDomain != null) __obj.updateDynamic("hostedDomain")(hostedDomain)
    if (loginHint != null) __obj.updateDynamic("loginHint")(loginHint)
    if (openIDRealm != null) __obj.updateDynamic("openIDRealm")(openIDRealm)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (requestVisibleActions != null) __obj.updateDynamic("requestVisibleActions")(requestVisibleActions)
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL)
    if (userID != null) __obj.updateDynamic("userID")(userID)
    if (userProfileURL != null) __obj.updateDynamic("userProfileURL")(userProfileURL)
    __obj.asInstanceOf[IOAuth2StrategyOption]
  }
}

