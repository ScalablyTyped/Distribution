package typings.passportDashGithub2.passportDashGithub2Mod

import typings.node.httpMod.OutgoingHttpHeaders
import typings.passportDashGithub2.passportDashGithub2Numbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionsWithRequest extends _StrategyOptionsBase {
  var passReqToCallback: `true`
}

object StrategyOptionsWithRequest {
  @scala.inline
  def apply(
    callbackURL: String,
    clientID: String,
    clientSecret: String,
    passReqToCallback: `true`,
    authorizationURL: String = null,
    customHeaders: OutgoingHttpHeaders = null,
    scope: js.Array[String] = null,
    scopeSeparator: String = null,
    state: String = null,
    tokenURL: String = null,
    userAgent: String = null,
    userEmailURL: String = null,
    userProfileURL: String = null
  ): StrategyOptionsWithRequest = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, clientID = clientID, clientSecret = clientSecret, passReqToCallback = passReqToCallback)
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL)
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator)
    if (state != null) __obj.updateDynamic("state")(state)
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    if (userEmailURL != null) __obj.updateDynamic("userEmailURL")(userEmailURL)
    if (userProfileURL != null) __obj.updateDynamic("userProfileURL")(userProfileURL)
    __obj.asInstanceOf[StrategyOptionsWithRequest]
  }
}

