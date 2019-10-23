package typings.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Mod

import typings.passport.passportMod.AuthenticateOptions
import typings.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.offline
import typings.passportDashGoogleDashOauth20.passportDashGoogleDashOauth20Strings.online
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateOptionsGoogle extends AuthenticateOptions {
  var accessType: js.UndefOr[offline | online] = js.undefined
  var display: js.UndefOr[String] = js.undefined
  var hd: js.UndefOr[String] = js.undefined
  var hostedDomain: js.UndefOr[String] = js.undefined
  var includeGrantedScopes: js.UndefOr[Boolean] = js.undefined
  var loginHint: js.UndefOr[String] = js.undefined
  var openIDRealm: js.UndefOr[js.Any] = js.undefined
  var requestVisibleActions: js.UndefOr[js.Any] = js.undefined
}

object AuthenticateOptionsGoogle {
  @scala.inline
  def apply(
    accessType: offline | online = null,
    assignProperty: String = null,
    authInfo: js.UndefOr[Boolean] = js.undefined,
    display: String = null,
    failWithError: js.UndefOr[Boolean] = js.undefined,
    failureFlash: String | Boolean = null,
    failureMessage: Boolean | String = null,
    failureRedirect: String = null,
    hd: String = null,
    hostedDomain: String = null,
    includeGrantedScopes: js.UndefOr[Boolean] = js.undefined,
    loginHint: String = null,
    openIDRealm: js.Any = null,
    passReqToCallback: js.UndefOr[Boolean] = js.undefined,
    pauseStream: js.UndefOr[Boolean] = js.undefined,
    prompt: String = null,
    requestVisibleActions: js.Any = null,
    scope: String | js.Array[String] = null,
    session: js.UndefOr[Boolean] = js.undefined,
    state: String = null,
    successFlash: String | Boolean = null,
    successMessage: Boolean | String = null,
    successRedirect: String = null,
    successReturnToOrRedirect: String = null,
    userProperty: String = null
  ): AuthenticateOptionsGoogle = {
    val __obj = js.Dynamic.literal()
    if (accessType != null) __obj.updateDynamic("accessType")(accessType.asInstanceOf[js.Any])
    if (assignProperty != null) __obj.updateDynamic("assignProperty")(assignProperty)
    if (!js.isUndefined(authInfo)) __obj.updateDynamic("authInfo")(authInfo)
    if (display != null) __obj.updateDynamic("display")(display)
    if (!js.isUndefined(failWithError)) __obj.updateDynamic("failWithError")(failWithError)
    if (failureFlash != null) __obj.updateDynamic("failureFlash")(failureFlash.asInstanceOf[js.Any])
    if (failureMessage != null) __obj.updateDynamic("failureMessage")(failureMessage.asInstanceOf[js.Any])
    if (failureRedirect != null) __obj.updateDynamic("failureRedirect")(failureRedirect)
    if (hd != null) __obj.updateDynamic("hd")(hd)
    if (hostedDomain != null) __obj.updateDynamic("hostedDomain")(hostedDomain)
    if (!js.isUndefined(includeGrantedScopes)) __obj.updateDynamic("includeGrantedScopes")(includeGrantedScopes)
    if (loginHint != null) __obj.updateDynamic("loginHint")(loginHint)
    if (openIDRealm != null) __obj.updateDynamic("openIDRealm")(openIDRealm)
    if (!js.isUndefined(passReqToCallback)) __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    if (!js.isUndefined(pauseStream)) __obj.updateDynamic("pauseStream")(pauseStream)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (requestVisibleActions != null) __obj.updateDynamic("requestVisibleActions")(requestVisibleActions)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session)
    if (state != null) __obj.updateDynamic("state")(state)
    if (successFlash != null) __obj.updateDynamic("successFlash")(successFlash.asInstanceOf[js.Any])
    if (successMessage != null) __obj.updateDynamic("successMessage")(successMessage.asInstanceOf[js.Any])
    if (successRedirect != null) __obj.updateDynamic("successRedirect")(successRedirect)
    if (successReturnToOrRedirect != null) __obj.updateDynamic("successReturnToOrRedirect")(successReturnToOrRedirect)
    if (userProperty != null) __obj.updateDynamic("userProperty")(userProperty)
    __obj.asInstanceOf[AuthenticateOptionsGoogle]
  }
}

