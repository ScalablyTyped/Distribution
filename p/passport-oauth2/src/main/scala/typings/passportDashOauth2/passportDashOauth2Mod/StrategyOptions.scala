package typings.passportDashOauth2.passportDashOauth2Mod

import typings.node.httpMod.OutgoingHttpHeaders
import typings.passportDashOauth2.passportDashOauth2Numbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptions extends _StrategyOptionsBase {
  var passReqToCallback: js.UndefOr[`false`] = js.undefined
}

object StrategyOptions {
  @scala.inline
  def apply(
    authorizationURL: String,
    clientID: String,
    clientSecret: String,
    tokenURL: String,
    callbackURL: String = null,
    customHeaders: OutgoingHttpHeaders = null,
    passReqToCallback: `false` = null,
    scope: String | js.Array[String] = null,
    scopeSeparator: String = null,
    sessionKey: String = null,
    state: js.Any = null,
    store: StateStore = null
  ): StrategyOptions = {
    val __obj = js.Dynamic.literal(authorizationURL = authorizationURL, clientID = clientID, clientSecret = clientSecret, tokenURL = tokenURL)
    if (callbackURL != null) __obj.updateDynamic("callbackURL")(callbackURL)
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (passReqToCallback != null) __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator)
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey)
    if (state != null) __obj.updateDynamic("state")(state)
    if (store != null) __obj.updateDynamic("store")(store)
    __obj.asInstanceOf[StrategyOptions]
  }
}

