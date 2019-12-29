package typings.passportDashGoogleDashOauth2.passportDashGoogleDashOauth2Mod

import typings.passportDashGoogleDashOauth2.passportDashGoogleDashOauth2Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionsWithRequest extends js.Object {
  var callbackURL: String
  var clientID: String
  var clientSecret: String
  var passReqToCallback: `true`
  var scope: js.UndefOr[js.Array[String]] = js.undefined
}

object StrategyOptionsWithRequest {
  @scala.inline
  def apply(
    callbackURL: String,
    clientID: String,
    clientSecret: String,
    passReqToCallback: `true`,
    scope: js.Array[String] = null
  ): StrategyOptionsWithRequest = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptionsWithRequest]
  }
}

