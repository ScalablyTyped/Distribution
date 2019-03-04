package typings
package passportDashTwitterLib.passportDashTwitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStrategyOptionWithRequest extends IStrategyOptionBase {
  var passReqToCallback: passportDashTwitterLib.passportDashTwitterLibNumbers.`true`
}

object IStrategyOptionWithRequest {
  @scala.inline
  def apply(
    callbackURL: java.lang.String,
    consumerKey: java.lang.String,
    consumerSecret: java.lang.String,
    passReqToCallback: passportDashTwitterLib.passportDashTwitterLibNumbers.`true`,
    accessTokenURL: java.lang.String = null,
    includeEmail: passportDashTwitterLib.passportDashTwitterLibNumbers.`true` = null,
    reguestTokenURL: java.lang.String = null,
    sessionKey: java.lang.String = null,
    skipExtendedUserProfile: js.UndefOr[scala.Boolean] = js.undefined,
    userAuthorizationURL: java.lang.String = null,
    userProfileURL: java.lang.String = null
  ): IStrategyOptionWithRequest = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, consumerKey = consumerKey, consumerSecret = consumerSecret, passReqToCallback = passReqToCallback)
    if (accessTokenURL != null) __obj.updateDynamic("accessTokenURL")(accessTokenURL)
    if (includeEmail != null) __obj.updateDynamic("includeEmail")(includeEmail)
    if (reguestTokenURL != null) __obj.updateDynamic("reguestTokenURL")(reguestTokenURL)
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey)
    if (!js.isUndefined(skipExtendedUserProfile)) __obj.updateDynamic("skipExtendedUserProfile")(skipExtendedUserProfile)
    if (userAuthorizationURL != null) __obj.updateDynamic("userAuthorizationURL")(userAuthorizationURL)
    if (userProfileURL != null) __obj.updateDynamic("userProfileURL")(userProfileURL)
    __obj.asInstanceOf[IStrategyOptionWithRequest]
  }
}

