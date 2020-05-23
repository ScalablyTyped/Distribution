package typings.passportBnet.mod

import typings.node.httpMod.OutgoingHttpHeaders
import typings.passportOauth2.mod.StateStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// passport--bnet accepts any options that passport-oauth2 accepts, but add the option region and makes authorizationURL and tokenURL optional
/* Inlined parent std.Partial<passport-oauth2.passport-oauth2._StrategyOptionsBase> */
trait BaseBnetOptions extends js.Object {
  var authorizationURL: js.UndefOr[String] = js.undefined
  var callbackURL: js.UndefOr[String] = js.undefined
  var clientID: String
  var clientSecret: String
  var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  var pkce: js.UndefOr[Boolean] = js.undefined
  var proxy: js.UndefOr[js.Any] = js.undefined
  var region: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
  var scopeSeparator: js.UndefOr[String] = js.undefined
  var sessionKey: js.UndefOr[String] = js.undefined
  var skipUserProfile: js.UndefOr[js.Any] = js.undefined
  var state: js.UndefOr[js.Any] = js.undefined
  var store: js.UndefOr[StateStore] = js.undefined
  var tokenURL: js.UndefOr[String] = js.undefined
}

object BaseBnetOptions {
  @scala.inline
  def apply(
    clientID: String,
    clientSecret: String,
    authorizationURL: String = null,
    callbackURL: String = null,
    customHeaders: OutgoingHttpHeaders = null,
    pkce: js.UndefOr[Boolean] = js.undefined,
    proxy: js.Any = null,
    region: String = null,
    scope: String | js.Array[String] = null,
    scopeSeparator: String = null,
    sessionKey: String = null,
    skipUserProfile: js.Any = null,
    state: js.Any = null,
    store: StateStore = null,
    tokenURL: String = null
  ): BaseBnetOptions = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL.asInstanceOf[js.Any])
    if (callbackURL != null) __obj.updateDynamic("callbackURL")(callbackURL.asInstanceOf[js.Any])
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(pkce)) __obj.updateDynamic("pkce")(pkce.get.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator.asInstanceOf[js.Any])
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey.asInstanceOf[js.Any])
    if (skipUserProfile != null) __obj.updateDynamic("skipUserProfile")(skipUserProfile.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseBnetOptions]
  }
}

