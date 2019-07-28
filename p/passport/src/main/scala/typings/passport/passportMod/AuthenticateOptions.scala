package typings.passport.passportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateOptions extends js.Object {
  var assignProperty: js.UndefOr[String] = js.undefined
  var authInfo: js.UndefOr[Boolean] = js.undefined
  var failWithError: js.UndefOr[Boolean] = js.undefined
  var failureFlash: js.UndefOr[String | Boolean] = js.undefined
  var failureMessage: js.UndefOr[Boolean | String] = js.undefined
  var failureRedirect: js.UndefOr[String] = js.undefined
  var passReqToCallback: js.UndefOr[Boolean] = js.undefined
  var pauseStream: js.UndefOr[Boolean] = js.undefined
  var prompt: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
  var session: js.UndefOr[Boolean] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var successFlash: js.UndefOr[String | Boolean] = js.undefined
  var successMessage: js.UndefOr[Boolean | String] = js.undefined
  var successRedirect: js.UndefOr[String] = js.undefined
  var successReturnToOrRedirect: js.UndefOr[String] = js.undefined
  var userProperty: js.UndefOr[String] = js.undefined
}

object AuthenticateOptions {
  @scala.inline
  def apply(
    assignProperty: String = null,
    authInfo: js.UndefOr[Boolean] = js.undefined,
    failWithError: js.UndefOr[Boolean] = js.undefined,
    failureFlash: String | Boolean = null,
    failureMessage: Boolean | String = null,
    failureRedirect: String = null,
    passReqToCallback: js.UndefOr[Boolean] = js.undefined,
    pauseStream: js.UndefOr[Boolean] = js.undefined,
    prompt: String = null,
    scope: String | js.Array[String] = null,
    session: js.UndefOr[Boolean] = js.undefined,
    state: String = null,
    successFlash: String | Boolean = null,
    successMessage: Boolean | String = null,
    successRedirect: String = null,
    successReturnToOrRedirect: String = null,
    userProperty: String = null
  ): AuthenticateOptions = {
    val __obj = js.Dynamic.literal()
    if (assignProperty != null) __obj.updateDynamic("assignProperty")(assignProperty)
    if (!js.isUndefined(authInfo)) __obj.updateDynamic("authInfo")(authInfo)
    if (!js.isUndefined(failWithError)) __obj.updateDynamic("failWithError")(failWithError)
    if (failureFlash != null) __obj.updateDynamic("failureFlash")(failureFlash.asInstanceOf[js.Any])
    if (failureMessage != null) __obj.updateDynamic("failureMessage")(failureMessage.asInstanceOf[js.Any])
    if (failureRedirect != null) __obj.updateDynamic("failureRedirect")(failureRedirect)
    if (!js.isUndefined(passReqToCallback)) __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    if (!js.isUndefined(pauseStream)) __obj.updateDynamic("pauseStream")(pauseStream)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session)
    if (state != null) __obj.updateDynamic("state")(state)
    if (successFlash != null) __obj.updateDynamic("successFlash")(successFlash.asInstanceOf[js.Any])
    if (successMessage != null) __obj.updateDynamic("successMessage")(successMessage.asInstanceOf[js.Any])
    if (successRedirect != null) __obj.updateDynamic("successRedirect")(successRedirect)
    if (successReturnToOrRedirect != null) __obj.updateDynamic("successReturnToOrRedirect")(successReturnToOrRedirect)
    if (userProperty != null) __obj.updateDynamic("userProperty")(userProperty)
    __obj.asInstanceOf[AuthenticateOptions]
  }
}

