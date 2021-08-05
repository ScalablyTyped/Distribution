package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jose.mod.JSONWebKeySet
import typings.node.http2Mod.Http2ServerRequest
import typings.node.httpMod.IncomingMessage
import typings.node.urlMod.URL_
import typings.openidClient.anon.Body
import typings.openidClient.anon.DPoP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openid-client", "Client")
@js.native
class Client protected ()
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  def this(metadata: ClientMetadata) = this()
  def this(metadata: ClientMetadata, jwks: JSONWebKeySet) = this()
  def this(metadata: ClientMetadata, jwks: Unit, options: ClientOptions) = this()
  def this(metadata: ClientMetadata, jwks: JSONWebKeySet, options: ClientOptions) = this()
  
  /**
    * Returns the target authorization redirect URI to redirect End-Users to using the provided parameters.
    * @param parameters Authorization Request parameters
    */
  def authorizationUrl(): String = js.native
  def authorizationUrl(parameters: AuthorizationParameters): String = js.native
  
  /**
    * Performs the callback for Authorization Server's authorization response.
    * @param redirectUri redirect_uri used for the authorization request
    * @param parameters returned authorization response, see client.callbackParams if you need help getting them.
    * @param checks checks to perform on the Authorization Response
    * @param extras add extra parameters to the Token Endpoint Request and/or Client Authentication JWT Assertion
    */
  def callback(redirectUri: String, parameters: CallbackParamsType): js.Promise[TokenSet] = js.native
  def callback(redirectUri: String, parameters: CallbackParamsType, checks: Unit, extras: CallbackExtras): js.Promise[TokenSet] = js.native
  def callback(redirectUri: String, parameters: CallbackParamsType, checks: OpenIDCallbackChecks): js.Promise[TokenSet] = js.native
  def callback(
    redirectUri: String,
    parameters: CallbackParamsType,
    checks: OpenIDCallbackChecks,
    extras: CallbackExtras
  ): js.Promise[TokenSet] = js.native
  def callback(redirectUri: Unit, parameters: CallbackParamsType): js.Promise[TokenSet] = js.native
  def callback(redirectUri: Unit, parameters: CallbackParamsType, checks: Unit, extras: CallbackExtras): js.Promise[TokenSet] = js.native
  def callback(redirectUri: Unit, parameters: CallbackParamsType, checks: OpenIDCallbackChecks): js.Promise[TokenSet] = js.native
  def callback(
    redirectUri: Unit,
    parameters: CallbackParamsType,
    checks: OpenIDCallbackChecks,
    extras: CallbackExtras
  ): js.Promise[TokenSet] = js.native
  
  /**
    * Returns recognized callback parameters from a provided input.
    *
    * - When input is of type string it will be parsed using url.parse and its query component will be returned
    * - When input is a GET http/http2 request object its url property will be parsed using url.parse and its
    * query component will be returned
    * - When input is a POST http/http2 request object its body property will be parsed or returned if it is already
    * an object. Note: the request read stream will not be parsed, it is expected that you will have a body parser
    * prior to calling this method. This parser would set the req.body property
    */
  def callbackParams(input: String): CallbackParamsType = js.native
  def callbackParams(input: Http2ServerRequest): CallbackParamsType = js.native
  def callbackParams(input: IncomingMessage): CallbackParamsType = js.native
  
  /**
    * Starts a Device Authorization Request at the issuer's device_authorization_endpoint and returns a handle
    * for subsequent Device Access Token Request polling.
    */
  def deviceAuthorization(): js.Promise[DeviceFlowHandle[Client]] = js.native
  def deviceAuthorization(parameters: Unit, extras: DeviceAuthorizationExtras): js.Promise[DeviceFlowHandle[Client]] = js.native
  def deviceAuthorization(parameters: DeviceAuthorizationParameters): js.Promise[DeviceFlowHandle[Client]] = js.native
  def deviceAuthorization(parameters: DeviceAuthorizationParameters, extras: DeviceAuthorizationExtras): js.Promise[DeviceFlowHandle[Client]] = js.native
  
  /**
    * Returns the target logout redirect URI to redirect End-Users to using the provided parameters.
    * @param parameters RP-Initiated Logout Request parameters
    */
  def endSessionUrl(): String = js.native
  def endSessionUrl(parameters: EndSessionParameters): String = js.native
  
  /**
    * Performs an arbitrary grant_type exchange at the token_endpoint.
    */
  def grant(body: GrantBody): js.Promise[TokenSet] = js.native
  def grant(body: GrantBody, extras: GrantExtras): js.Promise[TokenSet] = js.native
  
  /**
    * Introspects a token at the Authorization Server's introspection_endpoint.
    */
  def introspect(token: String): js.Promise[IntrospectionResponse] = js.native
  def introspect(token: String, tokenTypeHint: Unit, extras: IntrospectExtras): js.Promise[IntrospectionResponse] = js.native
  def introspect(token: String, tokenTypeHint: TokenTypeHint): js.Promise[IntrospectionResponse] = js.native
  def introspect(token: String, tokenTypeHint: TokenTypeHint, extras: IntrospectExtras): js.Promise[IntrospectionResponse] = js.native
  
  var issuer: Issuer[this.type] = js.native
  
  var metadata: ClientMetadata = js.native
  
  /**
    * Pure OAuth 2.0 version of callback().
    * @param redirectUri redirect_uri used for the authorization request
    * @param parameters returned authorization response, see client.callbackParams if you need help getting them.
    * @param checks checks to perform on the Authorization Response
    * @param extras add extra parameters to the Token Endpoint Request and/or Client Authentication JWT Assertion
    */
  def oauthCallback(redirectUri: String, parameters: CallbackParamsType): js.Promise[TokenSet] = js.native
  def oauthCallback(redirectUri: String, parameters: CallbackParamsType, checks: Unit, extras: CallbackExtras): js.Promise[TokenSet] = js.native
  def oauthCallback(redirectUri: String, parameters: CallbackParamsType, checks: OAuthCallbackChecks): js.Promise[TokenSet] = js.native
  def oauthCallback(
    redirectUri: String,
    parameters: CallbackParamsType,
    checks: OAuthCallbackChecks,
    extras: CallbackExtras
  ): js.Promise[TokenSet] = js.native
  def oauthCallback(redirectUri: Unit, parameters: CallbackParamsType): js.Promise[TokenSet] = js.native
  def oauthCallback(redirectUri: Unit, parameters: CallbackParamsType, checks: Unit, extras: CallbackExtras): js.Promise[TokenSet] = js.native
  def oauthCallback(redirectUri: Unit, parameters: CallbackParamsType, checks: OAuthCallbackChecks): js.Promise[TokenSet] = js.native
  def oauthCallback(
    redirectUri: Unit,
    parameters: CallbackParamsType,
    checks: OAuthCallbackChecks,
    extras: CallbackExtras
  ): js.Promise[TokenSet] = js.native
  
  def refresh(refreshToken: String): js.Promise[TokenSet] = js.native
  def refresh(refreshToken: String, extras: RefreshExtras): js.Promise[TokenSet] = js.native
  /**
    * Performs refresh_token grant type exchange.
    * @param refreshToken Refresh Token value. When TokenSet instance is provided its refresh_token property
    * will be used automatically.
    * @param extras Add extra parameters to the Token Endpoint Request and/or Client Authentication JWT Assertion
    */
  def refresh(refreshToken: TokenSet): js.Promise[TokenSet] = js.native
  def refresh(refreshToken: TokenSet, extras: RefreshExtras): js.Promise[TokenSet] = js.native
  
  /**
    * Creates a signed and optionally encrypted Request Object to send to the AS. Uses the client's
    * request_object_signing_alg, request_object_encryption_alg, request_object_encryption_enc metadata for
    * determining the algorithms to use.
    */
  def requestObject(payload: RequestObjectPayload): js.Promise[String] = js.native
  
  def requestResource(resourceUrl: String, accessToken: String): js.Any = js.native
  def requestResource(resourceUrl: String, accessToken: String, options: Body): js.Any = js.native
  /**
    * Fetches an arbitrary resource with the provided Access Token in an Authorization header.
    *
    * @param resourceUrl Resource URL to request a response from.
    * @param accessToken Access Token value. When TokenSet instance is provided its access_token property
    * will be used automatically.
    * @param options Options for the request.
    */
  def requestResource(resourceUrl: String, accessToken: TokenSet): js.Any = js.native
  def requestResource(resourceUrl: String, accessToken: TokenSet, options: Body): js.Any = js.native
  def requestResource(resourceUrl: URL_, accessToken: String): js.Any = js.native
  def requestResource(resourceUrl: URL_, accessToken: String, options: Body): js.Any = js.native
  def requestResource(resourceUrl: URL_, accessToken: TokenSet): js.Any = js.native
  def requestResource(resourceUrl: URL_, accessToken: TokenSet, options: Body): js.Any = js.native
  
  /**
    * Revokes a token at the Authorization Server's revocation_endpoint.
    */
  def revoke(token: String): js.Promise[Unit] = js.native
  def revoke(token: String, tokenTypeHint: Unit, extras: RevokeExtras): js.Promise[Unit] = js.native
  def revoke(token: String, tokenTypeHint: TokenTypeHint): js.Promise[Unit] = js.native
  def revoke(token: String, tokenTypeHint: TokenTypeHint, extras: RevokeExtras): js.Promise[Unit] = js.native
  
  var static: js.Any = js.native
  
  def userinfo(accessToken: String): js.Promise[UserinfoResponse] = js.native
  def userinfo(accessToken: String, options: DPoP): js.Promise[UserinfoResponse] = js.native
  /**
    * Fetches the OIDC userinfo response with the provided Access Token. Also handles signed and/or
    * encrypted userinfo responses. When TokenSet is provided as an argument the userinfo sub property
    * will also be checked to match the on in the TokenSet's ID Token.
    *
    * @param accessToken Access Token value. When TokenSet instance is provided its access_token property
    * will be used automatically.
    * @param options Options for the UserInfo request.
    */
  def userinfo(accessToken: TokenSet): js.Promise[UserinfoResponse] = js.native
  def userinfo(accessToken: TokenSet, options: DPoP): js.Promise[UserinfoResponse] = js.native
}
/* static members */
object Client {
  
