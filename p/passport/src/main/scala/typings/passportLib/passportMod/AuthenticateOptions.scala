package typings
package passportLib.passportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateOptions extends js.Object {
  var assignProperty: js.UndefOr[java.lang.String] = js.undefined
  var authInfo: js.UndefOr[scala.Boolean] = js.undefined
  var failWithError: js.UndefOr[scala.Boolean] = js.undefined
  var failureFlash: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var failureMessage: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var failureRedirect: js.UndefOr[java.lang.String] = js.undefined
  var passReqToCallback: js.UndefOr[scala.Boolean] = js.undefined
  var pauseStream: js.UndefOr[scala.Boolean] = js.undefined
  var prompt: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var session: js.UndefOr[scala.Boolean] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
  var successFlash: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var successMessage: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var successRedirect: js.UndefOr[java.lang.String] = js.undefined
  var successReturnToOrRedirect: js.UndefOr[java.lang.String] = js.undefined
  var userProperty: js.UndefOr[java.lang.String] = js.undefined
}

object AuthenticateOptions {
  @scala.inline
  def apply(
    assignProperty: java.lang.String = null,
    authInfo: js.UndefOr[scala.Boolean] = js.undefined,
    failWithError: js.UndefOr[scala.Boolean] = js.undefined,
    failureFlash: java.lang.String | scala.Boolean = null,
    failureMessage: scala.Boolean | java.lang.String = null,
    failureRedirect: java.lang.String = null,
    passReqToCallback: js.UndefOr[scala.Boolean] = js.undefined,
    pauseStream: js.UndefOr[scala.Boolean] = js.undefined,
    prompt: java.lang.String = null,
    scope: java.lang.String | js.Array[java.lang.String] = null,
    session: js.UndefOr[scala.Boolean] = js.undefined,
    state: java.lang.String = null,
    successFlash: java.lang.String | scala.Boolean = null,
    successMessage: scala.Boolean | java.lang.String = null,
    successRedirect: java.lang.String = null,
    successReturnToOrRedirect: java.lang.String = null,
    userProperty: java.lang.String = null
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

