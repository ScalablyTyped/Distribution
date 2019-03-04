package typings
package passportDashTwitterLib.passportDashTwitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStrategyOption extends IStrategyOptionBase {
  var passReqToCallback: js.UndefOr[passportDashTwitterLib.passportDashTwitterLibNumbers.`false`] = js.undefined
}

object IStrategyOption {
  @scala.inline
  def apply(
    callbackURL: java.lang.String,
    consumerKey: java.lang.String,
    consumerSecret: java.lang.String,
    accessTokenURL: java.lang.String = null,
    includeEmail: passportDashTwitterLib.passportDashTwitterLibNumbers.`true` = null,
    passReqToCallback: passportDashTwitterLib.passportDashTwitterLibNumbers.`false` = null,
    reguestTokenURL: java.lang.String = null,
    sessionKey: java.lang.String = null,
    skipExtendedUserProfile: js.UndefOr[scala.Boolean] = js.undefined,
    userAuthorizationURL: java.lang.String = null,
    userProfileURL: java.lang.String = null
  ): IStrategyOption = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, consumerKey = consumerKey, consumerSecret = consumerSecret)
    if (accessTokenURL != null) __obj.updateDynamic("accessTokenURL")(accessTokenURL)
    if (includeEmail != null) __obj.updateDynamic("includeEmail")(includeEmail)
    if (passReqToCallback != null) __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    if (reguestTokenURL != null) __obj.updateDynamic("reguestTokenURL")(reguestTokenURL)
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey)
    if (!js.isUndefined(skipExtendedUserProfile)) __obj.updateDynamic("skipExtendedUserProfile")(skipExtendedUserProfile)
    if (userAuthorizationURL != null) __obj.updateDynamic("userAuthorizationURL")(userAuthorizationURL)
    if (userProfileURL != null) __obj.updateDynamic("userProfileURL")(userProfileURL)
    __obj.asInstanceOf[IStrategyOption]
  }
}

