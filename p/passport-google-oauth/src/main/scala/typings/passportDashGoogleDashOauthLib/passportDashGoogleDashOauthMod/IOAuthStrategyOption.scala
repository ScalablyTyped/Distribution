package typings
package passportDashGoogleDashOauthLib.passportDashGoogleDashOauthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOAuthStrategyOption extends js.Object {
  var accessTokenURL: js.UndefOr[java.lang.String] = js.undefined
  var callbackURL: java.lang.String
  var consumerKey: java.lang.String
  var consumerSecret: java.lang.String
  var requestTokenURL: js.UndefOr[java.lang.String] = js.undefined
  var sessionKey: js.UndefOr[java.lang.String] = js.undefined
  var userAuthorizationURL: js.UndefOr[java.lang.String] = js.undefined
}

object IOAuthStrategyOption {
  @scala.inline
  def apply(
    callbackURL: java.lang.String,
    consumerKey: java.lang.String,
    consumerSecret: java.lang.String,
    accessTokenURL: java.lang.String = null,
    requestTokenURL: java.lang.String = null,
    sessionKey: java.lang.String = null,
    userAuthorizationURL: java.lang.String = null
  ): IOAuthStrategyOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callbackURL")(callbackURL)
    __obj.updateDynamic("consumerKey")(consumerKey)
    __obj.updateDynamic("consumerSecret")(consumerSecret)
    if (accessTokenURL != null) __obj.updateDynamic("accessTokenURL")(accessTokenURL)
    if (requestTokenURL != null) __obj.updateDynamic("requestTokenURL")(requestTokenURL)
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey)
    if (userAuthorizationURL != null) __obj.updateDynamic("userAuthorizationURL")(userAuthorizationURL)
    __obj.asInstanceOf[IOAuthStrategyOption]
  }
}