  @JSImport("openid-client", "Client")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromUri(registrationClientUri: String, registrationAccessToken: String): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUri")(registrationClientUri.asInstanceOf[js.Any], registrationAccessToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  inline def fromUri(
    registrationClientUri: String,
    registrationAccessToken: String,
    jwks: Unit,
    clientOptions: ClientOptions
  ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUri")(registrationClientUri.asInstanceOf[js.Any], registrationAccessToken.asInstanceOf[js.Any], jwks.asInstanceOf[js.Any], clientOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  inline def fromUri(registrationClientUri: String, registrationAccessToken: String, jwks: JSONWebKeySet): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUri")(registrationClientUri.asInstanceOf[js.Any], registrationAccessToken.asInstanceOf[js.Any], jwks.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  inline def fromUri(
    registrationClientUri: String,
    registrationAccessToken: String,
    jwks: JSONWebKeySet,
    clientOptions: ClientOptions
  ): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUri")(registrationClientUri.asInstanceOf[js.Any], registrationAccessToken.asInstanceOf[js.Any], jwks.asInstanceOf[js.Any], clientOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
  
  @JSImport("openid-client", "Client.issuer")
  @js.native
  def issuer: Issuer[Client] = js.native
  inline def issuer_=(x: Issuer[Client]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("issuer")(x.asInstanceOf[js.Any])
  
  inline def register(metadata: js.Object): js.Promise[Client] = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(metadata.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Client]]
  inline def register(metadata: js.Object, other: RegisterOther & ClientOptions): js.Promise[Client] = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(metadata.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Client]]
}
