package typings.passportSaml.mod

import typings.passportSaml.passportSamlStrings.better
import typings.passportSaml.passportSamlStrings.exact
import typings.passportSaml.passportSamlStrings.maximum
import typings.passportSaml.passportSamlStrings.minimum
import typings.passportSaml.passportSamlStrings.sha1
import typings.passportSaml.passportSamlStrings.sha256
import typings.passportSaml.passportSamlStrings.sha512
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SamlConfig extends js.Object {
  
  var RACComparison: js.UndefOr[exact | minimum | maximum | better] = js.native
  
  var acceptedClockSkewMs: js.UndefOr[Double] = js.native
  
  var additionalAuthorizeParams: js.UndefOr[js.Any] = js.native
  
  var additionalLogoutParams: js.UndefOr[js.Any] = js.native
  
  // Additional SAML behaviors
  var additionalParams: js.UndefOr[js.Any] = js.native
  
  var attributeConsumingServiceIndex: js.UndefOr[String] = js.native
  
  var audience: js.UndefOr[String] = js.native
  
  var authnContext: js.UndefOr[String] = js.native
  
  var authnRequestBinding: js.UndefOr[String] = js.native
  
  var cacheProvider: js.UndefOr[CacheProvider] = js.native
  
  // Core
  var callbackUrl: js.UndefOr[String] = js.native
  
  var cert: js.UndefOr[String | js.Array[String] | CertCallback] = js.native
  
  var decryptionPvk: js.UndefOr[String] = js.native
  
  var disableRequestedAuthnContext: js.UndefOr[Boolean] = js.native
  
  var entryPoint: js.UndefOr[String] = js.native
  
  var forceAuthn: js.UndefOr[Boolean] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var identifierFormat: js.UndefOr[String] = js.native
  
  var idpIssuer: js.UndefOr[String] = js.native
  
  var issuer: js.UndefOr[String] = js.native
  
  var logoutCallbackUrl: js.UndefOr[String] = js.native
  
  // Logout
  var logoutUrl: js.UndefOr[String] = js.native
  
  // Passport
  var name: js.UndefOr[String] = js.native
  
  var passReqToCallback: js.UndefOr[Boolean] = js.native
  
  var passive: js.UndefOr[Boolean] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var privateCert: js.UndefOr[String] = js.native
  
  var protocol: js.UndefOr[String] = js.native
  
  var providerName: js.UndefOr[String] = js.native
  
  var requestIdExpirationPeriodMs: js.UndefOr[Double] = js.native
  
  var signatureAlgorithm: js.UndefOr[sha1 | sha256 | sha512] = js.native
  
  var skipRequestCompression: js.UndefOr[Boolean] = js.native
  
  // InResponseTo Validation
  var validateInResponseTo: js.UndefOr[Boolean] = js.native
}
object SamlConfig {
  
