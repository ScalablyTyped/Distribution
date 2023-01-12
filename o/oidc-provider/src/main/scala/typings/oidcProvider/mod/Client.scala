package typings.oidcProvider.mod

import org.scalablytyped.runtime.StringDictionary
import typings.oidcProvider.oidcProviderStrings.native
import typings.oidcProvider.oidcProviderStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Client
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  val applicationType: js.UndefOr[web | native] = js.undefined
  
  val authorizationEncryptedResponseAlg: js.UndefOr[String] = js.undefined
  
  val authorizationEncryptedResponseEnc: js.UndefOr[String] = js.undefined
  
  val authorizationSignedResponseAlg: js.UndefOr[String] = js.undefined
  
  val backchannelAuthenticationRequestSigningAlg: js.UndefOr[String] = js.undefined
  
  val backchannelClientNotificationEndpoint: js.UndefOr[String] = js.undefined
  
  val backchannelLogoutSessionRequired: js.UndefOr[Boolean] = js.undefined
  
  val backchannelLogoutUri: js.UndefOr[String] = js.undefined
  
  def backchannelPing(request: BackchannelAuthenticationRequest): js.Promise[Unit]
  
  val backchannelTokenDeliveryMode: js.UndefOr[CIBADeliveryMode] = js.undefined
  
  val backchannelUserCodeParameter: js.UndefOr[Boolean] = js.undefined
  
  val clientId: String
  
  val clientIdIssuedAt: js.UndefOr[Double] = js.undefined
  
  val clientName: js.UndefOr[String] = js.undefined
  
  val clientSecret: js.UndefOr[String] = js.undefined
  
  val clientSecretExpiresAt: js.UndefOr[Double] = js.undefined
  
  val clientUri: js.UndefOr[String] = js.undefined
  
  def compareClientSecret(actual: String): CanBePromise[Boolean]
  
  val contacts: js.UndefOr[js.Array[String]] = js.undefined
  
  val defaultAcrValues: js.UndefOr[js.Array[String]] = js.undefined
  
  val defaultMaxAge: js.UndefOr[Double] = js.undefined
  
  def grantTypeAllowed(`type`: String): Boolean
  
  val grantTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  val idTokenEncryptedResponseAlg: js.UndefOr[String] = js.undefined
  
  val idTokenEncryptedResponseEnc: js.UndefOr[String] = js.undefined
  
  val idTokenSignedResponseAlg: js.UndefOr[String] = js.undefined
  
  def includeSid(): Boolean
  
  val initiateLoginUri: js.UndefOr[String] = js.undefined
  
  val introspectionEncryptedResponseAlg: js.UndefOr[String] = js.undefined
  
  val introspectionEncryptedResponseEnc: js.UndefOr[String] = js.undefined
  
  val introspectionSignedResponseAlg: js.UndefOr[String] = js.undefined
  
  val jwks: js.UndefOr[JWKS] = js.undefined
  
  val jwksUri: js.UndefOr[String] = js.undefined
  
  val logoUri: js.UndefOr[String] = js.undefined
  
  def metadata(): ClientMetadata
  
  val policyUri: js.UndefOr[String] = js.undefined
  
  def postLogoutRedirectUriAllowed(postLogoutRedirectUri: String): Boolean
  
  val postLogoutRedirectUris: js.UndefOr[js.Array[String]] = js.undefined
  
  def redirectUriAllowed(redirectUri: String): Boolean
  
  val redirectUris: js.UndefOr[js.Array[String]] = js.undefined
  
  val requestObjectEncryptionAlg: js.UndefOr[String] = js.undefined
  
  val requestObjectEncryptionEnc: js.UndefOr[String] = js.undefined
  
  val requestObjectSigningAlg: js.UndefOr[String] = js.undefined
  
  def requestUriAllowed(requestUri: String): Boolean
  
  val requestUris: js.UndefOr[js.Array[String]] = js.undefined
  
  val requireAuthTime: js.UndefOr[Boolean] = js.undefined
  
  def responseTypeAllowed(`type`: ResponseType): Boolean
  
  val responseTypes: js.UndefOr[js.Array[ResponseType]] = js.undefined
  
  val scope: js.UndefOr[String] = js.undefined
  
  val sectorIdentifierUri: js.UndefOr[String] = js.undefined
  
  val subjectType: js.UndefOr[SubjectTypes] = js.undefined
  
  val tlsClientAuthSanDns: js.UndefOr[String] = js.undefined
  
  val tlsClientAuthSanEmail: js.UndefOr[String] = js.undefined
  
  val tlsClientAuthSanIp: js.UndefOr[String] = js.undefined
  
  val tlsClientAuthSanUri: js.UndefOr[String] = js.undefined
  
  val tlsClientAuthSubjectDn: js.UndefOr[String] = js.undefined
  
  val tlsClientCertificateBoundAccessTokens: js.UndefOr[Boolean] = js.undefined
  
  val tokenEndpointAuthMethod: js.UndefOr[String] = js.undefined
  
  val tokenEndpointAuthSigningAlg: js.UndefOr[String] = js.undefined
  
  val tosUri: js.UndefOr[String] = js.undefined
  
  val userinfoEncryptedResponseAlg: js.UndefOr[String] = js.undefined
  
  val userinfoEncryptedResponseEnc: js.UndefOr[String] = js.undefined
  
  val userinfoSignedResponseAlg: js.UndefOr[String] = js.undefined
  
  def webMessageUriAllowed(webMessageUri: String): Boolean
  
  val webMessageUris: js.UndefOr[js.Array[String]] = js.undefined
}
object Client {
  
