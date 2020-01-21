package typings.passportGoogleOauth2.mod

import typings.passportGoogleOauth2.passportGoogleOauth2Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptions extends js.Object {
  var callbackURL: String
  var clientID: String
  var clientSecret: String
  var passReqToCallback: js.UndefOr[`true`] = js.undefined
  var proxy: js.UndefOr[Boolean] = js.undefined
  var scope: js.UndefOr[js.Array[String]] = js.undefined
}

object StrategyOptions {
  @scala.inline
  def apply(
    callbackURL: String,
    clientID: String,
    clientSecret: String,
    passReqToCallback: `true` = null,
    proxy: js.UndefOr[Boolean] = js.undefined,
    scope: js.Array[String] = null
  ): StrategyOptions = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    if (passReqToCallback != null) __obj.updateDynamic("passReqToCallback")(passReqToCallback.asInstanceOf[js.Any])
    if (!js.isUndefined(proxy)) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptions]
  }
}

