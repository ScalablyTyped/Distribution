package typings.passportDashNaver.passportDashNaverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionWithRequest extends StrategyOption {
  var passReqToCallback: Boolean
}

object StrategyOptionWithRequest {
  @scala.inline
  def apply(
    callbackURL: String,
    clientID: String,
    clientSecret: String,
    passReqToCallback: Boolean,
    authType: String = null,
    authorizationURL: String = null,
    profileURL: String = null,
    svcType: Int | Double = null,
    tokenURL: String = null
  ): StrategyOptionWithRequest = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, clientID = clientID, clientSecret = clientSecret, passReqToCallback = passReqToCallback)
    if (authType != null) __obj.updateDynamic("authType")(authType)
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL)
    if (profileURL != null) __obj.updateDynamic("profileURL")(profileURL)
    if (svcType != null) __obj.updateDynamic("svcType")(svcType.asInstanceOf[js.Any])
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL)
    __obj.asInstanceOf[StrategyOptionWithRequest]
  }
}

