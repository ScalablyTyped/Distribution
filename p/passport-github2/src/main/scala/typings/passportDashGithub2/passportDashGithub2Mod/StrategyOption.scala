package typings.passportDashGithub2.passportDashGithub2Mod

import typings.node.httpMod.OutgoingHttpHeaders
import typings.passport.passportMod.AuthenticateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOption extends AuthenticateOptions {
  var authorizationURL: js.UndefOr[String] = js.undefined
  var callbackURL: String
  var clientID: String
  var clientSecret: String
  var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  var scopeSeparator: js.UndefOr[String] = js.undefined
  @JSName("scope")
  var scope_StrategyOption: js.UndefOr[js.Array[String]] = js.undefined
  var tokenURL: js.UndefOr[String] = js.undefined
  var userAgent: js.UndefOr[String] = js.undefined
  var userEmailURL: js.UndefOr[String] = js.undefined
  var userProfileURL: js.UndefOr[String] = js.undefined
}

object StrategyOption {
  @scala.inline
  def apply(
    callbackURL: String,
    clientID: String,
    clientSecret: String,
    assignProperty: String = null,
    authInfo: js.UndefOr[Boolean] = js.undefined,
    authorizationURL: String = null,
    customHeaders: OutgoingHttpHeaders = null,
    failWithError: js.UndefOr[Boolean] = js.undefined,
    failureFlash: String | Boolean = null,
    failureMessage: Boolean | String = null,
    failureRedirect: String = null,
    passReqToCallback: js.UndefOr[Boolean] = js.undefined,
    pauseStream: js.UndefOr[Boolean] = js.undefined,
    prompt: String = null,
    scope: js.Array[String] = null,
    scopeSeparator: String = null,
    session: js.UndefOr[Boolean] = js.undefined,
    state: String = null,
    successFlash: String | Boolean = null,
    successMessage: Boolean | String = null,
    successRedirect: String = null,
    successReturnToOrRedirect: String = null,
    tokenURL: String = null,
    userAgent: String = null,
    userEmailURL: String = null,
    userProfileURL: String = null,
    userProperty: String = null
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
    if (userEmailURL != null) __obj.updateDynamic("userEmailURL")(userEmailURL)
    if (userProfileURL != null) __obj.updateDynamic("userProfileURL")(userProfileURL)
    if (userProperty != null) __obj.updateDynamic("userProperty")(userProperty)
    __obj.asInstanceOf[StrategyOption]
  }
}

