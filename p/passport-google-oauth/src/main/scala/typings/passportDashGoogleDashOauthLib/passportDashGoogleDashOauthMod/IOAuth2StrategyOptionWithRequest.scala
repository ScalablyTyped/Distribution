package typings
package passportDashGoogleDashOauthLib.passportDashGoogleDashOauthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOAuth2StrategyOptionWithRequest extends IOAuth2StrategyOption {
  var passReqToCallback: scala.Boolean
}

object IOAuth2StrategyOptionWithRequest {
  @scala.inline
  def apply(
    callbackURL: java.lang.String,
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    passReqToCallback: scala.Boolean,
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
  ): IOAuth2StrategyOptionWithRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callbackURL")(callbackURL)
    __obj.updateDynamic("clientID")(clientID)
    __obj.updateDynamic("clientSecret")(clientSecret)
    __obj.updateDynamic("passReqToCallback")(passReqToCallback)
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
    __obj.asInstanceOf[IOAuth2StrategyOptionWithRequest]
  }
}

