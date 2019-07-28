package typings.passportDashTwitter.passportDashTwitterMod

import typings.passportDashTwitter.passportDashTwitterNumbers.`false`
import typings.passportDashTwitter.passportDashTwitterNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStrategyOption extends IStrategyOptionBase {
  var passReqToCallback: js.UndefOr[`false`] = js.undefined
}

object IStrategyOption {
  @scala.inline
  def apply(
    callbackURL: String,
    consumerKey: String,
    consumerSecret: String,
    accessTokenURL: String = null,
    includeEmail: `true` = null,
    passReqToCallback: `false` = null,
    reguestTokenURL: String = null,
    sessionKey: String = null,
    skipExtendedUserProfile: js.UndefOr[Boolean] = js.undefined,
    userAuthorizationURL: String = null,
    userProfileURL: String = null
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

