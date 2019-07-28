package typings.passportDashTwitter.passportDashTwitterMod

import typings.passportDashTwitter.passportDashTwitterNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStrategyOptionBase extends js.Object {
  var accessTokenURL: js.UndefOr[String] = js.undefined
  var callbackURL: String
  var consumerKey: String
  var consumerSecret: String
  var includeEmail: js.UndefOr[`true`] = js.undefined
  var reguestTokenURL: js.UndefOr[String] = js.undefined
  var sessionKey: js.UndefOr[String] = js.undefined
  var skipExtendedUserProfile: js.UndefOr[Boolean] = js.undefined
  var userAuthorizationURL: js.UndefOr[String] = js.undefined
  var userProfileURL: js.UndefOr[String] = js.undefined
}

object IStrategyOptionBase {
  @scala.inline
  def apply(
    callbackURL: String,
    consumerKey: String,
    consumerSecret: String,
    accessTokenURL: String = null,
    includeEmail: `true` = null,
    reguestTokenURL: String = null,
    sessionKey: String = null,
    skipExtendedUserProfile: js.UndefOr[Boolean] = js.undefined,
    userAuthorizationURL: String = null,
    userProfileURL: String = null
  ): IStrategyOptionBase = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, consumerKey = consumerKey, consumerSecret = consumerSecret)
    if (accessTokenURL != null) __obj.updateDynamic("accessTokenURL")(accessTokenURL)
    if (includeEmail != null) __obj.updateDynamic("includeEmail")(includeEmail)
    if (reguestTokenURL != null) __obj.updateDynamic("reguestTokenURL")(reguestTokenURL)
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey)
    if (!js.isUndefined(skipExtendedUserProfile)) __obj.updateDynamic("skipExtendedUserProfile")(skipExtendedUserProfile)
    if (userAuthorizationURL != null) __obj.updateDynamic("userAuthorizationURL")(userAuthorizationURL)
    if (userProfileURL != null) __obj.updateDynamic("userProfileURL")(userProfileURL)
    __obj.asInstanceOf[IStrategyOptionBase]
  }
}

