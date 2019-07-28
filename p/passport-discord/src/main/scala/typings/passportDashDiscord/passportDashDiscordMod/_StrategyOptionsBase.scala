package typings.passportDashDiscord.passportDashDiscordMod

import typings.node.httpMod.OutgoingHttpHeaders
import typings.passportDashOauth2.passportDashOauth2Mod.StateStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _StrategyOptionsBase extends js.Object {
  var authorizationURL: js.UndefOr[String] = js.undefined
  var callbackURL: js.UndefOr[String] = js.undefined
  var clientID: String
  var clientSecret: String
  var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  /** @see https://discordapp.com/developers/docs/topics/oauth2#shared-resources-oauth2-scopes */
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
  var scopeSeparator: js.UndefOr[String] = js.undefined
  var sessionKey: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[js.Any] = js.undefined
  var store: js.UndefOr[StateStore] = js.undefined
  var tokenURL: js.UndefOr[String] = js.undefined
}

object _StrategyOptionsBase {
  @scala.inline
  def apply(
    clientID: String,
    clientSecret: String,
    authorizationURL: String = null,
    callbackURL: String = null,
    customHeaders: OutgoingHttpHeaders = null,
    scope: String | js.Array[String] = null,
    scopeSeparator: String = null,
    sessionKey: String = null,
    state: js.Any = null,
    store: StateStore = null,
    tokenURL: String = null
  ): _StrategyOptionsBase = {
    val __obj = js.Dynamic.literal(clientID = clientID, clientSecret = clientSecret)
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL)
    if (callbackURL != null) __obj.updateDynamic("callbackURL")(callbackURL)
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator)
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey)
    if (state != null) __obj.updateDynamic("state")(state)
    if (store != null) __obj.updateDynamic("store")(store)
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL)
    __obj.asInstanceOf[_StrategyOptionsBase]
  }
}

