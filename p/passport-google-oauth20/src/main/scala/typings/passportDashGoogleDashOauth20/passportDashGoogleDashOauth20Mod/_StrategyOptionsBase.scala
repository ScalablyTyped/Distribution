package typings.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Mod

import typings.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.offline
import typings.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.online
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<'authorizationURL' | 'tokenURL' | 'clientID' | 'clientSecret' | 'callbackURL' | 'customHeaders' | 'scope' | 'scopeSeparator' | 'sessionKey' | 'store' | 'state', 'authorizationURL' | 'tokenURL'> ]: passport-oauth2.passport-oauth2._StrategyOptionsBase[P]} */ trait _StrategyOptionsBase extends js.Object {
  var accessType: js.UndefOr[offline | online] = js.undefined
  var authorizationURL: js.UndefOr[String] = js.undefined
  var callbackURL: js.UndefOr[String] = js.undefined
  var clientID: String
  var clientSecret: String
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
  var tokenURL: js.UndefOr[String] = js.undefined
  var userProfileURL: js.UndefOr[String] = js.undefined
}

object _StrategyOptionsBase {
  @scala.inline
  def apply(
    clientID: String,
    clientSecret: String,
    accessType: offline | online = null,
    authorizationURL: String = null,
    callbackURL: String = null,
    scope: String | js.Array[String] = null,
    tokenURL: String = null,
    userProfileURL: String = null
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

