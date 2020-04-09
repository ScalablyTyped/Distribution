package typings.passportOauth2.mod

import typings.node.httpMod.OutgoingHttpHeaders
import typings.passportOauth2.passportOauth2Booleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptions extends StrategyOptionsBase {
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
    pkce: js.UndefOr[Boolean] = js.undefined,
    proxy: js.Any = null,
    scope: String | js.Array[String] = null,
    scopeSeparator: String = null,
    sessionKey: String = null,
    skipUserProfile: js.Any = null,
    state: js.Any = null,
    store: StateStore = null
  ): StrategyOptions = {
    val __obj = js.Dynamic.literal(authorizationURL = authorizationURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], tokenURL = tokenURL.asInstanceOf[js.Any])
    if (callbackURL != null) __obj.updateDynamic("callbackURL")(callbackURL.asInstanceOf[js.Any])
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (passReqToCallback != null) __obj.updateDynamic("passReqToCallback")(passReqToCallback.asInstanceOf[js.Any])
    if (!js.isUndefined(pkce)) __obj.updateDynamic("pkce")(pkce.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator.asInstanceOf[js.Any])
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey.asInstanceOf[js.Any])
    if (skipUserProfile != null) __obj.updateDynamic("skipUserProfile")(skipUserProfile.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptions]
  }
}

