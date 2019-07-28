package typings.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Mod

import typings.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Numbers.`true`
import typings.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.offline
import typings.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.online
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionsWithRequest extends _StrategyOptionsBase {
  var passReqToCallback: `true`
}

object StrategyOptionsWithRequest {
  @scala.inline
  def apply(
    clientID: String,
    clientSecret: String,
    passReqToCallback: `true`,
    accessType: offline | online = null,
    authorizationURL: String = null,
    callbackURL: String = null,
    scope: String | js.Array[String] = null,
    tokenURL: String = null,
    userProfileURL: String = null
  ): StrategyOptionsWithRequest = {
    val __obj = js.Dynamic.literal(clientID = clientID, clientSecret = clientSecret, passReqToCallback = passReqToCallback)
    if (accessType != null) __obj.updateDynamic("accessType")(accessType.asInstanceOf[js.Any])
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL)
    if (callbackURL != null) __obj.updateDynamic("callbackURL")(callbackURL)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL)
    if (userProfileURL != null) __obj.updateDynamic("userProfileURL")(userProfileURL)
    __obj.asInstanceOf[StrategyOptionsWithRequest]
  }
}

