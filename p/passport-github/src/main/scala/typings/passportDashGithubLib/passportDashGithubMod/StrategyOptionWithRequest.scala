package typings
package passportDashGithubLib.passportDashGithubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionWithRequest extends StrategyOptionBase {
  var passReqToCallback: passportDashGithubLib.passportDashGithubLibNumbers.`true`
}

object StrategyOptionWithRequest {
  @scala.inline
  def apply(
    callbackURL: java.lang.String,
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    passReqToCallback: passportDashGithubLib.passportDashGithubLibNumbers.`true`,
    authorizationURL: java.lang.String = null,
    customHeaders: nodeLib.httpMod.OutgoingHttpHeaders = null,
    scope: js.Array[java.lang.String] = null,
    scopeSeparator: java.lang.String = null,
    state: java.lang.String = null,
    tokenURL: java.lang.String = null,
    userAgent: java.lang.String = null,
    userProfileURL: java.lang.String = null
  ): StrategyOptionWithRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callbackURL")(callbackURL)
    __obj.updateDynamic("clientID")(clientID)
    __obj.updateDynamic("clientSecret")(clientSecret)
    __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL)
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator)
    if (state != null) __obj.updateDynamic("state")(state)
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    if (userProfileURL != null) __obj.updateDynamic("userProfileURL")(userProfileURL)
    __obj.asInstanceOf[StrategyOptionWithRequest]
  }
}

