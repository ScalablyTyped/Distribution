package typings
package passportDashGoogleDashOauth2Lib.passportDashGoogleDashOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptions extends js.Object {
  var callbackURL: java.lang.String
  var clientID: java.lang.String
  var clientSecret: java.lang.String
  var passReqToCallback: js.UndefOr[passportDashGoogleDashOauth2Lib.passportDashGoogleDashOauth2LibNumbers.`true`] = js.undefined
  var proxy: js.UndefOr[scala.Boolean] = js.undefined
  var scope: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object StrategyOptions {
  @scala.inline
  def apply(
    callbackURL: java.lang.String,
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    passReqToCallback: passportDashGoogleDashOauth2Lib.passportDashGoogleDashOauth2LibNumbers.`true` = null,
    proxy: js.UndefOr[scala.Boolean] = js.undefined,
    scope: js.Array[java.lang.String] = null
  ): StrategyOptions = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, clientID = clientID, clientSecret = clientSecret)
    if (passReqToCallback != null) __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    if (!js.isUndefined(proxy)) __obj.updateDynamic("proxy")(proxy)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[StrategyOptions]
  }
}

