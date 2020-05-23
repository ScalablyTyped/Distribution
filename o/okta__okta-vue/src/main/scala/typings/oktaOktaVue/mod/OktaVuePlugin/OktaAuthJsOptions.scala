package typings.oktaOktaVue.mod.OktaVuePlugin

import typings.oktaOktaVue.anon.AutoRenew
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OktaAuthJsOptions extends OktaOpenIDOptions {
  var authorizeUrl: js.UndefOr[String] = js.undefined
  var ignoreSignature: js.UndefOr[Boolean] = js.undefined
  var maxClockSkew: js.UndefOr[Double] = js.undefined
  var pkce: js.UndefOr[Boolean] = js.undefined
  var postLogoutRedirectUri: js.UndefOr[String] = js.undefined
  var tokenManager: js.UndefOr[AutoRenew] = js.undefined
  var tokenUrl: js.UndefOr[String] = js.undefined
  var userinfoUrl: js.UndefOr[String] = js.undefined
}

object OktaAuthJsOptions {
  @scala.inline
  def apply(
    authorizeUrl: String = null,
    ignoreSignature: js.UndefOr[Boolean] = js.undefined,
    maxClockSkew: js.UndefOr[Double] = js.undefined,
    nonce: String = null,
    pkce: js.UndefOr[Boolean] = js.undefined,
    postLogoutRedirectUri: String = null,
    responseMode: String = null,
    responseType: String | js.Array[String] = null,
    scopes: js.Array[String] = null,
    sessionToken: String = null,
    state: String = null,
    tokenManager: AutoRenew = null,
    tokenUrl: String = null,
    userinfoUrl: String = null
  ): OktaAuthJsOptions = {
    val __obj = js.Dynamic.literal()
    if (authorizeUrl != null) __obj.updateDynamic("authorizeUrl")(authorizeUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSignature)) __obj.updateDynamic("ignoreSignature")(ignoreSignature.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxClockSkew)) __obj.updateDynamic("maxClockSkew")(maxClockSkew.get.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (!js.isUndefined(pkce)) __obj.updateDynamic("pkce")(pkce.get.asInstanceOf[js.Any])
    if (postLogoutRedirectUri != null) __obj.updateDynamic("postLogoutRedirectUri")(postLogoutRedirectUri.asInstanceOf[js.Any])
    if (responseMode != null) __obj.updateDynamic("responseMode")(responseMode.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tokenManager != null) __obj.updateDynamic("tokenManager")(tokenManager.asInstanceOf[js.Any])
    if (tokenUrl != null) __obj.updateDynamic("tokenUrl")(tokenUrl.asInstanceOf[js.Any])
    if (userinfoUrl != null) __obj.updateDynamic("userinfoUrl")(userinfoUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OktaAuthJsOptions]
  }
}

