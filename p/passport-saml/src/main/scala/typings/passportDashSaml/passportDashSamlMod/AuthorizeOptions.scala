package typings.passportDashSaml.passportDashSamlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizeOptions extends AuthenticateOptions {
  var samlFallback: js.UndefOr[String] = js.undefined
}

object AuthorizeOptions {
  @scala.inline
  def apply(
    additionalParams: js.Object = null,
    assignProperty: String = null,
    authInfo: js.UndefOr[Boolean] = js.undefined,
    failWithError: js.UndefOr[Boolean] = js.undefined,
    failureFlash: String | Boolean = null,
    failureMessage: Boolean | String = null,
    failureRedirect: String = null,
    passReqToCallback: js.UndefOr[Boolean] = js.undefined,
    pauseStream: js.UndefOr[Boolean] = js.undefined,
    prompt: String = null,
    samlFallback: String = null,
    scope: String | js.Array[String] = null,
    session: js.UndefOr[Boolean] = js.undefined,
    state: String = null,
    successFlash: String | Boolean = null,
    successMessage: Boolean | String = null,
    successRedirect: String = null,
    successReturnToOrRedirect: String = null,
    userProperty: String = null
  ): AuthorizeOptions = {
    val __obj = js.Dynamic.literal()
    if (additionalParams != null) __obj.updateDynamic("additionalParams")(additionalParams)
    if (assignProperty != null) __obj.updateDynamic("assignProperty")(assignProperty)
    if (!js.isUndefined(authInfo)) __obj.updateDynamic("authInfo")(authInfo)
    if (!js.isUndefined(failWithError)) __obj.updateDynamic("failWithError")(failWithError)
    if (failureFlash != null) __obj.updateDynamic("failureFlash")(failureFlash.asInstanceOf[js.Any])
    if (failureMessage != null) __obj.updateDynamic("failureMessage")(failureMessage.asInstanceOf[js.Any])
    if (failureRedirect != null) __obj.updateDynamic("failureRedirect")(failureRedirect)
    if (!js.isUndefined(passReqToCallback)) __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    if (!js.isUndefined(pauseStream)) __obj.updateDynamic("pauseStream")(pauseStream)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (samlFallback != null) __obj.updateDynamic("samlFallback")(samlFallback)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session)
    if (state != null) __obj.updateDynamic("state")(state)
    if (successFlash != null) __obj.updateDynamic("successFlash")(successFlash.asInstanceOf[js.Any])
    if (successMessage != null) __obj.updateDynamic("successMessage")(successMessage.asInstanceOf[js.Any])
    if (successRedirect != null) __obj.updateDynamic("successRedirect")(successRedirect)
    if (successReturnToOrRedirect != null) __obj.updateDynamic("successReturnToOrRedirect")(successReturnToOrRedirect)
    if (userProperty != null) __obj.updateDynamic("userProperty")(userProperty)
    __obj.asInstanceOf[AuthorizeOptions]
  }
}

