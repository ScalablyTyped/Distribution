package typings
package openidDashClientLib.openidDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationUrlParameters extends js.Object {
  val code_challenge: js.UndefOr[java.lang.String] = js.undefined
  val code_challenge_method: js.UndefOr[java.lang.String] = js.undefined
  val nonce: js.UndefOr[java.lang.String] = js.undefined
  val redirect_uri: js.UndefOr[java.lang.String] = js.undefined
  val resource: js.UndefOr[java.lang.String] = js.undefined
  val response_mode: js.UndefOr[java.lang.String] = js.undefined
  val response_type: js.UndefOr[java.lang.String] = js.undefined
  val scope: js.UndefOr[java.lang.String] = js.undefined
}

object AuthorizationUrlParameters {
  @scala.inline
  def apply(
    code_challenge: java.lang.String = null,
    code_challenge_method: java.lang.String = null,
    nonce: java.lang.String = null,
    redirect_uri: java.lang.String = null,
    resource: java.lang.String = null,
    response_mode: java.lang.String = null,
    response_type: java.lang.String = null,
    scope: java.lang.String = null
  ): AuthorizationUrlParameters = {
    val __obj = js.Dynamic.literal()
    if (code_challenge != null) __obj.updateDynamic("code_challenge")(code_challenge)
    if (code_challenge_method != null) __obj.updateDynamic("code_challenge_method")(code_challenge_method)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (response_mode != null) __obj.updateDynamic("response_mode")(response_mode)
    if (response_type != null) __obj.updateDynamic("response_type")(response_type)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[AuthorizationUrlParameters]
  }
}

