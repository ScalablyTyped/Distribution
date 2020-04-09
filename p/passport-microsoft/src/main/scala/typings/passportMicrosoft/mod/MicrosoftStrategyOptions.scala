package typings.passportMicrosoft.mod

import typings.node.httpMod.OutgoingHttpHeaders
import typings.passportMicrosoft.passportMicrosoftBooleans.`false`
import typings.passportOauth2.mod.StateStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<passport-oauth2.passport-oauth2.StrategyOptions, passport-microsoft.passport-microsoft.OptionalOptionParameters> & std.Partial<passport-oauth2.passport-oauth2.StrategyOptions> */
trait MicrosoftStrategyOptions extends js.Object {
  var authorizationURL: js.UndefOr[String] = js.undefined
  var callbackURL: js.UndefOr[String] = js.undefined
  var clientID: js.UndefOr[String] = js.undefined
  var clientSecret: js.UndefOr[String] = js.undefined
  var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  var passReqToCallback: js.UndefOr[`false`] = js.undefined
  var pkce: js.UndefOr[Boolean] = js.undefined
  var proxy: js.UndefOr[js.Any] = js.undefined
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
  var scopeSeparator: js.UndefOr[String] = js.undefined
  var sessionKey: js.UndefOr[String] = js.undefined
  var skipUserProfile: js.UndefOr[js.Any] = js.undefined
  var state: js.UndefOr[js.Any] = js.undefined
  var store: js.UndefOr[StateStore] = js.undefined
  var tokenURL: js.UndefOr[String] = js.undefined
}

object MicrosoftStrategyOptions {
  @scala.inline
  def apply(
    authorizationURL: String = null,
    callbackURL: String = null,
    clientID: String = null,
    clientSecret: String = null,
    customHeaders: OutgoingHttpHeaders = null,
    passReqToCallback: `false` = null,
    pkce: js.UndefOr[Boolean] = js.undefined,
    proxy: js.Any = null,
    scope: String | js.Array[String] = null,
    scopeSeparator: String = null,
    sessionKey: String = null,
    skipUserProfile: js.Any = null,
    state: js.Any = null,
    store: StateStore = null,
    tokenURL: String = null
  ): MicrosoftStrategyOptions = {
    val __obj = js.Dynamic.literal()
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL.asInstanceOf[js.Any])
    if (callbackURL != null) __obj.updateDynamic("callbackURL")(callbackURL.asInstanceOf[js.Any])
    if (clientID != null) __obj.updateDynamic("clientID")(clientID.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret.asInstanceOf[js.Any])
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
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[MicrosoftStrategyOptions]
  }
}

