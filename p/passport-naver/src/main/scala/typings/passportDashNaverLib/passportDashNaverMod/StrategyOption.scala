package typings
package passportDashNaverLib.passportDashNaverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOption extends js.Object {
  var authType: js.UndefOr[java.lang.String] = js.undefined
  var authorizationURL: js.UndefOr[java.lang.String] = js.undefined
  var callbackURL: java.lang.String
  var clientID: java.lang.String
  var clientSecret: java.lang.String
  var profileURL: js.UndefOr[java.lang.String] = js.undefined
  var svcType: js.UndefOr[scala.Double] = js.undefined
  var tokenURL: js.UndefOr[java.lang.String] = js.undefined
}

object StrategyOption {
  @scala.inline
  def apply(
    callbackURL: java.lang.String,
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    authType: java.lang.String = null,
    authorizationURL: java.lang.String = null,
    profileURL: java.lang.String = null,
    svcType: scala.Int | scala.Double = null,
    tokenURL: java.lang.String = null
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

