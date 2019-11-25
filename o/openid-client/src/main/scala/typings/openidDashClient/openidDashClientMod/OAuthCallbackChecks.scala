package typings.openidDashClient.openidDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthCallbackChecks extends js.Object {
  /**
    * PKCE code_verifier to be sent to the token endpoint during code exchange. Use of this check is required
    * if you sent a code_challenge parameter into an authorization request.
    */
  var code_verifier: js.UndefOr[String] = js.undefined
  /**
    * When provided the authorization response will be checked for presence of required parameters for a
    * given response_type. Use of this check is recommended.
    */
  var response_type: js.UndefOr[String] = js.undefined
  /**
    * When provided the authorization response's state parameter will be checked to be the this expected one.
    * Use of this check is required if you sent a state parameter into an authorization request.
    */
  var state: js.UndefOr[String] = js.undefined
}

object OAuthCallbackChecks {
  @scala.inline
  def apply(code_verifier: String = null, response_type: String = null, state: String = null): OAuthCallbackChecks = {
    val __obj = js.Dynamic.literal()
    if (code_verifier != null) __obj.updateDynamic("code_verifier")(code_verifier.asInstanceOf[js.Any])
    if (response_type != null) __obj.updateDynamic("response_type")(response_type.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthCallbackChecks]
  }
}