  @scala.inline
  def apply(): SamlConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamlConfig]
  }
  
  @scala.inline
  implicit class SamlConfigOps[Self <: SamlConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRACComparison(value: exact | minimum | maximum | better): Self = this.set("RACComparison", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRACComparison: Self = this.set("RACComparison", js.undefined)
    
    @scala.inline
    def setAcceptedClockSkewMs(value: Double): Self = this.set("acceptedClockSkewMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptedClockSkewMs: Self = this.set("acceptedClockSkewMs", js.undefined)
    
    @scala.inline
    def setAdditionalAuthorizeParams(value: js.Any): Self = this.set("additionalAuthorizeParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalAuthorizeParams: Self = this.set("additionalAuthorizeParams", js.undefined)
    
    @scala.inline
    def setAdditionalLogoutParams(value: js.Any): Self = this.set("additionalLogoutParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalLogoutParams: Self = this.set("additionalLogoutParams", js.undefined)
    
    @scala.inline
    def setAdditionalParams(value: js.Any): Self = this.set("additionalParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalParams: Self = this.set("additionalParams", js.undefined)
    
    @scala.inline
    def setAttributeConsumingServiceIndex(value: String): Self = this.set("attributeConsumingServiceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeConsumingServiceIndex: Self = this.set("attributeConsumingServiceIndex", js.undefined)
    
    @scala.inline
    def setAudience(value: String): Self = this.set("audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    
    @scala.inline
    def setAuthnContext(value: String): Self = this.set("authnContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthnContext: Self = this.set("authnContext", js.undefined)
    
    @scala.inline
    def setAuthnRequestBinding(value: String): Self = this.set("authnRequestBinding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthnRequestBinding: Self = this.set("authnRequestBinding", js.undefined)
    
    @scala.inline
    def setCacheProvider(value: CacheProvider): Self = this.set("cacheProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheProvider: Self = this.set("cacheProvider", js.undefined)
    
    @scala.inline
    def setCallbackUrl(value: String): Self = this.set("callbackUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbackUrl: Self = this.set("callbackUrl", js.undefined)
    
    @scala.inline
    def setCertVarargs(value: String*): Self = this.set("cert", js.Array(value :_*))
    
    @scala.inline
    def setCertFunction1(
      value: /* callback */ js.Function2[/* err */ Error | Null, /* cert */ js.UndefOr[String | js.Array[String]], Unit] => Unit
    ): Self = this.set("cert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCert(value: String | js.Array[String] | CertCallback): Self = this.set("cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    
    @scala.inline
    def setDecryptionPvk(value: String): Self = this.set("decryptionPvk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecryptionPvk: Self = this.set("decryptionPvk", js.undefined)
    
    @scala.inline
    def setDisableRequestedAuthnContext(value: Boolean): Self = this.set("disableRequestedAuthnContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableRequestedAuthnContext: Self = this.set("disableRequestedAuthnContext", js.undefined)
    
    @scala.inline
    def setEntryPoint(value: String): Self = this.set("entryPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntryPoint: Self = this.set("entryPoint", js.undefined)
    
    @scala.inline
    def setForceAuthn(value: Boolean): Self = this.set("forceAuthn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceAuthn: Self = this.set("forceAuthn", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setIdentifierFormat(value: String): Self = this.set("identifierFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifierFormat: Self = this.set("identifierFormat", js.undefined)
    
    @scala.inline
    def setIdpIssuer(value: String): Self = this.set("idpIssuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdpIssuer: Self = this.set("idpIssuer", js.undefined)
    
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
    
    @scala.inline
    def setLogoutCallbackUrl(value: String): Self = this.set("logoutCallbackUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogoutCallbackUrl: Self = this.set("logoutCallbackUrl", js.undefined)
    
    @scala.inline
    def setLogoutUrl(value: String): Self = this.set("logoutUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogoutUrl: Self = this.set("logoutUrl", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPassReqToCallback(value: Boolean): Self = this.set("passReqToCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassReqToCallback: Self = this.set("passReqToCallback", js.undefined)
    
    @scala.inline
    def setPassive(value: Boolean): Self = this.set("passive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassive: Self = this.set("passive", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPrivateCert(value: String): Self = this.set("privateCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateCert: Self = this.set("privateCert", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setProviderName(value: String): Self = this.set("providerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderName: Self = this.set("providerName", js.undefined)
    
    @scala.inline
    def setRequestIdExpirationPeriodMs(value: Double): Self = this.set("requestIdExpirationPeriodMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestIdExpirationPeriodMs: Self = this.set("requestIdExpirationPeriodMs", js.undefined)
    
    @scala.inline
    def setSignatureAlgorithm(value: sha1 | sha256 | sha512): Self = this.set("signatureAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureAlgorithm: Self = this.set("signatureAlgorithm", js.undefined)
    
    @scala.inline
    def setSkipRequestCompression(value: Boolean): Self = this.set("skipRequestCompression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipRequestCompression: Self = this.set("skipRequestCompression", js.undefined)
    
    @scala.inline
    def setValidateInResponseTo(value: Boolean): Self = this.set("validateInResponseTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateInResponseTo: Self = this.set("validateInResponseTo", js.undefined)
  }
}
