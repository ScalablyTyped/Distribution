package typings
package passportDashGoogleDashOauth2Lib.passportDashGoogleDashOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionsWithRequest extends js.Object {
  var callbackURL: java.lang.String
  var clientID: java.lang.String
  var clientSecret: java.lang.String
  var passReqToCallback: passportDashGoogleDashOauth2Lib.passportDashGoogleDashOauth2LibNumbers.`true`
  var scope: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object StrategyOptionsWithRequest {
  @scala.inline
  def apply(
    callbackURL: java.lang.String,
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    passReqToCallback: passportDashGoogleDashOauth2Lib.passportDashGoogleDashOauth2LibNumbers.`true`,
    scope: js.Array[java.lang.String] = null
  ): StrategyOptionsWithRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callbackURL")(callbackURL)
    __obj.updateDynamic("clientID")(clientID)
    __obj.updateDynamic("clientSecret")(clientSecret)
    __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[StrategyOptionsWithRequest]
  }
}

