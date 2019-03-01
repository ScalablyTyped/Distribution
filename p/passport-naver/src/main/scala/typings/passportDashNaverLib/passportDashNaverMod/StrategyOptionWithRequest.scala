package typings
package passportDashNaverLib.passportDashNaverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionWithRequest extends StrategyOption {
  var passReqToCallback: scala.Boolean
}

object StrategyOptionWithRequest {
  @scala.inline
  def apply(
    callbackURL: java.lang.String,
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    passReqToCallback: scala.Boolean,
    authType: java.lang.String = null,
    authorizationURL: java.lang.String = null,
    profileURL: java.lang.String = null,
    svcType: scala.Int | scala.Double = null,
    tokenURL: java.lang.String = null
  ): StrategyOptionWithRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callbackURL")(callbackURL)
    __obj.updateDynamic("clientID")(clientID)
    __obj.updateDynamic("clientSecret")(clientSecret)
    __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    if (authType != null) __obj.updateDynamic("authType")(authType)
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL)
    if (profileURL != null) __obj.updateDynamic("profileURL")(profileURL)
    if (svcType != null) __obj.updateDynamic("svcType")(svcType.asInstanceOf[js.Any])
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL)
    __obj.asInstanceOf[StrategyOptionWithRequest]
  }
}

