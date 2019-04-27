package typings
package passportDashGithubLib.passportDashGithubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _StrategyOptionsBase extends js.Object {
  var authorizationURL: js.UndefOr[java.lang.String] = js.undefined
  var callbackURL: js.UndefOr[java.lang.String] = js.undefined
  var clientID: java.lang.String
  var clientSecret: java.lang.String
  var customHeaders: js.UndefOr[nodeLib.httpMod.OutgoingHttpHeaders] = js.undefined
  var scope: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var scopeSeparator: js.UndefOr[java.lang.String] = js.undefined
  var sessionKey: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
  var store: js.UndefOr[passportDashOauth2Lib.passportDashOauth2Mod.StateStore] = js.undefined
  var tokenURL: js.UndefOr[java.lang.String] = js.undefined
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
  var userProfileURL: js.UndefOr[java.lang.String] = js.undefined
}

object _StrategyOptionsBase {
  @scala.inline
  def apply(
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    authorizationURL: java.lang.String = null,
    callbackURL: java.lang.String = null,
    customHeaders: nodeLib.httpMod.OutgoingHttpHeaders = null,
    scope: java.lang.String | js.Array[java.lang.String] = null,
    scopeSeparator: java.lang.String = null,
    sessionKey: java.lang.String = null,
    state: java.lang.String = null,
    store: passportDashOauth2Lib.passportDashOauth2Mod.StateStore = null,
    tokenURL: java.lang.String = null,
    userAgent: java.lang.String = null,
    userProfileURL: java.lang.String = null
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
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    if (userProfileURL != null) __obj.updateDynamic("userProfileURL")(userProfileURL)
    __obj.asInstanceOf[_StrategyOptionsBase]
  }
}

