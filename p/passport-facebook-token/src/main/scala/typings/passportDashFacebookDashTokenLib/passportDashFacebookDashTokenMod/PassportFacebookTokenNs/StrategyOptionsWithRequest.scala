package typings
package passportDashFacebookDashTokenLib.passportDashFacebookDashTokenMod.PassportFacebookTokenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionsWithRequest extends StrategyOptions {
  var passReqToCallback: passportDashFacebookDashTokenLib.passportDashFacebookDashTokenLibNumbers.`true`
}

object StrategyOptionsWithRequest {
  @scala.inline
  def apply(
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    passReqToCallback: passportDashFacebookDashTokenLib.passportDashFacebookDashTokenLibNumbers.`true`,
    authorizationURL: java.lang.String = null,
    enableProof: js.UndefOr[scala.Boolean] = js.undefined,
    profileFields: js.Array[java.lang.String] = null,
    scopeSeparator: java.lang.String = null,
    tokenURL: java.lang.String = null
  ): StrategyOptionsWithRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientID")(clientID)
    __obj.updateDynamic("clientSecret")(clientSecret)
    __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL)
    if (!js.isUndefined(enableProof)) __obj.updateDynamic("enableProof")(enableProof)
    if (profileFields != null) __obj.updateDynamic("profileFields")(profileFields)
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator)
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL)
    __obj.asInstanceOf[StrategyOptionsWithRequest]
  }
}

