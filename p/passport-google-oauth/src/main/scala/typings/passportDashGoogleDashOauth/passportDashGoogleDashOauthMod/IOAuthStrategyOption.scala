package typings.passportDashGoogleDashOauth.passportDashGoogleDashOauthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOAuthStrategyOption extends js.Object {
  var accessTokenURL: js.UndefOr[String] = js.undefined
  var callbackURL: String
  var consumerKey: String
  var consumerSecret: String
  var requestTokenURL: js.UndefOr[String] = js.undefined
  var sessionKey: js.UndefOr[String] = js.undefined
  var userAuthorizationURL: js.UndefOr[String] = js.undefined
}

object IOAuthStrategyOption {
  @scala.inline
  def apply(
    callbackURL: String,
    consumerKey: String,
    consumerSecret: String,
    accessTokenURL: String = null,
    requestTokenURL: String = null,
    sessionKey: String = null,
    userAuthorizationURL: String = null
  ): IOAuthStrategyOption = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, consumerKey = consumerKey, consumerSecret = consumerSecret)
    if (accessTokenURL != null) __obj.updateDynamic("accessTokenURL")(accessTokenURL)
    if (requestTokenURL != null) __obj.updateDynamic("requestTokenURL")(requestTokenURL)
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey)
    if (userAuthorizationURL != null) __obj.updateDynamic("userAuthorizationURL")(userAuthorizationURL)
    __obj.asInstanceOf[IOAuthStrategyOption]
  }
}

