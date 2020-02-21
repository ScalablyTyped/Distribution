package typings.passportAzureAd.oidcStrategyMod

import typings.passportAzureAd.AnonIv
import typings.passportAzureAd.passportAzureAdBooleans.`false`
import typings.passportAzureAd.passportAzureAdStrings.`code id_token`
import typings.passportAzureAd.passportAzureAdStrings.`id_token code`
import typings.passportAzureAd.passportAzureAdStrings.code
import typings.passportAzureAd.passportAzureAdStrings.error
import typings.passportAzureAd.passportAzureAdStrings.form_post
import typings.passportAzureAd.passportAzureAdStrings.id_token
import typings.passportAzureAd.passportAzureAdStrings.info
import typings.passportAzureAd.passportAzureAdStrings.query
import typings.passportAzureAd.passportAzureAdStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOIDCStrategyOptionWithoutRequest extends IOIDCStrategyOption {
  var passReqToCallback: `false`
}

object IOIDCStrategyOptionWithoutRequest {
  @scala.inline
  def apply(
    clientID: String,
    identityMetadata: String,
    passReqToCallback: `false`,
    redirectUrl: String,
    responseMode: query | form_post,
    responseType: code | (`code id_token`) | (`id_token code`) | id_token,
    allowHttpForRedirectUrl: js.UndefOr[Boolean] = js.undefined,
    clientSecret: String = null,
    clockSkew: Int | Double = null,
    cookieEncryptionKeys: js.Array[AnonIv] = null,
    cookieSameSite: js.UndefOr[Boolean] = js.undefined,
    isB2C: js.UndefOr[Boolean] = js.undefined,
    issuer: String | js.Array[String] = null,
    loggingLevel: info | warn | error = null,
    loggingNoPII: js.UndefOr[Boolean] = js.undefined,
    nonceLifetime: Int | Double = null,
    nonceMaxAmount: Int | Double = null,
    privatePEMKey: String = null,
    scope: String | js.Array[String] = null,
    thumbprint: String = null,
    useCookieInsteadOfSession: js.UndefOr[Boolean] = js.undefined,
    validateIssuer: js.UndefOr[Boolean] = js.undefined
  ): IOIDCStrategyOptionWithoutRequest = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], identityMetadata = identityMetadata.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any], redirectUrl = redirectUrl.asInstanceOf[js.Any], responseMode = responseMode.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHttpForRedirectUrl)) __obj.updateDynamic("allowHttpForRedirectUrl")(allowHttpForRedirectUrl.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret.asInstanceOf[js.Any])
    if (clockSkew != null) __obj.updateDynamic("clockSkew")(clockSkew.asInstanceOf[js.Any])
    if (cookieEncryptionKeys != null) __obj.updateDynamic("cookieEncryptionKeys")(cookieEncryptionKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(cookieSameSite)) __obj.updateDynamic("cookieSameSite")(cookieSameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(isB2C)) __obj.updateDynamic("isB2C")(isB2C.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (loggingLevel != null) __obj.updateDynamic("loggingLevel")(loggingLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(loggingNoPII)) __obj.updateDynamic("loggingNoPII")(loggingNoPII.asInstanceOf[js.Any])
    if (nonceLifetime != null) __obj.updateDynamic("nonceLifetime")(nonceLifetime.asInstanceOf[js.Any])
    if (nonceMaxAmount != null) __obj.updateDynamic("nonceMaxAmount")(nonceMaxAmount.asInstanceOf[js.Any])
    if (privatePEMKey != null) __obj.updateDynamic("privatePEMKey")(privatePEMKey.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (thumbprint != null) __obj.updateDynamic("thumbprint")(thumbprint.asInstanceOf[js.Any])
    if (!js.isUndefined(useCookieInsteadOfSession)) __obj.updateDynamic("useCookieInsteadOfSession")(useCookieInsteadOfSession.asInstanceOf[js.Any])
    if (!js.isUndefined(validateIssuer)) __obj.updateDynamic("validateIssuer")(validateIssuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOIDCStrategyOptionWithoutRequest]
  }
}

