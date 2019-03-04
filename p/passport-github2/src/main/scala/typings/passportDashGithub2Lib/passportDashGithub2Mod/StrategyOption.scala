package typings
package passportDashGithub2Lib.passportDashGithub2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOption
  extends passportLib.passportMod.passportNs.AuthenticateOptions {
  var authorizationURL: js.UndefOr[java.lang.String] = js.undefined
  var callbackURL: java.lang.String
  var clientID: java.lang.String
  var clientSecret: java.lang.String
  var customHeaders: js.UndefOr[nodeLib.httpMod.OutgoingHttpHeaders] = js.undefined
  var scopeSeparator: js.UndefOr[java.lang.String] = js.undefined
  @JSName("scope")
  var scope_StrategyOption: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var tokenURL: js.UndefOr[java.lang.String] = js.undefined
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
  var userProfileURL: js.UndefOr[java.lang.String] = js.undefined
}

object StrategyOption {
  @scala.inline
  def apply(
    callbackURL: java.lang.String,
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    assignProperty: java.lang.String = null,
    authInfo: js.UndefOr[scala.Boolean] = js.undefined,
    authorizationURL: java.lang.String = null,
    customHeaders: nodeLib.httpMod.OutgoingHttpHeaders = null,
    failWithError: js.UndefOr[scala.Boolean] = js.undefined,
    failureFlash: java.lang.String | scala.Boolean = null,
    failureMessage: scala.Boolean | java.lang.String = null,
    failureRedirect: java.lang.String = null,
    passReqToCallback: js.UndefOr[scala.Boolean] = js.undefined,
    pauseStream: js.UndefOr[scala.Boolean] = js.undefined,
    prompt: java.lang.String = null,
    scope: js.Array[java.lang.String] = null,
    scopeSeparator: java.lang.String = null,
    session: js.UndefOr[scala.Boolean] = js.undefined,
    state: java.lang.String = null,
    successFlash: java.lang.String | scala.Boolean = null,
    successMessage: scala.Boolean | java.lang.String = null,
    successRedirect: java.lang.String = null,
    successReturnToOrRedirect: java.lang.String = null,
    tokenURL: java.lang.String = null,
    userAgent: java.lang.String = null,
    userProfileURL: java.lang.String = null,
    userProperty: java.lang.String = null
  ): StrategyOption = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, clientID = clientID, clientSecret = clientSecret)
    if (assignProperty != null) __obj.updateDynamic("assignProperty")(assignProperty)
    if (!js.isUndefined(authInfo)) __obj.updateDynamic("authInfo")(authInfo)
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL)
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (!js.isUndefined(failWithError)) __obj.updateDynamic("failWithError")(failWithError)
    if (failureFlash != null) __obj.updateDynamic("failureFlash")(failureFlash.asInstanceOf[js.Any])
    if (failureMessage != null) __obj.updateDynamic("failureMessage")(failureMessage.asInstanceOf[js.Any])
    if (failureRedirect != null) __obj.updateDynamic("failureRedirect")(failureRedirect)
    if (!js.isUndefined(passReqToCallback)) __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    if (!js.isUndefined(pauseStream)) __obj.updateDynamic("pauseStream")(pauseStream)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator)
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session)
    if (state != null) __obj.updateDynamic("state")(state)
    if (successFlash != null) __obj.updateDynamic("successFlash")(successFlash.asInstanceOf[js.Any])
    if (successMessage != null) __obj.updateDynamic("successMessage")(successMessage.asInstanceOf[js.Any])
    if (successRedirect != null) __obj.updateDynamic("successRedirect")(successRedirect)
    if (successReturnToOrRedirect != null) __obj.updateDynamic("successReturnToOrRedirect")(successReturnToOrRedirect)
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    if (userProfileURL != null) __obj.updateDynamic("userProfileURL")(userProfileURL)
    if (userProperty != null) __obj.updateDynamic("userProperty")(userProperty)
    __obj.asInstanceOf[StrategyOption]
  }
}

