package typings
package passportDashGithub2Lib.passportDashGithub2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionsWithRequest extends _StrategyOptionsBase {
  var passReqToCallback: passportDashGithub2Lib.passportDashGithub2LibNumbers.`true`
}

object StrategyOptionsWithRequest {
  @scala.inline
  def apply(
    callbackURL: java.lang.String,
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    passReqToCallback: passportDashGithub2Lib.passportDashGithub2LibNumbers.`true`,
    authorizationURL: java.lang.String = null,
    customHeaders: nodeLib.httpMod.OutgoingHttpHeaders = null,
    scope: js.Array[java.lang.String] = null,
    scopeSeparator: java.lang.String = null,
    state: java.lang.String = null,
    tokenURL: java.lang.String = null,
    userAgent: java.lang.String = null,
    userProfileURL: java.lang.String = null
  ): StrategyOptionsWithRequest = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, clientID = clientID, clientSecret = clientSecret, passReqToCallback = passReqToCallback)
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL)
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator)
    if (state != null) __obj.updateDynamic("state")(state)
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    if (userProfileURL != null) __obj.updateDynamic("userProfileURL")(userProfileURL)
    __obj.asInstanceOf[StrategyOptionsWithRequest]
  }
}

