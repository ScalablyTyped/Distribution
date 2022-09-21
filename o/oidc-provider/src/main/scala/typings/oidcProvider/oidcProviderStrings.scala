package typings.oidcProvider

import typings.oidcProvider.mod.AsymmetricSigningAlgorithm
import typings.oidcProvider.mod.CIBADeliveryMode
import typings.oidcProvider.mod.ClientAuthMethod
import typings.oidcProvider.mod.EncryptionAlgValues
import typings.oidcProvider.mod.EncryptionEncValues
import typings.oidcProvider.mod.FapiProfile
import typings.oidcProvider.mod.PKCEMethods
import typings.oidcProvider.mod.ResponseType
import typings.oidcProvider.mod.SigningAlgorithm
import typings.oidcProvider.mod.SubjectTypes
import typings.oidcProvider.mod.SymmetricSigningAlgorithm
import typings.oidcProvider.mod.TLSClientAuthProperty
import typings.oidcProvider.mod.TokenFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oidcProviderStrings {
  
  @js.native
  sealed trait `1Dot0 Final`
    extends StObject
       with FapiProfile
  inline def `1Dot0 Final`: `1Dot0 Final` = ("1.0 Final").asInstanceOf[`1Dot0 Final`]
  
  @js.native
  sealed trait `1Dot0 ID2`
    extends StObject
       with FapiProfile
  inline def `1Dot0 ID2`: `1Dot0 ID2` = ("1.0 ID2").asInstanceOf[`1Dot0 ID2`]
  
  @js.native
  sealed trait `A128CBC-HS256`
    extends StObject
       with EncryptionEncValues
  inline def `A128CBC-HS256`: `A128CBC-HS256` = "A128CBC-HS256".asInstanceOf[`A128CBC-HS256`]
  
  @js.native
  sealed trait A128GCM
    extends StObject
       with EncryptionEncValues
  inline def A128GCM: A128GCM = "A128GCM".asInstanceOf[A128GCM]
  
  @js.native
  sealed trait A128GCMKW
    extends StObject
       with EncryptionAlgValues
  inline def A128GCMKW: A128GCMKW = "A128GCMKW".asInstanceOf[A128GCMKW]
  
  @js.native
  sealed trait A128KW
    extends StObject
       with EncryptionAlgValues
  inline def A128KW: A128KW = "A128KW".asInstanceOf[A128KW]
  
  @js.native
  sealed trait `A192CBC-HS384`
    extends StObject
       with EncryptionEncValues
  inline def `A192CBC-HS384`: `A192CBC-HS384` = "A192CBC-HS384".asInstanceOf[`A192CBC-HS384`]
  
  @js.native
  sealed trait A192GCM
    extends StObject
       with EncryptionEncValues
  inline def A192GCM: A192GCM = "A192GCM".asInstanceOf[A192GCM]
  
  @js.native
  sealed trait A192GCMKW
    extends StObject
       with EncryptionAlgValues
  inline def A192GCMKW: A192GCMKW = "A192GCMKW".asInstanceOf[A192GCMKW]
  
  @js.native
  sealed trait A192KW
    extends StObject
       with EncryptionAlgValues
  inline def A192KW: A192KW = "A192KW".asInstanceOf[A192KW]
  
  @js.native
  sealed trait `A256CBC-HS512`
    extends StObject
       with EncryptionEncValues
  inline def `A256CBC-HS512`: `A256CBC-HS512` = "A256CBC-HS512".asInstanceOf[`A256CBC-HS512`]
  
  @js.native
  sealed trait A256GCM
    extends StObject
       with EncryptionEncValues
  inline def A256GCM: A256GCM = "A256GCM".asInstanceOf[A256GCM]
  
  @js.native
  sealed trait A256GCMKW
    extends StObject
       with EncryptionAlgValues
  inline def A256GCMKW: A256GCMKW = "A256GCMKW".asInstanceOf[A256GCMKW]
  
  @js.native
  sealed trait A256KW
    extends StObject
       with EncryptionAlgValues
  inline def A256KW: A256KW = "A256KW".asInstanceOf[A256KW]
  
  @js.native
  sealed trait AccessToken extends StObject
  inline def AccessToken: AccessToken = "AccessToken".asInstanceOf[AccessToken]
  
  @js.native
  sealed trait AuthorizationCode extends StObject
  inline def AuthorizationCode: AuthorizationCode = "AuthorizationCode".asInstanceOf[AuthorizationCode]
  
  @js.native
  sealed trait BackchannelAuthenticationRequest extends StObject
  inline def BackchannelAuthenticationRequest: BackchannelAuthenticationRequest = "BackchannelAuthenticationRequest".asInstanceOf[BackchannelAuthenticationRequest]
  
  @js.native
  sealed trait ClientCredentials extends StObject
  inline def ClientCredentials: ClientCredentials = "ClientCredentials".asInstanceOf[ClientCredentials]
  
  @js.native
  sealed trait DeviceCode extends StObject
  inline def DeviceCode: DeviceCode = "DeviceCode".asInstanceOf[DeviceCode]
  
  @js.native
  sealed trait `ECDH-ES`
    extends StObject
       with EncryptionAlgValues
  inline def `ECDH-ES`: `ECDH-ES` = "ECDH-ES".asInstanceOf[`ECDH-ES`]
  
  @js.native
  sealed trait `ECDH-ESPlussignA128KW`
    extends StObject
       with EncryptionAlgValues
  inline def `ECDH-ESPlussignA128KW`: `ECDH-ESPlussignA128KW` = "ECDH-ES+A128KW".asInstanceOf[`ECDH-ESPlussignA128KW`]
  
  @js.native
  sealed trait `ECDH-ESPlussignA192KW`
    extends StObject
       with EncryptionAlgValues
  inline def `ECDH-ESPlussignA192KW`: `ECDH-ESPlussignA192KW` = "ECDH-ES+A192KW".asInstanceOf[`ECDH-ESPlussignA192KW`]
  
  @js.native
  sealed trait `ECDH-ESPlussignA256KW`
    extends StObject
       with EncryptionAlgValues
  inline def `ECDH-ESPlussignA256KW`: `ECDH-ESPlussignA256KW` = "ECDH-ES+A256KW".asInstanceOf[`ECDH-ESPlussignA256KW`]
  
  @js.native
  sealed trait ES256
    extends StObject
       with AsymmetricSigningAlgorithm
       with SigningAlgorithm
  inline def ES256: ES256 = "ES256".asInstanceOf[ES256]
  
  @js.native
  sealed trait ES256K
    extends StObject
       with AsymmetricSigningAlgorithm
       with SigningAlgorithm
  inline def ES256K: ES256K = "ES256K".asInstanceOf[ES256K]
  
  @js.native
  sealed trait ES384
    extends StObject
       with AsymmetricSigningAlgorithm
       with SigningAlgorithm
  inline def ES384: ES384 = "ES384".asInstanceOf[ES384]
  
  @js.native
  sealed trait ES512
    extends StObject
       with AsymmetricSigningAlgorithm
       with SigningAlgorithm
  inline def ES512: ES512 = "ES512".asInstanceOf[ES512]
  
  @js.native
  sealed trait EdDSA
    extends StObject
       with AsymmetricSigningAlgorithm
       with SigningAlgorithm
  inline def EdDSA: EdDSA = "EdDSA".asInstanceOf[EdDSA]
  
  @js.native
  sealed trait HS256
    extends StObject
       with SigningAlgorithm
       with SymmetricSigningAlgorithm
  inline def HS256: HS256 = "HS256".asInstanceOf[HS256]
  
  @js.native
  sealed trait HS384
    extends StObject
       with SigningAlgorithm
       with SymmetricSigningAlgorithm
  inline def HS384: HS384 = "HS384".asInstanceOf[HS384]
  
  @js.native
  sealed trait HS512
    extends StObject
       with SigningAlgorithm
       with SymmetricSigningAlgorithm
  inline def HS512: HS512 = "HS512".asInstanceOf[HS512]
  
  @js.native
  sealed trait InitialAccessToken extends StObject
  inline def InitialAccessToken: InitialAccessToken = "InitialAccessToken".asInstanceOf[InitialAccessToken]
  
  @js.native
  sealed trait Interaction extends StObject
  inline def Interaction: Interaction = "Interaction".asInstanceOf[Interaction]
  
  @js.native
  sealed trait `PBES2-HS256PlussignA128KW`
    extends StObject
       with EncryptionAlgValues
  inline def `PBES2-HS256PlussignA128KW`: `PBES2-HS256PlussignA128KW` = "PBES2-HS256+A128KW".asInstanceOf[`PBES2-HS256PlussignA128KW`]
  
  @js.native
  sealed trait `PBES2-HS384PlussignA192KW`
    extends StObject
       with EncryptionAlgValues
  inline def `PBES2-HS384PlussignA192KW`: `PBES2-HS384PlussignA192KW` = "PBES2-HS384+A192KW".asInstanceOf[`PBES2-HS384PlussignA192KW`]
  
  @js.native
  sealed trait `PBES2-HS512PlussignA256KW`
    extends StObject
       with EncryptionAlgValues
  inline def `PBES2-HS512PlussignA256KW`: `PBES2-HS512PlussignA256KW` = "PBES2-HS512+A256KW".asInstanceOf[`PBES2-HS512PlussignA256KW`]
  
  @js.native
  sealed trait PS256
    extends StObject
       with AsymmetricSigningAlgorithm
       with SigningAlgorithm
  inline def PS256: PS256 = "PS256".asInstanceOf[PS256]
  
  @js.native
  sealed trait PS384
    extends StObject
       with AsymmetricSigningAlgorithm
       with SigningAlgorithm
  inline def PS384: PS384 = "PS384".asInstanceOf[PS384]
  
  @js.native
  sealed trait PS512
    extends StObject
       with AsymmetricSigningAlgorithm
       with SigningAlgorithm
  inline def PS512: PS512 = "PS512".asInstanceOf[PS512]
  
  @js.native
  sealed trait PushedAuthorizationRequest extends StObject
  inline def PushedAuthorizationRequest: PushedAuthorizationRequest = "PushedAuthorizationRequest".asInstanceOf[PushedAuthorizationRequest]
  
  @js.native
  sealed trait RS256
    extends StObject
       with AsymmetricSigningAlgorithm
       with SigningAlgorithm
  inline def RS256: RS256 = "RS256".asInstanceOf[RS256]
  
  @js.native
  sealed trait RS384
    extends StObject
       with AsymmetricSigningAlgorithm
       with SigningAlgorithm
  inline def RS384: RS384 = "RS384".asInstanceOf[RS384]
  
  @js.native
  sealed trait RS512
    extends StObject
       with AsymmetricSigningAlgorithm
       with SigningAlgorithm
  inline def RS512: RS512 = "RS512".asInstanceOf[RS512]
  
  @js.native
  sealed trait `RSA-OAEP`
    extends StObject
       with EncryptionAlgValues
  inline def `RSA-OAEP`: `RSA-OAEP` = "RSA-OAEP".asInstanceOf[`RSA-OAEP`]
  
  @js.native
  sealed trait `RSA-OAEP-256`
    extends StObject
       with EncryptionAlgValues
  inline def `RSA-OAEP-256`: `RSA-OAEP-256` = "RSA-OAEP-256".asInstanceOf[`RSA-OAEP-256`]
  
  @js.native
  sealed trait `RSA-OAEP-384`
    extends StObject
       with EncryptionAlgValues
  inline def `RSA-OAEP-384`: `RSA-OAEP-384` = "RSA-OAEP-384".asInstanceOf[`RSA-OAEP-384`]
  
  @js.native
  sealed trait `RSA-OAEP-512`
    extends StObject
       with EncryptionAlgValues
  inline def `RSA-OAEP-512`: `RSA-OAEP-512` = "RSA-OAEP-512".asInstanceOf[`RSA-OAEP-512`]
  
  @js.native
  sealed trait RSA1_5
    extends StObject
       with EncryptionAlgValues
  inline def RSA1_5: RSA1_5 = "RSA1_5".asInstanceOf[RSA1_5]
  
  @js.native
  sealed trait RefreshToken extends StObject
  inline def RefreshToken: RefreshToken = "RefreshToken".asInstanceOf[RefreshToken]
  
  @js.native
  sealed trait RegistrationAccessToken extends StObject
  inline def RegistrationAccessToken: RegistrationAccessToken = "RegistrationAccessToken".asInstanceOf[RegistrationAccessToken]
  
  @js.native
  sealed trait ReplayDetection extends StObject
  inline def ReplayDetection: ReplayDetection = "ReplayDetection".asInstanceOf[ReplayDetection]
  
  @js.native
  sealed trait S256
    extends StObject
       with PKCEMethods
  inline def S256: S256 = "S256".asInstanceOf[S256]
  
  @js.native
  sealed trait Session extends StObject
  inline def Session: Session = "Session".asInstanceOf[Session]
  
  @js.native
  sealed trait access_tokenDotdestroyed extends StObject
  inline def access_tokenDotdestroyed: access_tokenDotdestroyed = "access_token.destroyed".asInstanceOf[access_tokenDotdestroyed]
  
  @js.native
  sealed trait access_tokenDotissued extends StObject
  inline def access_tokenDotissued: access_tokenDotissued = "access_token.issued".asInstanceOf[access_tokenDotissued]
  
  @js.native
  sealed trait access_tokenDotsaved extends StObject
  inline def access_tokenDotsaved: access_tokenDotsaved = "access_token.saved".asInstanceOf[access_tokenDotsaved]
  
  @js.native
  sealed trait authorization extends StObject
  inline def authorization: authorization = "authorization".asInstanceOf[authorization]
  
  @js.native
  sealed trait authorizationDotaccepted extends StObject
  inline def authorizationDotaccepted: authorizationDotaccepted = "authorization.accepted".asInstanceOf[authorizationDotaccepted]
  
  @js.native
  sealed trait authorizationDoterror extends StObject
  inline def authorizationDoterror: authorizationDoterror = "authorization.error".asInstanceOf[authorizationDoterror]
  
  @js.native
  sealed trait authorizationDotsuccess extends StObject
  inline def authorizationDotsuccess: authorizationDotsuccess = "authorization.success".asInstanceOf[authorizationDotsuccess]
  
  @js.native
  sealed trait authorization_codeDotconsumed extends StObject
  inline def authorization_codeDotconsumed: authorization_codeDotconsumed = "authorization_code.consumed".asInstanceOf[authorization_codeDotconsumed]
  
  @js.native
  sealed trait authorization_codeDotdestroyed extends StObject
  inline def authorization_codeDotdestroyed: authorization_codeDotdestroyed = "authorization_code.destroyed".asInstanceOf[authorization_codeDotdestroyed]
  
  @js.native
  sealed trait authorization_codeDotsaved extends StObject
  inline def authorization_codeDotsaved: authorization_codeDotsaved = "authorization_code.saved".asInstanceOf[authorization_codeDotsaved]
  
  @js.native
  sealed trait backchannelDoterror extends StObject
  inline def backchannelDoterror: backchannelDoterror = "backchannel.error".asInstanceOf[backchannelDoterror]
  
  @js.native
  sealed trait backchannelDotsuccess extends StObject
  inline def backchannelDotsuccess: backchannelDotsuccess = "backchannel.success".asInstanceOf[backchannelDotsuccess]
  
  @js.native
  sealed trait backchannel_authentication_requestDotconsumed extends StObject
  inline def backchannel_authentication_requestDotconsumed: backchannel_authentication_requestDotconsumed = "backchannel_authentication_request.consumed".asInstanceOf[backchannel_authentication_requestDotconsumed]
  
  @js.native
  sealed trait backchannel_authentication_requestDotdestroyed extends StObject
  inline def backchannel_authentication_requestDotdestroyed: backchannel_authentication_requestDotdestroyed = "backchannel_authentication_request.destroyed".asInstanceOf[backchannel_authentication_requestDotdestroyed]
  
  @js.native
  sealed trait backchannel_authentication_requestDotsaved extends StObject
  inline def backchannel_authentication_requestDotsaved: backchannel_authentication_requestDotsaved = "backchannel_authentication_request.saved".asInstanceOf[backchannel_authentication_requestDotsaved]
  
  @js.native
  sealed trait `base-20` extends StObject
  inline def `base-20`: `base-20` = "base-20".asInstanceOf[`base-20`]
  
  @js.native
  sealed trait client_credentialsDotdestroyed extends StObject
  inline def client_credentialsDotdestroyed: client_credentialsDotdestroyed = "client_credentials.destroyed".asInstanceOf[client_credentialsDotdestroyed]
  
  @js.native
  sealed trait client_credentialsDotissued extends StObject
  inline def client_credentialsDotissued: client_credentialsDotissued = "client_credentials.issued".asInstanceOf[client_credentialsDotissued]
  
  @js.native
  sealed trait client_credentialsDotsaved extends StObject
  inline def client_credentialsDotsaved: client_credentialsDotsaved = "client_credentials.saved".asInstanceOf[client_credentialsDotsaved]
  
  @js.native
  sealed trait client_secret_basic
    extends StObject
       with ClientAuthMethod
  inline def client_secret_basic: client_secret_basic = "client_secret_basic".asInstanceOf[client_secret_basic]
  
  @js.native
  sealed trait client_secret_jwt
    extends StObject
       with ClientAuthMethod
  inline def client_secret_jwt: client_secret_jwt = "client_secret_jwt".asInstanceOf[client_secret_jwt]
  
  @js.native
  sealed trait client_secret_post
    extends StObject
       with ClientAuthMethod
  inline def client_secret_post: client_secret_post = "client_secret_post".asInstanceOf[client_secret_post]
  
  @js.native
  sealed trait code
    extends StObject
       with ResponseType
  inline def code: code = "code".asInstanceOf[code]
  
  @js.native
  sealed trait `code id_token`
    extends StObject
       with ResponseType
  inline def `code id_token`: `code id_token` = ("code id_token").asInstanceOf[`code id_token`]
  
  @js.native
  sealed trait `code id_token token`
    extends StObject
       with ResponseType
  inline def `code id_token token`: `code id_token token` = ("code id_token token").asInstanceOf[`code id_token token`]
  
  @js.native
  sealed trait `code token`
    extends StObject
       with ResponseType
  inline def `code token`: `code token` = ("code token").asInstanceOf[`code token`]
  
  @js.native
  sealed trait consent extends StObject
  inline def consent: consent = "consent".asInstanceOf[consent]
  
  @js.native
  sealed trait device_codeDotconsumed extends StObject
  inline def device_codeDotconsumed: device_codeDotconsumed = "device_code.consumed".asInstanceOf[device_codeDotconsumed]
  
  @js.native
  sealed trait device_codeDotdestroyed extends StObject
  inline def device_codeDotdestroyed: device_codeDotdestroyed = "device_code.destroyed".asInstanceOf[device_codeDotdestroyed]
  
  @js.native
  sealed trait device_codeDotsaved extends StObject
  inline def device_codeDotsaved: device_codeDotsaved = "device_code.saved".asInstanceOf[device_codeDotsaved]
  
  @js.native
  sealed trait digits extends StObject
  inline def digits: digits = "digits".asInstanceOf[digits]
  
  @js.native
  sealed trait dir
    extends StObject
       with EncryptionAlgValues
  inline def dir: dir = "dir".asInstanceOf[dir]
  
  @js.native
  sealed trait discoveryDoterror extends StObject
  inline def discoveryDoterror: discoveryDoterror = "discovery.error".asInstanceOf[discoveryDoterror]
  
  @js.native
  sealed trait end_sessionDoterror extends StObject
  inline def end_sessionDoterror: end_sessionDoterror = "end_session.error".asInstanceOf[end_sessionDoterror]
  
  @js.native
  sealed trait end_sessionDotsuccess extends StObject
  inline def end_sessionDotsuccess: end_sessionDotsuccess = "end_session.success".asInstanceOf[end_sessionDotsuccess]
  
  @js.native
  sealed trait grantDotdestroyed extends StObject
  inline def grantDotdestroyed: grantDotdestroyed = "grant.destroyed".asInstanceOf[grantDotdestroyed]
  
  @js.native
  sealed trait grantDoterror extends StObject
  inline def grantDoterror: grantDoterror = "grant.error".asInstanceOf[grantDoterror]
  
  @js.native
  sealed trait grantDotrevoked extends StObject
  inline def grantDotrevoked: grantDotrevoked = "grant.revoked".asInstanceOf[grantDotrevoked]
  
  @js.native
  sealed trait grantDotsaved extends StObject
  inline def grantDotsaved: grantDotsaved = "grant.saved".asInstanceOf[grantDotsaved]
  
  @js.native
  sealed trait grantDotsuccess extends StObject
  inline def grantDotsuccess: grantDotsuccess = "grant.success".asInstanceOf[grantDotsuccess]
  
  @js.native
  sealed trait id_token
    extends StObject
       with ResponseType
  inline def id_token: id_token = "id_token".asInstanceOf[id_token]
  
  @js.native
  sealed trait `id_token token`
    extends StObject
       with ResponseType
  inline def `id_token token`: `id_token token` = ("id_token token").asInstanceOf[`id_token token`]
  
  @js.native
  sealed trait idtoken extends StObject
  inline def idtoken: idtoken = "idtoken".asInstanceOf[idtoken]
  
  @js.native
  sealed trait interactionDotdestroyed extends StObject
  inline def interactionDotdestroyed: interactionDotdestroyed = "interaction.destroyed".asInstanceOf[interactionDotdestroyed]
  
  @js.native
  sealed trait interactionDotended extends StObject
  inline def interactionDotended: interactionDotended = "interaction.ended".asInstanceOf[interactionDotended]
  
  @js.native
  sealed trait interactionDotsaved extends StObject
  inline def interactionDotsaved: interactionDotsaved = "interaction.saved".asInstanceOf[interactionDotsaved]
  
  @js.native
  sealed trait interactionDotstarted extends StObject
  inline def interactionDotstarted: interactionDotstarted = "interaction.started".asInstanceOf[interactionDotstarted]
  
  @js.native
  sealed trait introspection extends StObject
  inline def introspection: introspection = "introspection".asInstanceOf[introspection]
  
  @js.native
  sealed trait introspectionDoterror extends StObject
  inline def introspectionDoterror: introspectionDoterror = "introspection.error".asInstanceOf[introspectionDoterror]
  
  @js.native
  sealed trait jwksDoterror extends StObject
  inline def jwksDoterror: jwksDoterror = "jwks.error".asInstanceOf[jwksDoterror]
  
  @js.native
  sealed trait jwt
    extends StObject
       with TokenFormat
  inline def jwt: jwt = "jwt".asInstanceOf[jwt]
  
  @js.native
  sealed trait lax extends StObject
  inline def lax: lax = "lax".asInstanceOf[lax]
  
  @js.native
  sealed trait local extends StObject
  inline def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait login extends StObject
  inline def login: login = "login".asInstanceOf[login]
  
  @js.native
  sealed trait logout extends StObject
  inline def logout: logout = "logout".asInstanceOf[logout]
  
  @js.native
  sealed trait native extends StObject
  inline def native: native = "native".asInstanceOf[native]
  
  @js.native
  sealed trait none
    extends StObject
       with ClientAuthMethod
       with ResponseType
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait opaque
    extends StObject
       with TokenFormat
  inline def opaque: opaque = "opaque".asInstanceOf[opaque]
  
  @js.native
  sealed trait pairwise
    extends StObject
       with SubjectTypes
  inline def pairwise: pairwise = "pairwise".asInstanceOf[pairwise]
  
  @js.native
  sealed trait paseto
    extends StObject
       with TokenFormat
  inline def paseto: paseto = "paseto".asInstanceOf[paseto]
  
  @js.native
  sealed trait ping
    extends StObject
       with CIBADeliveryMode
  inline def ping: ping = "ping".asInstanceOf[ping]
  
  @js.native
  sealed trait plain
    extends StObject
       with PKCEMethods
  inline def plain: plain = "plain".asInstanceOf[plain]
  
  @js.native
  sealed trait poll
    extends StObject
       with CIBADeliveryMode
  inline def poll: poll = "poll".asInstanceOf[poll]
  
  @js.native
  sealed trait private_key_jwt
    extends StObject
       with ClientAuthMethod
  inline def private_key_jwt: private_key_jwt = "private_key_jwt".asInstanceOf[private_key_jwt]
  
  @js.native
  sealed trait public
    extends StObject
       with SubjectTypes
  inline def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait pushed_authorization_requestDotdestroyed extends StObject
  inline def pushed_authorization_requestDotdestroyed: pushed_authorization_requestDotdestroyed = "pushed_authorization_request.destroyed".asInstanceOf[pushed_authorization_requestDotdestroyed]
  
  @js.native
  sealed trait pushed_authorization_requestDoterror extends StObject
  inline def pushed_authorization_requestDoterror: pushed_authorization_requestDoterror = "pushed_authorization_request.error".asInstanceOf[pushed_authorization_requestDoterror]
  
  @js.native
  sealed trait pushed_authorization_requestDotsaved extends StObject
  inline def pushed_authorization_requestDotsaved: pushed_authorization_requestDotsaved = "pushed_authorization_request.saved".asInstanceOf[pushed_authorization_requestDotsaved]
  
  @js.native
  sealed trait pushed_authorization_requestDotsuccess extends StObject
  inline def pushed_authorization_requestDotsuccess: pushed_authorization_requestDotsuccess = "pushed_authorization_request.success".asInstanceOf[pushed_authorization_requestDotsuccess]
  
  @js.native
  sealed trait refresh_tokenDotconsumed extends StObject
  inline def refresh_tokenDotconsumed: refresh_tokenDotconsumed = "refresh_token.consumed".asInstanceOf[refresh_tokenDotconsumed]
  
  @js.native
  sealed trait refresh_tokenDotdestroyed extends StObject
  inline def refresh_tokenDotdestroyed: refresh_tokenDotdestroyed = "refresh_token.destroyed".asInstanceOf[refresh_tokenDotdestroyed]
  
  @js.native
  sealed trait refresh_tokenDotsaved extends StObject
  inline def refresh_tokenDotsaved: refresh_tokenDotsaved = "refresh_token.saved".asInstanceOf[refresh_tokenDotsaved]
  
  @js.native
  sealed trait registration_access_tokenDotdestroyed extends StObject
  inline def registration_access_tokenDotdestroyed: registration_access_tokenDotdestroyed = "registration_access_token.destroyed".asInstanceOf[registration_access_tokenDotdestroyed]
  
  @js.native
  sealed trait registration_access_tokenDotsaved extends StObject
  inline def registration_access_tokenDotsaved: registration_access_tokenDotsaved = "registration_access_token.saved".asInstanceOf[registration_access_tokenDotsaved]
  
  @js.native
  sealed trait registration_createDoterror extends StObject
  inline def registration_createDoterror: registration_createDoterror = "registration_create.error".asInstanceOf[registration_createDoterror]
  
  @js.native
  sealed trait registration_createDotsuccess extends StObject
  inline def registration_createDotsuccess: registration_createDotsuccess = "registration_create.success".asInstanceOf[registration_createDotsuccess]
  
  @js.native
  sealed trait registration_deleteDoterror extends StObject
  inline def registration_deleteDoterror: registration_deleteDoterror = "registration_delete.error".asInstanceOf[registration_deleteDoterror]
  
  @js.native
  sealed trait registration_deleteDotsuccess extends StObject
  inline def registration_deleteDotsuccess: registration_deleteDotsuccess = "registration_delete.success".asInstanceOf[registration_deleteDotsuccess]
  
  @js.native
  sealed trait registration_readDoterror extends StObject
  inline def registration_readDoterror: registration_readDoterror = "registration_read.error".asInstanceOf[registration_readDoterror]
  
  @js.native
  sealed trait registration_updateDoterror extends StObject
  inline def registration_updateDoterror: registration_updateDoterror = "registration_update.error".asInstanceOf[registration_updateDoterror]
  
  @js.native
  sealed trait registration_updateDotsuccess extends StObject
  inline def registration_updateDotsuccess: registration_updateDotsuccess = "registration_update.success".asInstanceOf[registration_updateDotsuccess]
  
  @js.native
  sealed trait replay_detectionDotdestroyed extends StObject
  inline def replay_detectionDotdestroyed: replay_detectionDotdestroyed = "replay_detection.destroyed".asInstanceOf[replay_detectionDotdestroyed]
  
  @js.native
  sealed trait replay_detectionDotsaved extends StObject
  inline def replay_detectionDotsaved: replay_detectionDotsaved = "replay_detection.saved".asInstanceOf[replay_detectionDotsaved]
  
  @js.native
  sealed trait revocationDoterror extends StObject
  inline def revocationDoterror: revocationDoterror = "revocation.error".asInstanceOf[revocationDoterror]
  
  @js.native
  sealed trait self_signed_tls_client_auth
    extends StObject
       with ClientAuthMethod
  inline def self_signed_tls_client_auth: self_signed_tls_client_auth = "self_signed_tls_client_auth".asInstanceOf[self_signed_tls_client_auth]
  
  @js.native
  sealed trait server_error extends StObject
  inline def server_error: server_error = "server_error".asInstanceOf[server_error]
  
  @js.native
  sealed trait sessionDotdestroyed extends StObject
  inline def sessionDotdestroyed: sessionDotdestroyed = "session.destroyed".asInstanceOf[sessionDotdestroyed]
  
  @js.native
  sealed trait sessionDotsaved extends StObject
  inline def sessionDotsaved: sessionDotsaved = "session.saved".asInstanceOf[sessionDotsaved]
  
  @js.native
  sealed trait strict extends StObject
  inline def strict: strict = "strict".asInstanceOf[strict]
  
  @js.native
  sealed trait tls_client_auth
    extends StObject
       with ClientAuthMethod
  inline def tls_client_auth: tls_client_auth = "tls_client_auth".asInstanceOf[tls_client_auth]
  
  @js.native
  sealed trait tls_client_auth_san_dns
    extends StObject
       with TLSClientAuthProperty
  inline def tls_client_auth_san_dns: tls_client_auth_san_dns = "tls_client_auth_san_dns".asInstanceOf[tls_client_auth_san_dns]
  
  @js.native
  sealed trait tls_client_auth_san_email
    extends StObject
       with TLSClientAuthProperty
  inline def tls_client_auth_san_email: tls_client_auth_san_email = "tls_client_auth_san_email".asInstanceOf[tls_client_auth_san_email]
  
  @js.native
  sealed trait tls_client_auth_san_ip
    extends StObject
       with TLSClientAuthProperty
  inline def tls_client_auth_san_ip: tls_client_auth_san_ip = "tls_client_auth_san_ip".asInstanceOf[tls_client_auth_san_ip]
  
  @js.native
  sealed trait tls_client_auth_san_uri
    extends StObject
       with TLSClientAuthProperty
  inline def tls_client_auth_san_uri: tls_client_auth_san_uri = "tls_client_auth_san_uri".asInstanceOf[tls_client_auth_san_uri]
  
  @js.native
  sealed trait tls_client_auth_subject_dn
    extends StObject
       with TLSClientAuthProperty
  inline def tls_client_auth_subject_dn: tls_client_auth_subject_dn = "tls_client_auth_subject_dn".asInstanceOf[tls_client_auth_subject_dn]
  
  @js.native
  sealed trait userinfo extends StObject
  inline def userinfo: userinfo = "userinfo".asInstanceOf[userinfo]
  
  @js.native
  sealed trait userinfoDoterror extends StObject
  inline def userinfoDoterror: userinfoDoterror = "userinfo.error".asInstanceOf[userinfoDoterror]
  
  @js.native
  sealed trait web extends StObject
  inline def web: web = "web".asInstanceOf[web]
}
