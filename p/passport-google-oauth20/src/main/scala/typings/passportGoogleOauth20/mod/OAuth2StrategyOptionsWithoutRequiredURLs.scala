package typings.passportGoogleOauth20.mod

import typings.node.httpMod.OutgoingHttpHeaders
import typings.passportOauth2.mod.StateStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<passport-oauth2.passport-oauth2._StrategyOptionsBase, std.Exclude<keyof passport-oauth2.passport-oauth2._StrategyOptionsBase, 'authorizationURL' | 'tokenURL'>> */
trait OAuth2StrategyOptionsWithoutRequiredURLs extends js.Object {
  var callbackURL: js.UndefOr[String] = js.undefined
  var clientID: String
  var clientSecret: String
  var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  var pkce: js.UndefOr[Boolean] = js.undefined
  var proxy: js.UndefOr[js.Any] = js.undefined
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
  var scopeSeparator: js.UndefOr[String] = js.undefined
  var sessionKey: js.UndefOr[String] = js.undefined
  var skipUserProfile: js.UndefOr[js.Any] = js.undefined
  var state: js.UndefOr[js.Any] = js.undefined
  var store: js.UndefOr[StateStore] = js.undefined
}

object OAuth2StrategyOptionsWithoutRequiredURLs {
  @scala.inline
  def apply(
    clientID: String,
    clientSecret: String,
    callbackURL: String = null,
    customHeaders: OutgoingHttpHeaders = null,
    pkce: js.UndefOr[Boolean] = js.undefined,
    proxy: js.Any = null,
    scope: String | js.Array[String] = null,
    scopeSeparator: String = null,
    sessionKey: String = null,
    skipUserProfile: js.Any = null,
    state: js.Any = null,
    store: StateStore = null
  ): OAuth2StrategyOptionsWithoutRequiredURLs = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    if (callbackURL != null) __obj.updateDynamic("callbackURL")(callbackURL.asInstanceOf[js.Any])
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(pkce)) __obj.updateDynamic("pkce")(pkce.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator.asInstanceOf[js.Any])
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey.asInstanceOf[js.Any])
    if (skipUserProfile != null) __obj.updateDynamic("skipUserProfile")(skipUserProfile.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2StrategyOptionsWithoutRequiredURLs]
  }
}

