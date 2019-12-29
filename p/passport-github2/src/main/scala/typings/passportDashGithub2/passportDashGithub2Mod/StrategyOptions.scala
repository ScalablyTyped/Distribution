package typings.passportDashGithub2.passportDashGithub2Mod

import typings.node.httpMod.OutgoingHttpHeaders
import typings.passportDashGithub2.passportDashGithub2Booleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptions extends _StrategyOptionsBase {
  var passReqToCallback: js.UndefOr[`false`] = js.undefined
}

object StrategyOptions {
  @scala.inline
  def apply(
    callbackURL: String,
    clientID: String,
    clientSecret: String,
    authorizationURL: String = null,
    customHeaders: OutgoingHttpHeaders = null,
    passReqToCallback: `false` = null,
    scope: js.Array[String] = null,
    scopeSeparator: String = null,
    state: String = null,
    tokenURL: String = null,
    userAgent: String = null,
    userEmailURL: String = null,
    userProfileURL: String = null
  ): StrategyOptions = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL.asInstanceOf[js.Any])
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (passReqToCallback != null) __obj.updateDynamic("passReqToCallback")(passReqToCallback.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    if (userEmailURL != null) __obj.updateDynamic("userEmailURL")(userEmailURL.asInstanceOf[js.Any])
    if (userProfileURL != null) __obj.updateDynamic("userProfileURL")(userProfileURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptions]
  }
}

