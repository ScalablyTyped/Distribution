package typings.openidDashClient.openidDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenIDCallbackChecks extends OAuthCallbackChecks {
  /**
    * When provided the authorization response's ID Token auth_time parameter will be checked to be conform to the
    * max_age value. Use of this check is required if you sent a max_age parameter into an authorization request.
    */
  var max_age: js.UndefOr[Double] = js.undefined
  /**
    * When provided the authorization response's ID Token nonce parameter will be checked to be the this expected
    * one. Use of this check is required if you sent a nonce parameter into an authorization request.
    */
  var nonce: js.UndefOr[String] = js.undefined
}

object OpenIDCallbackChecks {
  @scala.inline
  def apply(
    code_verifier: String = null,
    max_age: Int | Double = null,
    nonce: String = null,
    response_type: String = null,
    state: String = null
  ): OpenIDCallbackChecks = {
    val __obj = js.Dynamic.literal()
    if (code_verifier != null) __obj.updateDynamic("code_verifier")(code_verifier.asInstanceOf[js.Any])
    if (max_age != null) __obj.updateDynamic("max_age")(max_age.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (response_type != null) __obj.updateDynamic("response_type")(response_type.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenIDCallbackChecks]
  }
}

