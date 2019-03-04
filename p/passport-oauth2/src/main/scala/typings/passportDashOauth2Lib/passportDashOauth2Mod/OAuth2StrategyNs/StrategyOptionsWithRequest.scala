package typings
package passportDashOauth2Lib.passportDashOauth2Mod.OAuth2StrategyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionsWithRequest extends _StrategyOptionsBase {
  var passReqToCallback: passportDashOauth2Lib.passportDashOauth2LibNumbers.`true`
}

object StrategyOptionsWithRequest {
  @scala.inline
  def apply(
    authorizationURL: java.lang.String,
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    passReqToCallback: passportDashOauth2Lib.passportDashOauth2LibNumbers.`true`,
    tokenURL: java.lang.String,
    callbackURL: java.lang.String = null,
    customHeaders: nodeLib.httpMod.OutgoingHttpHeaders = null,
    scope: java.lang.String | js.Array[java.lang.String] = null,
    scopeSeparator: java.lang.String = null,
    sessionKey: java.lang.String = null,
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

