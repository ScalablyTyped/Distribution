package typings.passportFacebookToken.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptions extends js.Object {
  var authorizationURL: js.UndefOr[String] = js.undefined
  var clientID: String
  var clientSecret: String
  var enableProof: js.UndefOr[Boolean] = js.undefined
  var fbGraphVersion: js.UndefOr[String] = js.undefined
  var profileFields: js.UndefOr[js.Array[String]] = js.undefined
  var scopeSeparator: js.UndefOr[String] = js.undefined
  var tokenURL: js.UndefOr[String] = js.undefined
}

object StrategyOptions {
  @scala.inline
  def apply(
    clientID: String,
    clientSecret: String,
    authorizationURL: String = null,
    enableProof: js.UndefOr[Boolean] = js.undefined,
    fbGraphVersion: String = null,
    profileFields: js.Array[String] = null,
    scopeSeparator: String = null,
    tokenURL: String = null
  ): StrategyOptions = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL.asInstanceOf[js.Any])
    if (!js.isUndefined(enableProof)) __obj.updateDynamic("enableProof")(enableProof.asInstanceOf[js.Any])
    if (fbGraphVersion != null) __obj.updateDynamic("fbGraphVersion")(fbGraphVersion.asInstanceOf[js.Any])
    if (profileFields != null) __obj.updateDynamic("profileFields")(profileFields.asInstanceOf[js.Any])
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator.asInstanceOf[js.Any])
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptions]
  }
}

