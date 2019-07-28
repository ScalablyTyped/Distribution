package typings.passportDashGithub2.passportDashGithub2Mod

import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<'authorizationURL' | 'tokenURL' | 'clientID' | 'clientSecret' | 'callbackURL' | 'customHeaders' | 'scope' | 'scopeSeparator' | 'sessionKey' | 'store' | 'state', 'authorizationURL' | 'tokenURL'> ]: passport-oauth2.passport-oauth2._StrategyOptionsBase[P]} */ trait _StrategyOptionsBase extends js.Object {
  var authorizationURL: js.UndefOr[String] = js.undefined
  var callbackURL: String
  var clientID: String
  var clientSecret: String
  var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  var scope: js.UndefOr[js.Array[String]] = js.undefined
  var scopeSeparator: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var tokenURL: js.UndefOr[String] = js.undefined
  var userAgent: js.UndefOr[String] = js.undefined
  var userEmailURL: js.UndefOr[String] = js.undefined
  var userProfileURL: js.UndefOr[String] = js.undefined
}

object _StrategyOptionsBase {
  @scala.inline
  def apply(
    callbackURL: String,
    clientID: String,
    clientSecret: String,
    authorizationURL: String = null,
    customHeaders: OutgoingHttpHeaders = null,
    scope: js.Array[String] = null,
    scopeSeparator: String = null,
    state: String = null,
    tokenURL: String = null,
    userAgent: String = null,
    userEmailURL: String = null,
    userProfileURL: String = null
  ): _StrategyOptionsBase = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, clientID = clientID, clientSecret = clientSecret)
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL)
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator)
    if (state != null) __obj.updateDynamic("state")(state)
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    if (userEmailURL != null) __obj.updateDynamic("userEmailURL")(userEmailURL)
    if (userProfileURL != null) __obj.updateDynamic("userProfileURL")(userProfileURL)
    __obj.asInstanceOf[_StrategyOptionsBase]
  }
}

