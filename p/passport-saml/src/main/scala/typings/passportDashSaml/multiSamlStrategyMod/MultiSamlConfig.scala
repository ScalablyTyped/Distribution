package typings.passportDashSaml.multiSamlStrategyMod

import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.passportDashSaml.passportDashSamlMod.CacheProvider
import typings.passportDashSaml.passportDashSamlMod.CertCallback
import typings.passportDashSaml.passportDashSamlMod.SamlConfig
import typings.passportDashSaml.passportDashSamlStrings.better
import typings.passportDashSaml.passportDashSamlStrings.exact
import typings.passportDashSaml.passportDashSamlStrings.maximum
import typings.passportDashSaml.passportDashSamlStrings.minimum
import typings.passportDashSaml.passportDashSamlStrings.sha1
import typings.passportDashSaml.passportDashSamlStrings.sha256
import typings.passportDashSaml.passportDashSamlStrings.sha512
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSamlConfig extends SamlConfig {
  def getSamlOptions(req: Request[ParamsDictionary], callback: SamlOptionsCallback): Unit
}

object MultiSamlConfig {
  @scala.inline
  def apply(
    getSamlOptions: (Request[ParamsDictionary], SamlOptionsCallback) => Unit,
    RACComparison: exact | minimum | maximum | better = null,
    acceptedClockSkewMs: Int | Double = null,
    additionalAuthorizeParams: js.Any = null,
    additionalLogoutParams: js.Any = null,
    additionalParams: js.Any = null,
    attributeConsumingServiceIndex: String = null,
    audience: String = null,
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
    idpIssuer: String = null,
    issuer: String = null,
    logoutCallbackUrl: String = null,
    logoutUrl: String = null,
    name: String = null,
    passReqToCallback: js.UndefOr[Boolean] = js.undefined,
    passive: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    privateCert: String = null,
    protocol: String = null,
    providerName: String = null,
    requestIdExpirationPeriodMs: Int | Double = null,
    signatureAlgorithm: sha1 | sha256 | sha512 = null,
    skipRequestCompression: js.UndefOr[Boolean] = js.undefined,
    validateInResponseTo: js.UndefOr[Boolean] = js.undefined
  ): MultiSamlConfig = {
    val __obj = js.Dynamic.literal(getSamlOptions = js.Any.fromFunction2(getSamlOptions))
    if (RACComparison != null) __obj.updateDynamic("RACComparison")(RACComparison.asInstanceOf[js.Any])
    if (acceptedClockSkewMs != null) __obj.updateDynamic("acceptedClockSkewMs")(acceptedClockSkewMs.asInstanceOf[js.Any])
    if (additionalAuthorizeParams != null) __obj.updateDynamic("additionalAuthorizeParams")(additionalAuthorizeParams.asInstanceOf[js.Any])
    if (additionalLogoutParams != null) __obj.updateDynamic("additionalLogoutParams")(additionalLogoutParams.asInstanceOf[js.Any])
    if (additionalParams != null) __obj.updateDynamic("additionalParams")(additionalParams.asInstanceOf[js.Any])
    if (attributeConsumingServiceIndex != null) __obj.updateDynamic("attributeConsumingServiceIndex")(attributeConsumingServiceIndex.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (authnContext != null) __obj.updateDynamic("authnContext")(authnContext.asInstanceOf[js.Any])
    if (authnRequestBinding != null) __obj.updateDynamic("authnRequestBinding")(authnRequestBinding.asInstanceOf[js.Any])
    if (cacheProvider != null) __obj.updateDynamic("cacheProvider")(cacheProvider.asInstanceOf[js.Any])
    if (callbackUrl != null) __obj.updateDynamic("callbackUrl")(callbackUrl.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (decryptionPvk != null) __obj.updateDynamic("decryptionPvk")(decryptionPvk.asInstanceOf[js.Any])
    if (!js.isUndefined(disableRequestedAuthnContext)) __obj.updateDynamic("disableRequestedAuthnContext")(disableRequestedAuthnContext.asInstanceOf[js.Any])
    if (entryPoint != null) __obj.updateDynamic("entryPoint")(entryPoint.asInstanceOf[js.Any])
    if (!js.isUndefined(forceAuthn)) __obj.updateDynamic("forceAuthn")(forceAuthn.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (identifierFormat != null) __obj.updateDynamic("identifierFormat")(identifierFormat.asInstanceOf[js.Any])
    if (idpIssuer != null) __obj.updateDynamic("idpIssuer")(idpIssuer.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (logoutCallbackUrl != null) __obj.updateDynamic("logoutCallbackUrl")(logoutCallbackUrl.asInstanceOf[js.Any])
    if (logoutUrl != null) __obj.updateDynamic("logoutUrl")(logoutUrl.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(passReqToCallback)) __obj.updateDynamic("passReqToCallback")(passReqToCallback.asInstanceOf[js.Any])
    if (!js.isUndefined(passive)) __obj.updateDynamic("passive")(passive.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (privateCert != null) __obj.updateDynamic("privateCert")(privateCert.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (providerName != null) __obj.updateDynamic("providerName")(providerName.asInstanceOf[js.Any])
    if (requestIdExpirationPeriodMs != null) __obj.updateDynamic("requestIdExpirationPeriodMs")(requestIdExpirationPeriodMs.asInstanceOf[js.Any])
    if (signatureAlgorithm != null) __obj.updateDynamic("signatureAlgorithm")(signatureAlgorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(skipRequestCompression)) __obj.updateDynamic("skipRequestCompression")(skipRequestCompression.asInstanceOf[js.Any])
    if (!js.isUndefined(validateInResponseTo)) __obj.updateDynamic("validateInResponseTo")(validateInResponseTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSamlConfig]
  }
}

