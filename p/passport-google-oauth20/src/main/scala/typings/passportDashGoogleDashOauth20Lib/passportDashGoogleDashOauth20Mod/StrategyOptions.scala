package typings
package passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptions extends _StrategyOptionsBase {
  var passReqToCallback: js.UndefOr[passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20LibNumbers.`false`] = js.undefined
}

object StrategyOptions {
  @scala.inline
  def apply(
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    accessType: passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20LibStrings.offline | passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20LibStrings.online = null,
    authorizationURL: java.lang.String = null,
    callbackURL: java.lang.String = null,
    passReqToCallback: passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20LibNumbers.`false` = null,
    scope: java.lang.String | js.Array[java.lang.String] = null,
    tokenURL: java.lang.String = null,
    userProfileURL: java.lang.String = null
  ): StrategyOptions = {
    val __obj = js.Dynamic.literal(clientID = clientID, clientSecret = clientSecret)
    if (accessType != null) __obj.updateDynamic("accessType")(accessType.asInstanceOf[js.Any])
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL)
    if (callbackURL != null) __obj.updateDynamic("callbackURL")(callbackURL)
    if (passReqToCallback != null) __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL)
    if (userProfileURL != null) __obj.updateDynamic("userProfileURL")(userProfileURL)
    __obj.asInstanceOf[StrategyOptions]
  }
}

