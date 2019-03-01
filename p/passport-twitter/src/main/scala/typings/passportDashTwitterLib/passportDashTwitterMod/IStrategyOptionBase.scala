package typings
package passportDashTwitterLib.passportDashTwitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStrategyOptionBase extends js.Object {
  var accessTokenURL: js.UndefOr[java.lang.String] = js.undefined
  var callbackURL: java.lang.String
  var consumerKey: java.lang.String
  var consumerSecret: java.lang.String
  var includeEmail: js.UndefOr[passportDashTwitterLib.passportDashTwitterLibNumbers.`true`] = js.undefined
  var reguestTokenURL: js.UndefOr[java.lang.String] = js.undefined
  var sessionKey: js.UndefOr[java.lang.String] = js.undefined
  var skipExtendedUserProfile: js.UndefOr[scala.Boolean] = js.undefined
  var userAuthorizationURL: js.UndefOr[java.lang.String] = js.undefined
  var userProfileURL: js.UndefOr[java.lang.String] = js.undefined
}

object IStrategyOptionBase {
  @scala.inline
  def apply(
    callbackURL: java.lang.String,
    consumerKey: java.lang.String,
    consumerSecret: java.lang.String,
    accessTokenURL: java.lang.String = null,
    includeEmail: passportDashTwitterLib.passportDashTwitterLibNumbers.`true` = null,
    reguestTokenURL: java.lang.String = null,
    sessionKey: java.lang.String = null,
    skipExtendedUserProfile: js.UndefOr[scala.Boolean] = js.undefined,
    userAuthorizationURL: java.lang.String = null,
    userProfileURL: java.lang.String = null
  ): IStrategyOptionBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callbackURL")(callbackURL)
    __obj.updateDynamic("consumerKey")(consumerKey)
    __obj.updateDynamic("consumerSecret")(consumerSecret)
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

