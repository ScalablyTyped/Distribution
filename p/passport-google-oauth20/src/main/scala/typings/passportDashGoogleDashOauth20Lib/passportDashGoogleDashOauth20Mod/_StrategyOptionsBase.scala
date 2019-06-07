package typings
package passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<'authorizationURL' | 'tokenURL' | 'clientID' | 'clientSecret' | 'callbackURL' | 'customHeaders' | 'scope' | 'scopeSeparator' | 'sessionKey' | 'store' | 'state', 'authorizationURL' | 'tokenURL'> ]: passport-oauth2.passport-oauth2._StrategyOptionsBase[P]} */ trait _StrategyOptionsBase extends js.Object {
  var accessType: js.UndefOr[
    passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20LibStrings.offline | passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20LibStrings.online
  ] = js.undefined
  var authorizationURL: js.UndefOr[java.lang.String] = js.undefined
  var callbackURL: js.UndefOr[java.lang.String] = js.undefined
  var clientID: java.lang.String
  var clientSecret: java.lang.String
  var scope: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var tokenURL: js.UndefOr[java.lang.String] = js.undefined
  var userProfileURL: js.UndefOr[java.lang.String] = js.undefined
}

object _StrategyOptionsBase {
  @scala.inline
  def apply(
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    accessType: passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20LibStrings.offline | passportDashGoogleDashOauth20Lib.passportDashGoogleDashOauth20LibStrings.online = null,
    authorizationURL: java.lang.String = null,
    callbackURL: java.lang.String = null,
    scope: java.lang.String | js.Array[java.lang.String] = null,
    tokenURL: java.lang.String = null,
    userProfileURL: java.lang.String = null
  ): _StrategyOptionsBase = {
    val __obj = js.Dynamic.literal(clientID = clientID, clientSecret = clientSecret)
    if (accessType != null) __obj.updateDynamic("accessType")(accessType.asInstanceOf[js.Any])
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL)
    if (callbackURL != null) __obj.updateDynamic("callbackURL")(callbackURL)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL)
    if (userProfileURL != null) __obj.updateDynamic("userProfileURL")(userProfileURL)
    __obj.asInstanceOf[_StrategyOptionsBase]
  }
}

