package typings.passportDashOauth2.passportDashOauth2Mod

import typings.node.httpMod.OutgoingHttpHeaders
import typings.passportDashOauth2.passportDashOauth2Numbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionsWithRequest extends _StrategyOptionsBase {
  var passReqToCallback: `true`
}

object StrategyOptionsWithRequest {
  @scala.inline
  def apply(
    authorizationURL: String,
    clientID: String,
    clientSecret: String,
    passReqToCallback: `true`,
    tokenURL: String,
    callbackURL: String = null,
    customHeaders: OutgoingHttpHeaders = null,
    scope: String | js.Array[String] = null,
    scopeSeparator: String = null,
    sessionKey: String = null,
    state: js.Any = null,
    store: StateStore = null
  ): StrategyOptionsWithRequest = {
    val __obj = js.Dynamic.literal(authorizationURL = authorizationURL, clientID = clientID, clientSecret = clientSecret, passReqToCallback = passReqToCallback, tokenURL = tokenURL)
    if (callbackURL != null) __obj.updateDynamic("callbackURL")(callbackURL)
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator)
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey)
    if (state != null) __obj.updateDynamic("state")(state)
    if (store != null) __obj.updateDynamic("store")(store)
    __obj.asInstanceOf[StrategyOptionsWithRequest]
  }
}

