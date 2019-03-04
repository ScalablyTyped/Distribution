package typings
package passportDashGithub2Lib.passportDashGithub2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof passport-oauth2.passport-oauth2._StrategyOptionsBase, 'authorizationURL' | 'tokenURL'> ]: passport-oauth2.passport-oauth2._StrategyOptionsBase[P]} */ trait _StrategyOptionsBase extends js.Object {
  var authorizationURL: js.UndefOr[java.lang.String] = js.undefined
  var callbackURL: java.lang.String
  var clientID: java.lang.String
  var clientSecret: java.lang.String
  var customHeaders: js.UndefOr[nodeLib.httpMod.OutgoingHttpHeaders] = js.undefined
  var scope: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var scopeSeparator: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
  var tokenURL: js.UndefOr[java.lang.String] = js.undefined
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
  var userProfileURL: js.UndefOr[java.lang.String] = js.undefined
}

object _StrategyOptionsBase {
  @scala.inline
  def apply(
    callbackURL: java.lang.String,
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    authorizationURL: java.lang.String = null,
    customHeaders: nodeLib.httpMod.OutgoingHttpHeaders = null,
    scope: js.Array[java.lang.String] = null,
    scopeSeparator: java.lang.String = null,
    state: java.lang.String = null,
    tokenURL: java.lang.String = null,
    userAgent: java.lang.String = null,
    userProfileURL: java.lang.String = null
  ): _StrategyOptionsBase = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, clientID = clientID, clientSecret = clientSecret)
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL)
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator)
    if (state != null) __obj.updateDynamic("state")(state)
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    if (userProfileURL != null) __obj.updateDynamic("userProfileURL")(userProfileURL)
    __obj.asInstanceOf[_StrategyOptionsBase]
  }
}

