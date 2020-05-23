package typings.passportNaver.mod

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
    svcType: js.UndefOr[Double] = js.undefined,
    tokenURL: String = null
  ): StrategyOption = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    if (authType != null) __obj.updateDynamic("authType")(authType.asInstanceOf[js.Any])
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL.asInstanceOf[js.Any])
    if (profileURL != null) __obj.updateDynamic("profileURL")(profileURL.asInstanceOf[js.Any])
    if (!js.isUndefined(svcType)) __obj.updateDynamic("svcType")(svcType.get.asInstanceOf[js.Any])
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOption]
  }
}

