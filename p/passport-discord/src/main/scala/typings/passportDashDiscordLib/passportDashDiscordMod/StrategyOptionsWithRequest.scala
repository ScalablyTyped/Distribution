package typings
package passportDashDiscordLib.passportDashDiscordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionsWithRequest extends _StrategyOptionsBase {
  var passReqToCallback: passportDashDiscordLib.passportDashDiscordLibNumbers.`true`
}

object StrategyOptionsWithRequest {
  @scala.inline
  def apply(
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    passReqToCallback: passportDashDiscordLib.passportDashDiscordLibNumbers.`true`,
    authorizationURL: java.lang.String = null,
    callbackURL: java.lang.String = null,
    customHeaders: nodeLib.httpMod.OutgoingHttpHeaders = null,
    scope: java.lang.String | js.Array[java.lang.String] = null,
    scopeSeparator: java.lang.String = null,
    sessionKey: java.lang.String = null,
    state: js.Any = null,
    store: passportDashOauth2Lib.passportDashOauth2Mod.StateStore = null,
    tokenURL: java.lang.String = null
  ): StrategyOptionsWithRequest = {
    val __obj = js.Dynamic.literal(clientID = clientID, clientSecret = clientSecret, passReqToCallback = passReqToCallback)
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL)
    if (callbackURL != null) __obj.updateDynamic("callbackURL")(callbackURL)
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator)
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey)
    if (state != null) __obj.updateDynamic("state")(state)
    if (store != null) __obj.updateDynamic("store")(store)
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL)
    __obj.asInstanceOf[StrategyOptionsWithRequest]
  }
}

