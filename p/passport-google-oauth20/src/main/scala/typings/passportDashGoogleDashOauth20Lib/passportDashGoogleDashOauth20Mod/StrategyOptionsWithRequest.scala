package typings
package passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionsWithRequest extends _StrategyOptionsBase {
  var passReqToCallback: passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20LibNumbers.`true`
}

object StrategyOptionsWithRequest {
  @scala.inline
  def apply(
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    passReqToCallback: passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20LibNumbers.`true`,
    authorizationURL: java.lang.String = null,
    callbackURL: java.lang.String = null,
    scope: java.lang.String | js.Array[java.lang.String] = null,
    tokenURL: java.lang.String = null,
    userProfileURL: java.lang.String = null
  ): StrategyOptionsWithRequest = {
    val __obj = js.Dynamic.literal(clientID = clientID, clientSecret = clientSecret, passReqToCallback = passReqToCallback)
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL)
    if (callbackURL != null) __obj.updateDynamic("callbackURL")(callbackURL)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL)
    if (userProfileURL != null) __obj.updateDynamic("userProfileURL")(userProfileURL)
    __obj.asInstanceOf[StrategyOptionsWithRequest]
  }
}

