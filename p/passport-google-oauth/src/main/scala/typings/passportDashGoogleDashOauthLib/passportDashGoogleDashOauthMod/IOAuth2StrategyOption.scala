package typings
package passportDashGoogleDashOauthLib.passportDashGoogleDashOauthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOAuth2StrategyOption extends js.Object {
  var accessType: js.UndefOr[java.lang.String] = js.undefined
  var approval_prompt: js.UndefOr[java.lang.String] = js.undefined
  var authorizationURL: js.UndefOr[java.lang.String] = js.undefined
  var callbackURL: java.lang.String
  var clientID: java.lang.String
  var clientSecret: java.lang.String
  var display: js.UndefOr[java.lang.String] = js.undefined
  var hostedDomain: js.UndefOr[java.lang.String] = js.undefined
  var loginHint: js.UndefOr[java.lang.String] = js.undefined
  var openIDRealm: js.UndefOr[java.lang.String] = js.undefined
  var prompt: js.UndefOr[java.lang.String] = js.undefined
  var requestVisibleActions: js.UndefOr[java.lang.String] = js.undefined
  var tokenURL: js.UndefOr[java.lang.String] = js.undefined
  var userID: js.UndefOr[java.lang.String] = js.undefined
  var userProfileURL: js.UndefOr[java.lang.String] = js.undefined
}

object IOAuth2StrategyOption {
  @scala.inline
  def apply(
    callbackURL: java.lang.String,
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    accessType: java.lang.String = null,
    approval_prompt: java.lang.String = null,
    authorizationURL: java.lang.String = null,
    display: java.lang.String = null,
    hostedDomain: java.lang.String = null,
    loginHint: java.lang.String = null,
    openIDRealm: java.lang.String = null,
    prompt: java.lang.String = null,
    requestVisibleActions: java.lang.String = null,
    tokenURL: java.lang.String = null,
    userID: java.lang.String = null,
    userProfileURL: java.lang.String = null
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

