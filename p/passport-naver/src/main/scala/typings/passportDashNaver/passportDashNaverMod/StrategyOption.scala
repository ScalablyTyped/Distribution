package typings.passportDashNaver.passportDashNaverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOption extends js.Object {
  var authType: js.UndefOr[String] = js.undefined
  var authorizationURL: js.UndefOr[String] = js.undefined
  var callbackURL: String
  var clientID: String
  var clientSecret: String
  var profileURL: js.UndefOr[String] = js.undefined
  var svcType: js.UndefOr[Double] = js.undefined
  var tokenURL: js.UndefOr[String] = js.undefined
}

object StrategyOption {
  @scala.inline
  def apply(
    callbackURL: String,
    clientID: String,
    clientSecret: String,
    authType: String = null,
    authorizationURL: String = null,
    profileURL: String = null,
    svcType: Int | Double = null,
    tokenURL: String = null
  ): StrategyOption = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, clientID = clientID, clientSecret = clientSecret)
    if (authType != null) __obj.updateDynamic("authType")(authType)
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL)
    if (profileURL != null) __obj.updateDynamic("profileURL")(profileURL)
    if (svcType != null) __obj.updateDynamic("svcType")(svcType.asInstanceOf[js.Any])
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL)
    __obj.asInstanceOf[StrategyOption]
  }
}

