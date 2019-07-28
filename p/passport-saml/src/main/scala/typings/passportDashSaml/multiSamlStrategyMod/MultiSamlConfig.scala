package typings.passportDashSaml.multiSamlStrategyMod

import typings.express.expressMod.Request
import typings.passportDashSaml.passportDashSamlMod.CacheProvider
import typings.passportDashSaml.passportDashSamlMod.CertCallback
import typings.passportDashSaml.passportDashSamlMod.SamlConfig
import typings.passportDashSaml.passportDashSamlStrings.sha1
import typings.passportDashSaml.passportDashSamlStrings.sha256
import typings.passportDashSaml.passportDashSamlStrings.sha512
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSamlConfig extends SamlConfig {
  def getSamlOptions(req: Request, callback: SamlOptionsCallback): Unit
}

object MultiSamlConfig {
  @scala.inline
  def apply(
    getSamlOptions: (Request, SamlOptionsCallback) => Unit,
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
  ): MultiSamlConfig = {
    val __obj = js.Dynamic.literal(getSamlOptions = js.Any.fromFunction2(getSamlOptions))
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
    __obj.asInstanceOf[MultiSamlConfig]
  }
}

