package typings.passportSaml

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.passportSaml.passportSamlStrings.better
import typings.passportSaml.passportSamlStrings.exact
import typings.passportSaml.passportSamlStrings.maximum
import typings.passportSaml.passportSamlStrings.minimum
import typings.passportSaml.passportSamlStrings.sha1
import typings.passportSaml.passportSamlStrings.sha256
import typings.passportSaml.passportSamlStrings.sha512
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-saml", "Strategy")
  @js.native
  class Strategy protected ()
    extends StObject
       with typings.passport.mod.Strategy {
    def this(config: SamlConfig, verify: VerifyWithRequest) = this()
    def this(config: SamlConfig, verify: VerifyWithoutRequest) = this()
    
    def authenticate(req: Request_[ParamsDictionary, js.Any, js.Any, Query], options: AuthenticateOptions): Unit = js.native
    def authenticate(req: Request_[ParamsDictionary, js.Any, js.Any, Query], options: AuthorizeOptions): Unit = js.native
    
    def generateServiceProviderMetadata(): String = js.native
    def generateServiceProviderMetadata(decryptionCert: String): String = js.native
    def generateServiceProviderMetadata(decryptionCert: String, signingCert: String): String = js.native
    def generateServiceProviderMetadata(decryptionCert: Null, signingCert: String): String = js.native
    
    def logout(
      req: Request_[ParamsDictionary, js.Any, js.Any, Query],
      callback: js.Function2[/* err */ Error | Null, /* url */ js.UndefOr[String], Unit]
    ): Unit = js.native
  }
  
  trait AuthenticateOptions
    extends StObject
       with typings.passport.mod.AuthenticateOptions {
    
    var additionalParams: js.UndefOr[js.Object] = js.undefined
  }
  object AuthenticateOptions {
    
    inline def apply(): AuthenticateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticateOptions]
    }
    
    extension [Self <: AuthenticateOptions](x: Self) {
      
      inline def setAdditionalParams(value: js.Object): Self = StObject.set(x, "additionalParams", value.asInstanceOf[js.Any])
      
      inline def setAdditionalParamsUndefined: Self = StObject.set(x, "additionalParams", js.undefined)
    }
  }
  
  trait AuthorizeOptions
    extends StObject
       with AuthenticateOptions {
    
    var samlFallback: js.UndefOr[String] = js.undefined
  }
  object AuthorizeOptions {
    
    inline def apply(): AuthorizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizeOptions]
    }
    
    extension [Self <: AuthorizeOptions](x: Self) {
      
      inline def setSamlFallback(value: String): Self = StObject.set(x, "samlFallback", value.asInstanceOf[js.Any])
      
      inline def setSamlFallbackUndefined: Self = StObject.set(x, "samlFallback", js.undefined)
    }
  }
  
  trait CacheItem extends StObject {
    
    var createdAt: Date
    
    var value: js.Any
  }
  object CacheItem {
    
    inline def apply(createdAt: Date, value: js.Any): CacheItem = {
      val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheItem]
    }
    
    extension [Self <: CacheItem](x: Self) {
      
      inline def setCreatedAt(value: Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CacheProvider extends StObject {
    
    def get(key: String, callback: js.Function2[/* err */ Error | Null, /* value */ js.Any, Unit | Null]): Unit = js.native
    
    def remove(key: String, callback: js.Function2[/* err */ Error | Null, /* key */ String, Unit | Null]): Unit = js.native
    
    def save(
      key: String,
      value: js.Any,
      callback: js.Function2[/* err */ Error | Null, /* cacheItem */ CacheItem, Unit | Null]
    ): Unit = js.native
    def save(
      key: Null,
      value: js.Any,
      callback: js.Function2[/* err */ Error | Null, /* cacheItem */ CacheItem, Unit | Null]
    ): Unit = js.native
  }
  
  type CertCallback = js.Function1[
    /* callback */ js.Function2[/* err */ Error | Null, /* cert */ js.UndefOr[String | js.Array[String]], Unit], 
    Unit
  ]
  
  trait Profile
    extends StObject
       with /* attributeName */ StringDictionary[js.Any] {
    
    var ID: js.UndefOr[String] = js.undefined
    
    // InCommon Attribute urn:oid:0.9.2342.19200300.100.1.3
    var email: js.UndefOr[String] = js.undefined
    
    // get the raw assertion XML
    def getAssertion(): js.Object
    
    // `mail` if not present in the assertion
    def getAssertionXml(): String
    
    // get the assertion XML parsed as a JavaScript object
    def getSamlResponseXml(): String
    
    var issuer: js.UndefOr[String] = js.undefined
    
    var mail: js.UndefOr[String] = js.undefined
    
    var nameID: js.UndefOr[String] = js.undefined
    
    var nameIDFormat: js.UndefOr[String] = js.undefined
    
    var nameQualifier: js.UndefOr[String] = js.undefined
    
    var sessionIndex: js.UndefOr[String] = js.undefined
    
    var spNameQualifier: js.UndefOr[String] = js.undefined
  }
  object Profile {
    
    inline def apply(getAssertion: () => js.Object, getAssertionXml: () => String, getSamlResponseXml: () => String): Profile = {
      val __obj = js.Dynamic.literal(getAssertion = js.Any.fromFunction0(getAssertion), getAssertionXml = js.Any.fromFunction0(getAssertionXml), getSamlResponseXml = js.Any.fromFunction0(getSamlResponseXml))
      __obj.asInstanceOf[Profile]
    }
    
    extension [Self <: Profile](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setGetAssertion(value: () => js.Object): Self = StObject.set(x, "getAssertion", js.Any.fromFunction0(value))
      
      inline def setGetAssertionXml(value: () => String): Self = StObject.set(x, "getAssertionXml", js.Any.fromFunction0(value))
      
      inline def setGetSamlResponseXml(value: () => String): Self = StObject.set(x, "getSamlResponseXml", js.Any.fromFunction0(value))
      
      inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      inline def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      inline def setMail(value: String): Self = StObject.set(x, "mail", value.asInstanceOf[js.Any])
      
      inline def setMailUndefined: Self = StObject.set(x, "mail", js.undefined)
      
      inline def setNameID(value: String): Self = StObject.set(x, "nameID", value.asInstanceOf[js.Any])
      
      inline def setNameIDFormat(value: String): Self = StObject.set(x, "nameIDFormat", value.asInstanceOf[js.Any])
      
      inline def setNameIDFormatUndefined: Self = StObject.set(x, "nameIDFormat", js.undefined)
      
      inline def setNameIDUndefined: Self = StObject.set(x, "nameID", js.undefined)
      
      inline def setNameQualifier(value: String): Self = StObject.set(x, "nameQualifier", value.asInstanceOf[js.Any])
      
      inline def setNameQualifierUndefined: Self = StObject.set(x, "nameQualifier", js.undefined)
      
      inline def setSessionIndex(value: String): Self = StObject.set(x, "sessionIndex", value.asInstanceOf[js.Any])
      
      inline def setSessionIndexUndefined: Self = StObject.set(x, "sessionIndex", js.undefined)
      
      inline def setSpNameQualifier(value: String): Self = StObject.set(x, "spNameQualifier", value.asInstanceOf[js.Any])
      
      inline def setSpNameQualifierUndefined: Self = StObject.set(x, "spNameQualifier", js.undefined)
    }
  }
  
  trait SamlConfig extends StObject {
    
    var RACComparison: js.UndefOr[exact | minimum | maximum | better] = js.undefined
    
    var acceptedClockSkewMs: js.UndefOr[Double] = js.undefined
    
    var additionalAuthorizeParams: js.UndefOr[js.Any] = js.undefined
    
    var additionalLogoutParams: js.UndefOr[js.Any] = js.undefined
    
    // Additional SAML behaviors
    var additionalParams: js.UndefOr[js.Any] = js.undefined
    
    var attributeConsumingServiceIndex: js.UndefOr[String] = js.undefined
    
    var audience: js.UndefOr[String] = js.undefined
    
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
    
    var idpIssuer: js.UndefOr[String] = js.undefined
    
    var issuer: js.UndefOr[String] = js.undefined
    
    var logoutCallbackUrl: js.UndefOr[String] = js.undefined
    
    // Logout
    var logoutUrl: js.UndefOr[String] = js.undefined
    
    // Passport
    var name: js.UndefOr[String] = js.undefined
    
    var passReqToCallback: js.UndefOr[Boolean] = js.undefined
    
    var passive: js.UndefOr[Boolean] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var privateCert: js.UndefOr[String] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var providerName: js.UndefOr[String] = js.undefined
    
    var requestIdExpirationPeriodMs: js.UndefOr[Double] = js.undefined
    
    var signatureAlgorithm: js.UndefOr[sha1 | sha256 | sha512] = js.undefined
    
    var skipRequestCompression: js.UndefOr[Boolean] = js.undefined
    
    // InResponseTo Validation
    var validateInResponseTo: js.UndefOr[Boolean] = js.undefined
  }
  object SamlConfig {
    
    inline def apply(): SamlConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SamlConfig]
    }
    
    extension [Self <: SamlConfig](x: Self) {
      
      inline def setAcceptedClockSkewMs(value: Double): Self = StObject.set(x, "acceptedClockSkewMs", value.asInstanceOf[js.Any])
      
      inline def setAcceptedClockSkewMsUndefined: Self = StObject.set(x, "acceptedClockSkewMs", js.undefined)
      
      inline def setAdditionalAuthorizeParams(value: js.Any): Self = StObject.set(x, "additionalAuthorizeParams", value.asInstanceOf[js.Any])
      
      inline def setAdditionalAuthorizeParamsUndefined: Self = StObject.set(x, "additionalAuthorizeParams", js.undefined)
      
      inline def setAdditionalLogoutParams(value: js.Any): Self = StObject.set(x, "additionalLogoutParams", value.asInstanceOf[js.Any])
      
      inline def setAdditionalLogoutParamsUndefined: Self = StObject.set(x, "additionalLogoutParams", js.undefined)
      
      inline def setAdditionalParams(value: js.Any): Self = StObject.set(x, "additionalParams", value.asInstanceOf[js.Any])
      
      inline def setAdditionalParamsUndefined: Self = StObject.set(x, "additionalParams", js.undefined)
      
      inline def setAttributeConsumingServiceIndex(value: String): Self = StObject.set(x, "attributeConsumingServiceIndex", value.asInstanceOf[js.Any])
      
      inline def setAttributeConsumingServiceIndexUndefined: Self = StObject.set(x, "attributeConsumingServiceIndex", js.undefined)
      
      inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setAuthnContext(value: String): Self = StObject.set(x, "authnContext", value.asInstanceOf[js.Any])
      
      inline def setAuthnContextUndefined: Self = StObject.set(x, "authnContext", js.undefined)
      
      inline def setAuthnRequestBinding(value: String): Self = StObject.set(x, "authnRequestBinding", value.asInstanceOf[js.Any])
      
      inline def setAuthnRequestBindingUndefined: Self = StObject.set(x, "authnRequestBinding", js.undefined)
      
      inline def setCacheProvider(value: CacheProvider): Self = StObject.set(x, "cacheProvider", value.asInstanceOf[js.Any])
      
      inline def setCacheProviderUndefined: Self = StObject.set(x, "cacheProvider", js.undefined)
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
      
      inline def setCert(value: String | js.Array[String] | CertCallback): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertFunction1(
        value: /* callback */ js.Function2[/* err */ Error | Null, /* cert */ js.UndefOr[String | js.Array[String]], Unit] => Unit
      ): Self = StObject.set(x, "cert", js.Any.fromFunction1(value))
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCertVarargs(value: String*): Self = StObject.set(x, "cert", js.Array(value :_*))
      
      inline def setDecryptionPvk(value: String): Self = StObject.set(x, "decryptionPvk", value.asInstanceOf[js.Any])
      
      inline def setDecryptionPvkUndefined: Self = StObject.set(x, "decryptionPvk", js.undefined)
      
      inline def setDisableRequestedAuthnContext(value: Boolean): Self = StObject.set(x, "disableRequestedAuthnContext", value.asInstanceOf[js.Any])
      
      inline def setDisableRequestedAuthnContextUndefined: Self = StObject.set(x, "disableRequestedAuthnContext", js.undefined)
      
      inline def setEntryPoint(value: String): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
      
      inline def setEntryPointUndefined: Self = StObject.set(x, "entryPoint", js.undefined)
      
      inline def setForceAuthn(value: Boolean): Self = StObject.set(x, "forceAuthn", value.asInstanceOf[js.Any])
      
      inline def setForceAuthnUndefined: Self = StObject.set(x, "forceAuthn", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setIdentifierFormat(value: String): Self = StObject.set(x, "identifierFormat", value.asInstanceOf[js.Any])
      
      inline def setIdentifierFormatUndefined: Self = StObject.set(x, "identifierFormat", js.undefined)
      
      inline def setIdpIssuer(value: String): Self = StObject.set(x, "idpIssuer", value.asInstanceOf[js.Any])
      
      inline def setIdpIssuerUndefined: Self = StObject.set(x, "idpIssuer", js.undefined)
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      inline def setLogoutCallbackUrl(value: String): Self = StObject.set(x, "logoutCallbackUrl", value.asInstanceOf[js.Any])
      
      inline def setLogoutCallbackUrlUndefined: Self = StObject.set(x, "logoutCallbackUrl", js.undefined)
      
      inline def setLogoutUrl(value: String): Self = StObject.set(x, "logoutUrl", value.asInstanceOf[js.Any])
      
      inline def setLogoutUrlUndefined: Self = StObject.set(x, "logoutUrl", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPassReqToCallback(value: Boolean): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      inline def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      inline def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPrivateCert(value: String): Self = StObject.set(x, "privateCert", value.asInstanceOf[js.Any])
      
      inline def setPrivateCertUndefined: Self = StObject.set(x, "privateCert", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setProviderName(value: String): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
      
      inline def setProviderNameUndefined: Self = StObject.set(x, "providerName", js.undefined)
      
      inline def setRACComparison(value: exact | minimum | maximum | better): Self = StObject.set(x, "RACComparison", value.asInstanceOf[js.Any])
      
      inline def setRACComparisonUndefined: Self = StObject.set(x, "RACComparison", js.undefined)
      
      inline def setRequestIdExpirationPeriodMs(value: Double): Self = StObject.set(x, "requestIdExpirationPeriodMs", value.asInstanceOf[js.Any])
      
      inline def setRequestIdExpirationPeriodMsUndefined: Self = StObject.set(x, "requestIdExpirationPeriodMs", js.undefined)
      
      inline def setSignatureAlgorithm(value: sha1 | sha256 | sha512): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
      
      inline def setSkipRequestCompression(value: Boolean): Self = StObject.set(x, "skipRequestCompression", value.asInstanceOf[js.Any])
      
      inline def setSkipRequestCompressionUndefined: Self = StObject.set(x, "skipRequestCompression", js.undefined)
      
      inline def setValidateInResponseTo(value: Boolean): Self = StObject.set(x, "validateInResponseTo", value.asInstanceOf[js.Any])
      
      inline def setValidateInResponseToUndefined: Self = StObject.set(x, "validateInResponseTo", js.undefined)
    }
  }
  
  type VerifiedCallback = js.Function3[
    /* err */ Error | Null, 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    Unit
  ]
  
  type VerifyWithRequest = js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* profile */ Profile, 
    /* done */ VerifiedCallback, 
    Unit
  ]
  
  type VerifyWithoutRequest = js.Function2[/* profile */ Profile, /* done */ VerifiedCallback, Unit]
}
