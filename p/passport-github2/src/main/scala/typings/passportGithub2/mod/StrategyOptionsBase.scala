package typings.passportGithub2.mod

import typings.node.httpMod.OutgoingHttpHeaders
import typings.passportOauth2.mod.StateStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionsBase extends OAuth2StrategyOptionsWithoutRequiredURLs {
  var authorizationURL: js.UndefOr[String] = js.undefined
  @JSName("callbackURL")
  var callbackURL_StrategyOptionsBase: String
  @JSName("scope")
  var scope_StrategyOptionsBase: js.UndefOr[js.Array[String]] = js.undefined
  @JSName("state")
  var state_StrategyOptionsBase: js.UndefOr[String] = js.undefined
  var tokenURL: js.UndefOr[String] = js.undefined
  var userAgent: js.UndefOr[String] = js.undefined
  var userEmailURL: js.UndefOr[String] = js.undefined
  var userProfileURL: js.UndefOr[String] = js.undefined
}

object StrategyOptionsBase {
  @scala.inline
  def apply(
    callbackURL: String,
    clientID: String,
    clientSecret: String,
    authorizationURL: String = null,
    customHeaders: OutgoingHttpHeaders = null,
    pkce: js.UndefOr[Boolean] = js.undefined,
    proxy: js.Any = null,
    scope: js.Array[String] = null,
    scopeSeparator: String = null,
    sessionKey: String = null,
    skipUserProfile: js.Any = null,
    state: String = null,
    store: StateStore = null,
    tokenURL: String = null,
    userAgent: String = null,
    userEmailURL: String = null,
    userProfileURL: String = null
  ): StrategyOptionsBase = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL.asInstanceOf[js.Any])
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(pkce)) __obj.updateDynamic("pkce")(pkce.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator.asInstanceOf[js.Any])
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey.asInstanceOf[js.Any])
    if (skipUserProfile != null) __obj.updateDynamic("skipUserProfile")(skipUserProfile.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    if (userEmailURL != null) __obj.updateDynamic("userEmailURL")(userEmailURL.asInstanceOf[js.Any])
    if (userProfileURL != null) __obj.updateDynamic("userProfileURL")(userProfileURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptionsBase]
  }
}

