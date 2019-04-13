package typings
package passportDashSamlLib.multiSamlStrategyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSamlConfig
  extends passportDashSamlLib.passportDashSamlMod.SamlConfig {
  def getSamlOptions(req: expressLib.expressMod.Request, callback: SamlOptionsCallback): scala.Unit
}

object MultiSamlConfig {
  @scala.inline
  def apply(
    getSamlOptions: (expressLib.expressMod.Request, SamlOptionsCallback) => scala.Unit,
    acceptedClockSkewMs: scala.Int | scala.Double = null,
    additionalAuthorizeParams: js.Any = null,
    additionalLogoutParams: js.Any = null,
    additionalParams: js.Any = null,
    attributeConsumingServiceIndex: java.lang.String = null,
    authnContext: java.lang.String = null,
    authnRequestBinding: java.lang.String = null,
    cacheProvider: passportDashSamlLib.passportDashSamlMod.CacheProvider = null,
    callbackUrl: java.lang.String = null,
    cert: java.lang.String | js.Array[java.lang.String] | passportDashSamlLib.passportDashSamlMod.CertCallback = null,
    decryptionPvk: java.lang.String = null,
    disableRequestedAuthnContext: js.UndefOr[scala.Boolean] = js.undefined,
    entryPoint: java.lang.String = null,
    forceAuthn: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    identifierFormat: java.lang.String = null,
    issuer: java.lang.String = null,
    logoutCallbackUrl: java.lang.String = null,
    logoutUrl: java.lang.String = null,
    name: java.lang.String = null,
    passReqToCallback: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    privateCert: java.lang.String = null,
    protocol: java.lang.String = null,
    requestIdExpirationPeriodMs: scala.Int | scala.Double = null,
    signatureAlgorithm: passportDashSamlLib.passportDashSamlLibStrings.sha1 | passportDashSamlLib.passportDashSamlLibStrings.sha256 | passportDashSamlLib.passportDashSamlLibStrings.sha512 = null,
    skipRequestCompression: js.UndefOr[scala.Boolean] = js.undefined,
    validateInResponseTo: js.UndefOr[scala.Boolean] = js.undefined
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