  inline def apply(
    backchannelPing: BackchannelAuthenticationRequest => js.Promise[Unit],
    clientId: String,
    compareClientSecret: String => CanBePromise[Boolean],
    grantTypeAllowed: String => Boolean,
    includeSid: () => Boolean,
    metadata: () => ClientMetadata,
    postLogoutRedirectUriAllowed: String => Boolean,
    redirectUriAllowed: String => Boolean,
    requestUriAllowed: String => Boolean,
    responseTypeAllowed: ResponseType => Boolean,
    webMessageUriAllowed: String => Boolean
  ): Client = {
    val __obj = js.Dynamic.literal(backchannelPing = js.Any.fromFunction1(backchannelPing), clientId = clientId.asInstanceOf[js.Any], compareClientSecret = js.Any.fromFunction1(compareClientSecret), grantTypeAllowed = js.Any.fromFunction1(grantTypeAllowed), includeSid = js.Any.fromFunction0(includeSid), metadata = js.Any.fromFunction0(metadata), postLogoutRedirectUriAllowed = js.Any.fromFunction1(postLogoutRedirectUriAllowed), redirectUriAllowed = js.Any.fromFunction1(redirectUriAllowed), requestUriAllowed = js.Any.fromFunction1(requestUriAllowed), responseTypeAllowed = js.Any.fromFunction1(responseTypeAllowed), webMessageUriAllowed = js.Any.fromFunction1(webMessageUriAllowed))
    __obj.asInstanceOf[Client]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Client] (val x: Self) extends AnyVal {
    
    inline def setApplicationType(value: web | native): Self = StObject.set(x, "applicationType", value.asInstanceOf[js.Any])
    
    inline def setApplicationTypeUndefined: Self = StObject.set(x, "applicationType", js.undefined)
    
    inline def setAuthorizationEncryptedResponseAlg(value: String): Self = StObject.set(x, "authorizationEncryptedResponseAlg", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationEncryptedResponseAlgUndefined: Self = StObject.set(x, "authorizationEncryptedResponseAlg", js.undefined)
    
    inline def setAuthorizationEncryptedResponseEnc(value: String): Self = StObject.set(x, "authorizationEncryptedResponseEnc", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationEncryptedResponseEncUndefined: Self = StObject.set(x, "authorizationEncryptedResponseEnc", js.undefined)
    
    inline def setAuthorizationSignedResponseAlg(value: String): Self = StObject.set(x, "authorizationSignedResponseAlg", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationSignedResponseAlgUndefined: Self = StObject.set(x, "authorizationSignedResponseAlg", js.undefined)
    
    inline def setBackchannelAuthenticationRequestSigningAlg(value: String): Self = StObject.set(x, "backchannelAuthenticationRequestSigningAlg", value.asInstanceOf[js.Any])
    
    inline def setBackchannelAuthenticationRequestSigningAlgUndefined: Self = StObject.set(x, "backchannelAuthenticationRequestSigningAlg", js.undefined)
    
    inline def setBackchannelClientNotificationEndpoint(value: String): Self = StObject.set(x, "backchannelClientNotificationEndpoint", value.asInstanceOf[js.Any])
    
    inline def setBackchannelClientNotificationEndpointUndefined: Self = StObject.set(x, "backchannelClientNotificationEndpoint", js.undefined)
    
    inline def setBackchannelLogoutSessionRequired(value: Boolean): Self = StObject.set(x, "backchannelLogoutSessionRequired", value.asInstanceOf[js.Any])
    
    inline def setBackchannelLogoutSessionRequiredUndefined: Self = StObject.set(x, "backchannelLogoutSessionRequired", js.undefined)
    
    inline def setBackchannelLogoutUri(value: String): Self = StObject.set(x, "backchannelLogoutUri", value.asInstanceOf[js.Any])
    
    inline def setBackchannelLogoutUriUndefined: Self = StObject.set(x, "backchannelLogoutUri", js.undefined)
    
    inline def setBackchannelPing(value: BackchannelAuthenticationRequest => js.Promise[Unit]): Self = StObject.set(x, "backchannelPing", js.Any.fromFunction1(value))
    
    inline def setBackchannelTokenDeliveryMode(value: CIBADeliveryMode): Self = StObject.set(x, "backchannelTokenDeliveryMode", value.asInstanceOf[js.Any])
    
    inline def setBackchannelTokenDeliveryModeUndefined: Self = StObject.set(x, "backchannelTokenDeliveryMode", js.undefined)
    
    inline def setBackchannelUserCodeParameter(value: Boolean): Self = StObject.set(x, "backchannelUserCodeParameter", value.asInstanceOf[js.Any])
    
    inline def setBackchannelUserCodeParameterUndefined: Self = StObject.set(x, "backchannelUserCodeParameter", js.undefined)
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdIssuedAt(value: Double): Self = StObject.set(x, "clientIdIssuedAt", value.asInstanceOf[js.Any])
    
    inline def setClientIdIssuedAtUndefined: Self = StObject.set(x, "clientIdIssuedAt", js.undefined)
    
    inline def setClientName(value: String): Self = StObject.set(x, "clientName", value.asInstanceOf[js.Any])
    
    inline def setClientNameUndefined: Self = StObject.set(x, "clientName", js.undefined)
    
    inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setClientSecretExpiresAt(value: Double): Self = StObject.set(x, "clientSecretExpiresAt", value.asInstanceOf[js.Any])
    
    inline def setClientSecretExpiresAtUndefined: Self = StObject.set(x, "clientSecretExpiresAt", js.undefined)
    
    inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
    
    inline def setClientUri(value: String): Self = StObject.set(x, "clientUri", value.asInstanceOf[js.Any])
    
    inline def setClientUriUndefined: Self = StObject.set(x, "clientUri", js.undefined)
    
    inline def setCompareClientSecret(value: String => CanBePromise[Boolean]): Self = StObject.set(x, "compareClientSecret", js.Any.fromFunction1(value))
    
    inline def setContacts(value: js.Array[String]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    inline def setContactsUndefined: Self = StObject.set(x, "contacts", js.undefined)
    
    inline def setContactsVarargs(value: String*): Self = StObject.set(x, "contacts", js.Array(value*))
    
    inline def setDefaultAcrValues(value: js.Array[String]): Self = StObject.set(x, "defaultAcrValues", value.asInstanceOf[js.Any])
    
    inline def setDefaultAcrValuesUndefined: Self = StObject.set(x, "defaultAcrValues", js.undefined)
    
    inline def setDefaultAcrValuesVarargs(value: String*): Self = StObject.set(x, "defaultAcrValues", js.Array(value*))
    
    inline def setDefaultMaxAge(value: Double): Self = StObject.set(x, "defaultMaxAge", value.asInstanceOf[js.Any])
    
    inline def setDefaultMaxAgeUndefined: Self = StObject.set(x, "defaultMaxAge", js.undefined)
    
    inline def setGrantTypeAllowed(value: String => Boolean): Self = StObject.set(x, "grantTypeAllowed", js.Any.fromFunction1(value))
    
    inline def setGrantTypes(value: js.Array[String]): Self = StObject.set(x, "grantTypes", value.asInstanceOf[js.Any])
    
    inline def setGrantTypesUndefined: Self = StObject.set(x, "grantTypes", js.undefined)
    
    inline def setGrantTypesVarargs(value: String*): Self = StObject.set(x, "grantTypes", js.Array(value*))
    
    inline def setIdTokenEncryptedResponseAlg(value: String): Self = StObject.set(x, "idTokenEncryptedResponseAlg", value.asInstanceOf[js.Any])
    
    inline def setIdTokenEncryptedResponseAlgUndefined: Self = StObject.set(x, "idTokenEncryptedResponseAlg", js.undefined)
    
    inline def setIdTokenEncryptedResponseEnc(value: String): Self = StObject.set(x, "idTokenEncryptedResponseEnc", value.asInstanceOf[js.Any])
    
    inline def setIdTokenEncryptedResponseEncUndefined: Self = StObject.set(x, "idTokenEncryptedResponseEnc", js.undefined)
    
    inline def setIdTokenSignedResponseAlg(value: String): Self = StObject.set(x, "idTokenSignedResponseAlg", value.asInstanceOf[js.Any])
    
    inline def setIdTokenSignedResponseAlgUndefined: Self = StObject.set(x, "idTokenSignedResponseAlg", js.undefined)
    
    inline def setIncludeSid(value: () => Boolean): Self = StObject.set(x, "includeSid", js.Any.fromFunction0(value))
    
    inline def setInitiateLoginUri(value: String): Self = StObject.set(x, "initiateLoginUri", value.asInstanceOf[js.Any])
    
    inline def setInitiateLoginUriUndefined: Self = StObject.set(x, "initiateLoginUri", js.undefined)
    
    inline def setIntrospectionEncryptedResponseAlg(value: String): Self = StObject.set(x, "introspectionEncryptedResponseAlg", value.asInstanceOf[js.Any])
    
    inline def setIntrospectionEncryptedResponseAlgUndefined: Self = StObject.set(x, "introspectionEncryptedResponseAlg", js.undefined)
    
    inline def setIntrospectionEncryptedResponseEnc(value: String): Self = StObject.set(x, "introspectionEncryptedResponseEnc", value.asInstanceOf[js.Any])
    
    inline def setIntrospectionEncryptedResponseEncUndefined: Self = StObject.set(x, "introspectionEncryptedResponseEnc", js.undefined)
    
    inline def setIntrospectionSignedResponseAlg(value: String): Self = StObject.set(x, "introspectionSignedResponseAlg", value.asInstanceOf[js.Any])
    
    inline def setIntrospectionSignedResponseAlgUndefined: Self = StObject.set(x, "introspectionSignedResponseAlg", js.undefined)
    
    inline def setJwks(value: JWKS): Self = StObject.set(x, "jwks", value.asInstanceOf[js.Any])
    
    inline def setJwksUndefined: Self = StObject.set(x, "jwks", js.undefined)
    
    inline def setJwksUri(value: String): Self = StObject.set(x, "jwksUri", value.asInstanceOf[js.Any])
    
    inline def setJwksUriUndefined: Self = StObject.set(x, "jwksUri", js.undefined)
    
    inline def setLogoUri(value: String): Self = StObject.set(x, "logoUri", value.asInstanceOf[js.Any])
    
    inline def setLogoUriUndefined: Self = StObject.set(x, "logoUri", js.undefined)
    
    inline def setMetadata(value: () => ClientMetadata): Self = StObject.set(x, "metadata", js.Any.fromFunction0(value))
    
    inline def setPolicyUri(value: String): Self = StObject.set(x, "policyUri", value.asInstanceOf[js.Any])
    
    inline def setPolicyUriUndefined: Self = StObject.set(x, "policyUri", js.undefined)
    
    inline def setPostLogoutRedirectUriAllowed(value: String => Boolean): Self = StObject.set(x, "postLogoutRedirectUriAllowed", js.Any.fromFunction1(value))
    
    inline def setPostLogoutRedirectUris(value: js.Array[String]): Self = StObject.set(x, "postLogoutRedirectUris", value.asInstanceOf[js.Any])
    
    inline def setPostLogoutRedirectUrisUndefined: Self = StObject.set(x, "postLogoutRedirectUris", js.undefined)
    
    inline def setPostLogoutRedirectUrisVarargs(value: String*): Self = StObject.set(x, "postLogoutRedirectUris", js.Array(value*))
    
    inline def setRedirectUriAllowed(value: String => Boolean): Self = StObject.set(x, "redirectUriAllowed", js.Any.fromFunction1(value))
    
    inline def setRedirectUris(value: js.Array[String]): Self = StObject.set(x, "redirectUris", value.asInstanceOf[js.Any])
    
    inline def setRedirectUrisUndefined: Self = StObject.set(x, "redirectUris", js.undefined)
    
    inline def setRedirectUrisVarargs(value: String*): Self = StObject.set(x, "redirectUris", js.Array(value*))
    
    inline def setRequestObjectEncryptionAlg(value: String): Self = StObject.set(x, "requestObjectEncryptionAlg", value.asInstanceOf[js.Any])
    
    inline def setRequestObjectEncryptionAlgUndefined: Self = StObject.set(x, "requestObjectEncryptionAlg", js.undefined)
    
    inline def setRequestObjectEncryptionEnc(value: String): Self = StObject.set(x, "requestObjectEncryptionEnc", value.asInstanceOf[js.Any])
    
    inline def setRequestObjectEncryptionEncUndefined: Self = StObject.set(x, "requestObjectEncryptionEnc", js.undefined)
    
    inline def setRequestObjectSigningAlg(value: String): Self = StObject.set(x, "requestObjectSigningAlg", value.asInstanceOf[js.Any])
    
    inline def setRequestObjectSigningAlgUndefined: Self = StObject.set(x, "requestObjectSigningAlg", js.undefined)
    
    inline def setRequestUriAllowed(value: String => Boolean): Self = StObject.set(x, "requestUriAllowed", js.Any.fromFunction1(value))
    
    inline def setRequestUris(value: js.Array[String]): Self = StObject.set(x, "requestUris", value.asInstanceOf[js.Any])
    
    inline def setRequestUrisUndefined: Self = StObject.set(x, "requestUris", js.undefined)
    
    inline def setRequestUrisVarargs(value: String*): Self = StObject.set(x, "requestUris", js.Array(value*))
    
    inline def setRequireAuthTime(value: Boolean): Self = StObject.set(x, "requireAuthTime", value.asInstanceOf[js.Any])
    
    inline def setRequireAuthTimeUndefined: Self = StObject.set(x, "requireAuthTime", js.undefined)
    
    inline def setResponseTypeAllowed(value: ResponseType => Boolean): Self = StObject.set(x, "responseTypeAllowed", js.Any.fromFunction1(value))
    
    inline def setResponseTypes(value: js.Array[ResponseType]): Self = StObject.set(x, "responseTypes", value.asInstanceOf[js.Any])
    
    inline def setResponseTypesUndefined: Self = StObject.set(x, "responseTypes", js.undefined)
    
    inline def setResponseTypesVarargs(value: ResponseType*): Self = StObject.set(x, "responseTypes", js.Array(value*))
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSectorIdentifierUri(value: String): Self = StObject.set(x, "sectorIdentifierUri", value.asInstanceOf[js.Any])
    
    inline def setSectorIdentifierUriUndefined: Self = StObject.set(x, "sectorIdentifierUri", js.undefined)
    
    inline def setSubjectType(value: SubjectTypes): Self = StObject.set(x, "subjectType", value.asInstanceOf[js.Any])
    
    inline def setSubjectTypeUndefined: Self = StObject.set(x, "subjectType", js.undefined)
    
    inline def setTlsClientAuthSanDns(value: String): Self = StObject.set(x, "tlsClientAuthSanDns", value.asInstanceOf[js.Any])
    
    inline def setTlsClientAuthSanDnsUndefined: Self = StObject.set(x, "tlsClientAuthSanDns", js.undefined)
    
    inline def setTlsClientAuthSanEmail(value: String): Self = StObject.set(x, "tlsClientAuthSanEmail", value.asInstanceOf[js.Any])
    
    inline def setTlsClientAuthSanEmailUndefined: Self = StObject.set(x, "tlsClientAuthSanEmail", js.undefined)
    
    inline def setTlsClientAuthSanIp(value: String): Self = StObject.set(x, "tlsClientAuthSanIp", value.asInstanceOf[js.Any])
    
    inline def setTlsClientAuthSanIpUndefined: Self = StObject.set(x, "tlsClientAuthSanIp", js.undefined)
    
    inline def setTlsClientAuthSanUri(value: String): Self = StObject.set(x, "tlsClientAuthSanUri", value.asInstanceOf[js.Any])
    
    inline def setTlsClientAuthSanUriUndefined: Self = StObject.set(x, "tlsClientAuthSanUri", js.undefined)
    
    inline def setTlsClientAuthSubjectDn(value: String): Self = StObject.set(x, "tlsClientAuthSubjectDn", value.asInstanceOf[js.Any])
    
    inline def setTlsClientAuthSubjectDnUndefined: Self = StObject.set(x, "tlsClientAuthSubjectDn", js.undefined)
    
    inline def setTlsClientCertificateBoundAccessTokens(value: Boolean): Self = StObject.set(x, "tlsClientCertificateBoundAccessTokens", value.asInstanceOf[js.Any])
    
    inline def setTlsClientCertificateBoundAccessTokensUndefined: Self = StObject.set(x, "tlsClientCertificateBoundAccessTokens", js.undefined)
    
    inline def setTokenEndpointAuthMethod(value: String): Self = StObject.set(x, "tokenEndpointAuthMethod", value.asInstanceOf[js.Any])
    
    inline def setTokenEndpointAuthMethodUndefined: Self = StObject.set(x, "tokenEndpointAuthMethod", js.undefined)
    
    inline def setTokenEndpointAuthSigningAlg(value: String): Self = StObject.set(x, "tokenEndpointAuthSigningAlg", value.asInstanceOf[js.Any])
    
    inline def setTokenEndpointAuthSigningAlgUndefined: Self = StObject.set(x, "tokenEndpointAuthSigningAlg", js.undefined)
    
    inline def setTosUri(value: String): Self = StObject.set(x, "tosUri", value.asInstanceOf[js.Any])
    
    inline def setTosUriUndefined: Self = StObject.set(x, "tosUri", js.undefined)
    
    inline def setUserinfoEncryptedResponseAlg(value: String): Self = StObject.set(x, "userinfoEncryptedResponseAlg", value.asInstanceOf[js.Any])
    
    inline def setUserinfoEncryptedResponseAlgUndefined: Self = StObject.set(x, "userinfoEncryptedResponseAlg", js.undefined)
    
    inline def setUserinfoEncryptedResponseEnc(value: String): Self = StObject.set(x, "userinfoEncryptedResponseEnc", value.asInstanceOf[js.Any])
    
    inline def setUserinfoEncryptedResponseEncUndefined: Self = StObject.set(x, "userinfoEncryptedResponseEnc", js.undefined)
    
    inline def setUserinfoSignedResponseAlg(value: String): Self = StObject.set(x, "userinfoSignedResponseAlg", value.asInstanceOf[js.Any])
    
    inline def setUserinfoSignedResponseAlgUndefined: Self = StObject.set(x, "userinfoSignedResponseAlg", js.undefined)
    
    inline def setWebMessageUriAllowed(value: String => Boolean): Self = StObject.set(x, "webMessageUriAllowed", js.Any.fromFunction1(value))
    
    inline def setWebMessageUris(value: js.Array[String]): Self = StObject.set(x, "webMessageUris", value.asInstanceOf[js.Any])
    
    inline def setWebMessageUrisUndefined: Self = StObject.set(x, "webMessageUris", js.undefined)
    
    inline def setWebMessageUrisVarargs(value: String*): Self = StObject.set(x, "webMessageUris", js.Array(value*))
  }
}
