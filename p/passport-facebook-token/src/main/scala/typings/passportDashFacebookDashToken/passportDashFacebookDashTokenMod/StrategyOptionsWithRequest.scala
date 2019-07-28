package typings.passportDashFacebookDashToken.passportDashFacebookDashTokenMod

import typings.passportDashFacebookDashToken.passportDashFacebookDashTokenNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionsWithRequest extends StrategyOptions {
  var passReqToCallback: `true`
}

object StrategyOptionsWithRequest {
  @scala.inline
  def apply(
    clientID: String,
    clientSecret: String,
    passReqToCallback: `true`,
    authorizationURL: String = null,
    enableProof: js.UndefOr[Boolean] = js.undefined,
    profileFields: js.Array[String] = null,
    scopeSeparator: String = null,
    tokenURL: String = null
  ): StrategyOptionsWithRequest = {
    val __obj = js.Dynamic.literal(clientID = clientID, clientSecret = clientSecret, passReqToCallback = passReqToCallback)
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL)
    if (!js.isUndefined(enableProof)) __obj.updateDynamic("enableProof")(enableProof)
    if (profileFields != null) __obj.updateDynamic("profileFields")(profileFields)
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator)
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL)
    __obj.asInstanceOf[StrategyOptionsWithRequest]
  }
}

