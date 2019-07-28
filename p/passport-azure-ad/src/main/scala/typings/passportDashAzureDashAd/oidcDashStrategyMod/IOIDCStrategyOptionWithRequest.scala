package typings.passportDashAzureDashAd.oidcDashStrategyMod

import typings.passportDashAzureDashAd.Anon_Iv
import typings.passportDashAzureDashAd.passportDashAzureDashAdNumbers.`true`
import typings.passportDashAzureDashAd.passportDashAzureDashAdStrings.`code id_token`
import typings.passportDashAzureDashAd.passportDashAzureDashAdStrings.`id_token code`
import typings.passportDashAzureDashAd.passportDashAzureDashAdStrings.code
import typings.passportDashAzureDashAd.passportDashAzureDashAdStrings.error
import typings.passportDashAzureDashAd.passportDashAzureDashAdStrings.form_post
import typings.passportDashAzureDashAd.passportDashAzureDashAdStrings.id_token
import typings.passportDashAzureDashAd.passportDashAzureDashAdStrings.info
import typings.passportDashAzureDashAd.passportDashAzureDashAdStrings.query
import typings.passportDashAzureDashAd.passportDashAzureDashAdStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOIDCStrategyOptionWithRequest extends IOIDCStrategyOption {
  var passReqToCallback: `true`
}

object IOIDCStrategyOptionWithRequest {
  @scala.inline
  def apply(
    clientID: String,
    identityMetadata: String,
    passReqToCallback: `true`,
    redirectUrl: String,
    responseMode: query | form_post,
    responseType: code | (`code id_token`) | (`id_token code`) | id_token,
    allowHttpForRedirectUrl: js.UndefOr[Boolean] = js.undefined,
    clientSecret: String = null,
    clockSkew: Int | Double = null,
    cookieEncryptionKeys: js.Array[Anon_Iv] = null,
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
  ): IOIDCStrategyOptionWithRequest = {
    val __obj = js.Dynamic.literal(clientID = clientID, identityMetadata = identityMetadata, passReqToCallback = passReqToCallback, redirectUrl = redirectUrl, responseMode = responseMode.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHttpForRedirectUrl)) __obj.updateDynamic("allowHttpForRedirectUrl")(allowHttpForRedirectUrl)
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    if (clockSkew != null) __obj.updateDynamic("clockSkew")(clockSkew.asInstanceOf[js.Any])
    if (cookieEncryptionKeys != null) __obj.updateDynamic("cookieEncryptionKeys")(cookieEncryptionKeys)
    if (!js.isUndefined(isB2C)) __obj.updateDynamic("isB2C")(isB2C)
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (loggingLevel != null) __obj.updateDynamic("loggingLevel")(loggingLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(loggingNoPII)) __obj.updateDynamic("loggingNoPII")(loggingNoPII)
    if (nonceLifetime != null) __obj.updateDynamic("nonceLifetime")(nonceLifetime.asInstanceOf[js.Any])
    if (nonceMaxAmount != null) __obj.updateDynamic("nonceMaxAmount")(nonceMaxAmount.asInstanceOf[js.Any])
    if (privatePEMKey != null) __obj.updateDynamic("privatePEMKey")(privatePEMKey)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (thumbprint != null) __obj.updateDynamic("thumbprint")(thumbprint)
    if (!js.isUndefined(useCookieInsteadOfSession)) __obj.updateDynamic("useCookieInsteadOfSession")(useCookieInsteadOfSession)
    if (!js.isUndefined(validateIssuer)) __obj.updateDynamic("validateIssuer")(validateIssuer)
    __obj.asInstanceOf[IOIDCStrategyOptionWithRequest]
  }
}

