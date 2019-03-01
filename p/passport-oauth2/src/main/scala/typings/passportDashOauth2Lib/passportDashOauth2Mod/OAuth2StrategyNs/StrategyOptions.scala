package typings
package passportDashOauth2Lib.passportDashOauth2Mod.OAuth2StrategyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptions extends _StrategyOptionsBase {
  var passReqToCallback: js.UndefOr[passportDashOauth2Lib.passportDashOauth2LibNumbers.`false`] = js.undefined
}

object StrategyOptions {
  @scala.inline
  def apply(
    authorizationURL: java.lang.String,
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    tokenURL: java.lang.String,
    callbackURL: java.lang.String = null,
    customHeaders: nodeLib.httpMod.OutgoingHttpHeaders = null,
    passReqToCallback: passportDashOauth2Lib.passportDashOauth2LibNumbers.`false` = null,
    scope: java.lang.String | js.Array[java.lang.String] = null,
    scopeSeparator: java.lang.String = null,
    sessionKey: java.lang.String = null,
    state: js.Any = null,
    store: StateStore = null
  ): StrategyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authorizationURL")(authorizationURL)
    __obj.updateDynamic("clientID")(clientID)
    __obj.updateDynamic("clientSecret")(clientSecret)
    __obj.updateDynamic("tokenURL")(tokenURL)
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

