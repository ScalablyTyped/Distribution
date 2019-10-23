package typings.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Mod

import typings.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Numbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptions extends _StrategyOptionsBase {
  var passReqToCallback: js.UndefOr[`false`] = js.undefined
}

object StrategyOptions {
  @scala.inline
  def apply(
    clientID: String,
    clientSecret: String,
    authorizationURL: String = null,
    callbackURL: String = null,
    passReqToCallback: `false` = null,
    scope: String | js.Array[String] = null,
    tokenURL: String = null,
    userProfileURL: String = null
  ): StrategyOptions = {
    val __obj = js.Dynamic.literal(clientID = clientID, clientSecret = clientSecret)
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL)
    if (callbackURL != null) __obj.updateDynamic("callbackURL")(callbackURL)
    if (passReqToCallback != null) __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL)
    if (userProfileURL != null) __obj.updateDynamic("userProfileURL")(userProfileURL)
    __obj.asInstanceOf[StrategyOptions]
  }
}

