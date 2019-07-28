package typings.passportDashSaml.passportDashSamlMod

import typings.passportDashSaml.passportDashSamlStrings.sha1
import typings.passportDashSaml.passportDashSamlStrings.sha256
import typings.passportDashSaml.passportDashSamlStrings.sha512
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamlConfig extends js.Object {
  var acceptedClockSkewMs: js.UndefOr[Double] = js.undefined
  var additionalAuthorizeParams: js.UndefOr[js.Any] = js.undefined
  var additionalLogoutParams: js.UndefOr[js.Any] = js.undefined
  // Additional SAML behaviors
  var additionalParams: js.UndefOr[js.Any] = js.undefined
  var attributeConsumingServiceIndex: js.UndefOr[String] = js.undefined
  var authnContext: js.UndefOr[String] = js.undefined
  var authnRequestBinding: js.UndefOr[String] = js.undefined
  var cacheProvider: js.UndefOr[CacheProvider] = js.undefined
  // Core
  var callbackUrl: js.UndefOr[String] = js.undefined
  var cert: js.UndefOr[String | js.Array[String] | CertCallback] = js.undefined
  var decryptionPvk: js.UndefOr[String] = js.undefined
  var disableRequestedAuthnContext: js.UndefOr[Boolean] = js.undefined
  var entryPoint: js.UndefOr[String] = js.undefined
  var forceAuthn: js.UndefOr[Boolean] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var identifierFormat: js.UndefOr[String] = js.undefined
  var issuer: js.UndefOr[String] = js.undefined
  var logoutCallbackUrl: js.UndefOr[String] = js.undefined
  // Logout
  var logoutUrl: js.UndefOr[String] = js.undefined
  // Passport
  var name: js.UndefOr[String] = js.undefined
  var passReqToCallback: js.UndefOr[Boolean] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var privateCert: js.UndefOr[String] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var requestIdExpirationPeriodMs: js.UndefOr[Double] = js.undefined
  var signatureAlgorithm: js.UndefOr[sha1 | sha256 | sha512] = js.undefined
  var skipRequestCompression: js.UndefOr[Boolean] = js.undefined
  // InResponseTo Validation
  var validateInResponseTo: js.UndefOr[Boolean] = js.undefined
}

object SamlConfig {
  @scala.inline
  def apply(
    acceptedClockSkewMs: Int | Double = null,
    additionalAuthorizeParams: js.Any = null,
    additionalLogoutParams: js.Any = null,
    additionalParams: js.Any = null,
    attributeConsumingServiceIndex: String = null,
    authnContext: String = null,
    authnRequestBinding: String = null,
    cacheProvider: CacheProvider = null,
    callbackUrl: String = null,
    cert: String | js.Array[String] | CertCallback = null,
    decryptionPvk: String = null,
    disableRequestedAuthnContext: js.UndefOr[Boolean] = js.undefined,
    entryPoint: String = null,
    forceAuthn: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    identifierFormat: String = null,
    issuer: String = null,
    logoutCallbackUrl: String = null,
    logoutUrl: String = null,
    name: String = null,
    passReqToCallback: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    privateCert: String = null,
    protocol: String = null,
    requestIdExpirationPeriodMs: Int | Double = null,
    signatureAlgorithm: sha1 | sha256 | sha512 = null,
    skipRequestCompression: js.UndefOr[Boolean] = js.undefined,
    validateInResponseTo: js.UndefOr[Boolean] = js.undefined
  ): SamlConfig = {
    val __obj = js.Dynamic.literal()
    if (acceptedClockSkewMs != null) __obj.updateDynamic("acceptedClockSkewMs")(acceptedClockSkewMs.asInstanceOf[js.Any])
    if (additionalAuthorizeParams != null) __obj.updateDynamic("additionalAuthorizeParams")(additionalAuthorizeParams)
    if (additionalLogoutParams != null) __obj.updateDynamic("additionalLogoutParams")(additionalLogoutParams)
    if (additionalParams != null) __obj.updateDynamic("additionalParams")(additionalParams)
    if (attributeConsumingServiceIndex != null) __obj.updateDynamic("attributeConsumingServiceIndex")(attributeConsumingServiceIndex)
    if (authnContext != null) __obj.updateDynamic("authnContext")(authnContext)
    if (authnRequestBinding != null) __obj.updateDynamic("authnRequestBinding")(authnRequestBinding)
    if (cacheProvider != null) __obj.updateDynamic("cacheProvider")(cacheProvider)
    if (callbackUrl != null) __obj.updateDynamic("callbackUrl")(callbackUrl)
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (decryptionPvk != null) __obj.updateDynamic("decryptionPvk")(decryptionPvk)
    if (!js.isUndefined(disableRequestedAuthnContext)) __obj.updateDynamic("disableRequestedAuthnContext")(disableRequestedAuthnContext)
    if (entryPoint != null) __obj.updateDynamic("entryPoint")(entryPoint)
    if (!js.isUndefined(forceAuthn)) __obj.updateDynamic("forceAuthn")(forceAuthn)
    if (host != null) __obj.updateDynamic("host")(host)
    if (identifierFormat != null) __obj.updateDynamic("identifierFormat")(identifierFormat)
    if (issuer != null) __obj.updateDynamic("issuer")(issuer)
    if (logoutCallbackUrl != null) __obj.updateDynamic("logoutCallbackUrl")(logoutCallbackUrl)
    if (logoutUrl != null) __obj.updateDynamic("logoutUrl")(logoutUrl)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(passReqToCallback)) __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    if (path != null) __obj.updateDynamic("path")(path)
    if (privateCert != null) __obj.updateDynamic("privateCert")(privateCert)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (requestIdExpirationPeriodMs != null) __obj.updateDynamic("requestIdExpirationPeriodMs")(requestIdExpirationPeriodMs.asInstanceOf[js.Any])
    if (signatureAlgorithm != null) __obj.updateDynamic("signatureAlgorithm")(signatureAlgorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(skipRequestCompression)) __obj.updateDynamic("skipRequestCompression")(skipRequestCompression)
    if (!js.isUndefined(validateInResponseTo)) __obj.updateDynamic("validateInResponseTo")(validateInResponseTo)
    __obj.asInstanceOf[SamlConfig]
  }
}

