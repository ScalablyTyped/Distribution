package typings.passportDashGithub.passportDashGithubMod

import typings.node.httpMod.OutgoingHttpHeaders
import typings.passportDashGithub.passportDashGithubNumbers.`false`
import typings.passportDashOauth2.passportDashOauth2Mod.StateStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptions extends _StrategyOptionsBase {
  var passReqToCallback: js.UndefOr[`false`] = js.undefined
}

object StrategyOptions {
  @scala.inline
  def apply(
    clientID: String,
    clientSecret: String,
    authorizationURL: String = null,
    callbackURL: String = null,
    customHeaders: OutgoingHttpHeaders = null,
    passReqToCallback: `false` = null,
    scope: String | js.Array[String] = null,
    scopeSeparator: String = null,
    sessionKey: String = null,
    state: String = null,
    store: StateStore = null,
    tokenURL: String = null,
    userAgent: String = null,
    userProfileURL: String = null
  ): StrategyOptions = {
    val __obj = js.Dynamic.literal(clientID = clientID, clientSecret = clientSecret)
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL)
    if (callbackURL != null) __obj.updateDynamic("callbackURL")(callbackURL)
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (passReqToCallback != null) __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator)
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey)
    if (state != null) __obj.updateDynamic("state")(state)
    if (store != null) __obj.updateDynamic("store")(store)
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    if (userProfileURL != null) __obj.updateDynamic("userProfileURL")(userProfileURL)
    __obj.asInstanceOf[StrategyOptions]
  }
}

