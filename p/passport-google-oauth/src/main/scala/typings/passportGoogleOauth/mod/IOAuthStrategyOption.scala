package typings.passportGoogleOauth.mod

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
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any])
    if (accessTokenURL != null) __obj.updateDynamic("accessTokenURL")(accessTokenURL.asInstanceOf[js.Any])
    if (requestTokenURL != null) __obj.updateDynamic("requestTokenURL")(requestTokenURL.asInstanceOf[js.Any])
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey.asInstanceOf[js.Any])
    if (userAuthorizationURL != null) __obj.updateDynamic("userAuthorizationURL")(userAuthorizationURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOAuthStrategyOption]
  }
}

