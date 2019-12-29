package typings.passportDashTwitter.passportDashTwitterMod

import typings.passportDashTwitter.passportDashTwitterBooleans.`false`
import typings.passportDashTwitter.passportDashTwitterBooleans.`true`
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
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any])
    if (accessTokenURL != null) __obj.updateDynamic("accessTokenURL")(accessTokenURL.asInstanceOf[js.Any])
    if (includeEmail != null) __obj.updateDynamic("includeEmail")(includeEmail.asInstanceOf[js.Any])
    if (passReqToCallback != null) __obj.updateDynamic("passReqToCallback")(passReqToCallback.asInstanceOf[js.Any])
    if (reguestTokenURL != null) __obj.updateDynamic("reguestTokenURL")(reguestTokenURL.asInstanceOf[js.Any])
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey.asInstanceOf[js.Any])
    if (!js.isUndefined(skipExtendedUserProfile)) __obj.updateDynamic("skipExtendedUserProfile")(skipExtendedUserProfile.asInstanceOf[js.Any])
    if (userAuthorizationURL != null) __obj.updateDynamic("userAuthorizationURL")(userAuthorizationURL.asInstanceOf[js.Any])
    if (userProfileURL != null) __obj.updateDynamic("userProfileURL")(userProfileURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStrategyOption]
  }
}

