package typings.passportAzureAd.oidcStrategyMod

import typings.passportAzureAd.anon.Iv
import typings.passportAzureAd.commonMod.IBaseStrategyOption
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

trait IOIDCStrategyOption extends IBaseStrategyOption {
  var allowHttpForRedirectUrl: js.UndefOr[Boolean] = js.undefined
  var clientSecret: js.UndefOr[String] = js.undefined
  var cookieEncryptionKeys: js.UndefOr[js.Array[Iv]] = js.undefined
  var cookieSameSite: js.UndefOr[Boolean] = js.undefined
  var nonceLifetime: js.UndefOr[Double] = js.undefined
  var nonceMaxAmount: js.UndefOr[Double] = js.undefined
  var privatePEMKey: js.UndefOr[String] = js.undefined
  var redirectUrl: String
  var responseMode: query | form_post
  var responseType: code | (`code id_token`) | (`id_token code`) | id_token
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
  var thumbprint: js.UndefOr[String] = js.undefined
  var useCookieInsteadOfSession: js.UndefOr[Boolean] = js.undefined
}

object IOIDCStrategyOption {
  @scala.inline
  def apply(
    clientID: String,
    identityMetadata: String,
    redirectUrl: String,
    responseMode: query | form_post,
    responseType: code | (`code id_token`) | (`id_token code`) | id_token,
    allowHttpForRedirectUrl: js.UndefOr[Boolean] = js.undefined,
    clientSecret: String = null,
    clockSkew: js.UndefOr[Double] = js.undefined,
    cookieEncryptionKeys: js.Array[Iv] = null,
    cookieSameSite: js.UndefOr[Boolean] = js.undefined,
    isB2C: js.UndefOr[Boolean] = js.undefined,
    issuer: String | js.Array[String] = null,
    loggingLevel: info | warn | error = null,
    loggingNoPII: js.UndefOr[Boolean] = js.undefined,
    nonceLifetime: js.UndefOr[Double] = js.undefined,
    nonceMaxAmount: js.UndefOr[Double] = js.undefined,
    privatePEMKey: String = null,
    scope: String | js.Array[String] = null,
    thumbprint: String = null,
    useCookieInsteadOfSession: js.UndefOr[Boolean] = js.undefined,
    validateIssuer: js.UndefOr[Boolean] = js.undefined
  ): IOIDCStrategyOption = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], identityMetadata = identityMetadata.asInstanceOf[js.Any], redirectUrl = redirectUrl.asInstanceOf[js.Any], responseMode = responseMode.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHttpForRedirectUrl)) __obj.updateDynamic("allowHttpForRedirectUrl")(allowHttpForRedirectUrl.get.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret.asInstanceOf[js.Any])
    if (!js.isUndefined(clockSkew)) __obj.updateDynamic("clockSkew")(clockSkew.get.asInstanceOf[js.Any])
    if (cookieEncryptionKeys != null) __obj.updateDynamic("cookieEncryptionKeys")(cookieEncryptionKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(cookieSameSite)) __obj.updateDynamic("cookieSameSite")(cookieSameSite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isB2C)) __obj.updateDynamic("isB2C")(isB2C.get.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (loggingLevel != null) __obj.updateDynamic("loggingLevel")(loggingLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(loggingNoPII)) __obj.updateDynamic("loggingNoPII")(loggingNoPII.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nonceLifetime)) __obj.updateDynamic("nonceLifetime")(nonceLifetime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nonceMaxAmount)) __obj.updateDynamic("nonceMaxAmount")(nonceMaxAmount.get.asInstanceOf[js.Any])
    if (privatePEMKey != null) __obj.updateDynamic("privatePEMKey")(privatePEMKey.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (thumbprint != null) __obj.updateDynamic("thumbprint")(thumbprint.asInstanceOf[js.Any])
    if (!js.isUndefined(useCookieInsteadOfSession)) __obj.updateDynamic("useCookieInsteadOfSession")(useCookieInsteadOfSession.get.asInstanceOf[js.Any])
    if (!js.isUndefined(validateIssuer)) __obj.updateDynamic("validateIssuer")(validateIssuer.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOIDCStrategyOption]
  }
}

