package typings.oauth

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.RequestOptions
import typings.node.urlMod.UrlWithStringQuery
import typings.oauth.anon.AccessTokenHttpMethod
import typings.oauth.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("oauth", "OAuth")
  @js.native
  class OAuth protected () extends StObject {
    def this(
      requestUrl: String,
      accessUrl: String,
      consumerKey: String,
      consumerSecret: String,
      version: String,
      authorize_callback: String,
      signatureMethod: String
    ) = this()
    def this(
      requestUrl: String,
      accessUrl: String,
      consumerKey: String,
      consumerSecret: String,
      version: String,
      authorize_callback: Null,
      signatureMethod: String
    ) = this()
    def this(
      requestUrl: String,
      accessUrl: String,
      consumerKey: String,
      consumerSecret: String,
      version: String,
      authorize_callback: String,
      signatureMethod: String,
      nonceSize: Double
    ) = this()
    def this(
      requestUrl: String,
      accessUrl: String,
      consumerKey: String,
      consumerSecret: String,
      version: String,
      authorize_callback: Null,
      signatureMethod: String,
      nonceSize: Double
    ) = this()
    def this(
      requestUrl: String,
      accessUrl: String,
      consumerKey: String,
      consumerSecret: String,
      version: String,
      authorize_callback: String,
      signatureMethod: String,
      nonceSize: Double,
      customHeaders: OutgoingHttpHeaders
    ) = this()
    def this(
      requestUrl: String,
      accessUrl: String,
      consumerKey: String,
      consumerSecret: String,
      version: String,
      authorize_callback: String,
      signatureMethod: String,
      nonceSize: Unit,
      customHeaders: OutgoingHttpHeaders
    ) = this()
    def this(
      requestUrl: String,
      accessUrl: String,
      consumerKey: String,
      consumerSecret: String,
      version: String,
      authorize_callback: Null,
      signatureMethod: String,
      nonceSize: Double,
      customHeaders: OutgoingHttpHeaders
    ) = this()
    def this(
      requestUrl: String,
      accessUrl: String,
      consumerKey: String,
      consumerSecret: String,
      version: String,
      authorize_callback: Null,
      signatureMethod: String,
      nonceSize: Unit,
      customHeaders: OutgoingHttpHeaders
    ) = this()
    
    var NONCE_CHARS: js.Array[String] = js.native
    
    var _accessUrl: String = js.native
    
    var _authorize_callback: String = js.native
    
    /* protected */ def _buildAuthorizationHeaders(orderedParameters: js.Array[js.Array[String]]): String = js.native
    
    var _clientOptions: AccessTokenHttpMethod = js.native
    
    var _consumerKey: String = js.native
    
    var _consumerSecret: String = js.native
    
    /* protected */ def _createClient(
      port: js.UndefOr[Double | String],
      hostname: js.UndefOr[String],
      method: js.UndefOr[String],
      path: js.UndefOr[String],
      headers: js.UndefOr[OutgoingHttpHeaders],
      sslEnabled: js.UndefOr[Boolean]
    ): ClientRequest = js.native
    
    /* protected */ def _createSignature(signatureBase: String, tokenSecret: String): String = js.native
    
    /* protected */ def _createSignatureBase(method: String, url: String, parameters: String): String = js.native
    
    /* protected */ def _decodeData(toDecode: String): String = js.native
    
    /* protected */ def _encodeData(toEncode: String): String = js.native
    
    /* protected */ def _getNonce(nonceSize: Double): String = js.native
    
    /* protected */ def _getSignature(method: String, url: String, parameters: String, tokenSecret: String): String = js.native
    
    /* protected */ def _getTimestamp(): Double | String = js.native
    
    var _headers: OutgoingHttpHeaders = js.native
    
    var _isEcho: Boolean = js.native
    
    /* protected */ def _isParameterNameAnOAuthParameter(parameter: String): Boolean = js.native
    
    /* protected */ def _makeArrayOfArgumentsHash(argumentHash: StringDictionary[String | js.Array[String]]): js.Array[js.Array[String]] = js.native
    
    var _nonceSize: Double = js.native
    
    /* protected */ def _normaliseRequestParams(args: js.Array[js.Array[String]]): String = js.native
    
    /* protected */ def _normalizeUrl(url: String): String = js.native
    
    var _oauthParameterSeperator: String = js.native
    
    /* protected */ def _performSecureRequest(oauth_token: String, oauth_token_secret: String, method: String, url: String): ClientRequest = js.native
    /* protected */ def _performSecureRequest(oauth_token: String, oauth_token_secret: String, method: String, url: String, extra_params: js.Any): ClientRequest = js.native
    /* protected */ def _performSecureRequest(
      oauth_token: String,
      oauth_token_secret: String,
      method: String,
      url: String,
      extra_params: js.Any,
      post_body: js.Any
    ): ClientRequest = js.native
    /* protected */ def _performSecureRequest(
      oauth_token: String,
      oauth_token_secret: String,
      method: String,
      url: String,
      extra_params: js.Any,
      post_body: js.Any,
      post_content_type: String
    ): ClientRequest = js.native
    /* protected */ def _performSecureRequest(
      oauth_token: String,
      oauth_token_secret: String,
      method: String,
      url: String,
      extra_params: js.Any,
      post_body: js.Any,
      post_content_type: String,
      callback: dataCallback
    ): ClientRequest = js.native
    /* protected */ def _performSecureRequest(
      oauth_token: String,
      oauth_token_secret: String,
      method: String,
      url: String,
      extra_params: js.Any,
      post_body: js.Any,
      post_content_type: Unit,
      callback: dataCallback
    ): ClientRequest = js.native
    /* protected */ def _performSecureRequest(
      oauth_token: String,
      oauth_token_secret: String,
      method: String,
      url: String,
      extra_params: js.Any,
      post_body: Unit,
      post_content_type: String
    ): ClientRequest = js.native
    /* protected */ def _performSecureRequest(
      oauth_token: String,
      oauth_token_secret: String,
      method: String,
      url: String,
      extra_params: js.Any,
      post_body: Unit,
      post_content_type: String,
      callback: dataCallback
    ): ClientRequest = js.native
    /* protected */ def _performSecureRequest(
      oauth_token: String,
      oauth_token_secret: String,
      method: String,
      url: String,
      extra_params: js.Any,
      post_body: Unit,
      post_content_type: Unit,
      callback: dataCallback
    ): ClientRequest = js.native
    /* protected */ def _performSecureRequest(
      oauth_token: String,
      oauth_token_secret: String,
      method: String,
      url: String,
      extra_params: Unit,
      post_body: js.Any
    ): ClientRequest = js.native
    /* protected */ def _performSecureRequest(
      oauth_token: String,
      oauth_token_secret: String,
      method: String,
      url: String,
      extra_params: Unit,
      post_body: js.Any,
      post_content_type: String
    ): ClientRequest = js.native
    /* protected */ def _performSecureRequest(
      oauth_token: String,
      oauth_token_secret: String,
      method: String,
      url: String,
      extra_params: Unit,
      post_body: js.Any,
      post_content_type: String,
      callback: dataCallback
    ): ClientRequest = js.native
    /* protected */ def _performSecureRequest(
      oauth_token: String,
      oauth_token_secret: String,
      method: String,
      url: String,
      extra_params: Unit,
      post_body: js.Any,
      post_content_type: Unit,
      callback: dataCallback
    ): ClientRequest = js.native
    /* protected */ def _performSecureRequest(
      oauth_token: String,
      oauth_token_secret: String,
      method: String,
      url: String,
      extra_params: Unit,
      post_body: Unit,
      post_content_type: String
    ): ClientRequest = js.native
    /* protected */ def _performSecureRequest(
      oauth_token: String,
      oauth_token_secret: String,
      method: String,
      url: String,
      extra_params: Unit,
      post_body: Unit,
      post_content_type: String,
      callback: dataCallback
    ): ClientRequest = js.native
    /* protected */ def _performSecureRequest(
      oauth_token: String,
      oauth_token_secret: String,
      method: String,
      url: String,
      extra_params: Unit,
      post_body: Unit,
      post_content_type: Unit,
      callback: dataCallback
    ): ClientRequest = js.native
    
    /* protected */ def _prepareParameters(oauth_token_secret: String, method: String, url: String): js.Array[js.Array[String]] = js.native
    /* protected */ def _prepareParameters(oauth_token_secret: String, method: String, url: String, extra_params: js.Any): js.Array[js.Array[String]] = js.native
    /* protected */ def _prepareParameters(oauth_token: String, oauth_token_secret: String, method: String, url: String): js.Array[js.Array[String]] = js.native
    /* protected */ def _prepareParameters(oauth_token: String, oauth_token_secret: String, method: String, url: String, extra_params: js.Any): js.Array[js.Array[String]] = js.native
    
    var _protectedKey: String = js.native
    
    /* protected */ def _putOrPost(method: String, url: String, oauth_token: String, oauth_token_secret: String): ClientRequest = js.native
    /* protected */ def _putOrPost(method: String, url: String, oauth_token: String, oauth_token_secret: String, post_body: js.Any): ClientRequest = js.native
    /* protected */ def _putOrPost(
      method: String,
      url: String,
      oauth_token: String,
      oauth_token_secret: String,
      post_body: js.Any,
      post_content_type: String
    ): ClientRequest = js.native
    /* protected */ def _putOrPost(
      method: String,
      url: String,
      oauth_token: String,
      oauth_token_secret: String,
      post_body: js.Any,
      post_content_type: String,
      callback: dataCallback
    ): ClientRequest = js.native
    /* protected */ def _putOrPost(
      method: String,
      url: String,
      oauth_token: String,
      oauth_token_secret: String,
      post_body: js.Any,
      post_content_type: Unit,
      callback: dataCallback
    ): ClientRequest = js.native
    /* protected */ def _putOrPost(
      method: String,
      url: String,
      oauth_token: String,
      oauth_token_secret: String,
      post_body: Unit,
      post_content_type: String
    ): ClientRequest = js.native
    /* protected */ def _putOrPost(
      method: String,
      url: String,
      oauth_token: String,
      oauth_token_secret: String,
      post_body: Unit,
      post_content_type: String,
      callback: dataCallback
    ): ClientRequest = js.native
    /* protected */ def _putOrPost(
      method: String,
      url: String,
      oauth_token: String,
      oauth_token_secret: String,
      post_body: Unit,
      post_content_type: Unit,
      callback: dataCallback
    ): ClientRequest = js.native
    
    var _realm: String = js.native
    
    var _requestUrl: String = js.native
    
    var _signatureMethod: String = js.native
    
    /* protected */ def _sortRequestParams(argument_pairs: js.Array[js.Array[String]]): js.Array[js.Array[String]] = js.native
    
    var _verifyCredentials: String = js.native
    
    var _version: String = js.native
    
    def authHeader(url: String, oauth_token: String, oauth_token_secret: String): String = js.native
    def authHeader(url: String, oauth_token: String, oauth_token_secret: String, method: String): String = js.native
    
    def delete(url: String, oauth_token: String, oauth_token_secret: String, callback: dataCallback): ClientRequest = js.native
    
    def get(url: String, oauth_token: String, oauth_token_secret: String, callback: dataCallback): ClientRequest = js.native
    
    def getOAuthAccessToken(oauth_token: String, oauth_token_secret: String, callback: oauth1tokenCallback): Unit = js.native
    def getOAuthAccessToken(
      oauth_token: String,
      oauth_token_secret: String,
      oauth_verifier: String,
      callback: oauth1tokenCallback
    ): Unit = js.native
    
    def getOAuthRequestToken(callback: oauth1tokenCallback): Unit = js.native
    def getOAuthRequestToken(extraparams: js.Any, callback: oauth1tokenCallback): Unit = js.native
    
    def getProtectedResource(
      url: String,
      method: String,
      oauth_token: String,
      oauth_token_secret: String,
      callback: dataCallback
    ): Unit = js.native
    
    def post(url: String, oauth_token: String, oauth_token_secret: String): ClientRequest = js.native
    def post(url: String, oauth_token: String, oauth_token_secret: String, post_body: js.Any): ClientRequest = js.native
    def post(
      url: String,
      oauth_token: String,
      oauth_token_secret: String,
      post_body: js.Any,
      post_content_type: String
    ): ClientRequest = js.native
    def post(
      url: String,
      oauth_token: String,
      oauth_token_secret: String,
      post_body: js.Any,
      post_content_type: String,
      callback: dataCallback
    ): ClientRequest = js.native
    def post(
      url: String,
      oauth_token: String,
      oauth_token_secret: String,
      post_body: js.Any,
      post_content_type: Unit,
      callback: dataCallback
    ): ClientRequest = js.native
    def post(
      url: String,
      oauth_token: String,
      oauth_token_secret: String,
      post_body: Unit,
      post_content_type: String
    ): ClientRequest = js.native
    def post(
      url: String,
      oauth_token: String,
      oauth_token_secret: String,
      post_body: Unit,
      post_content_type: String,
      callback: dataCallback
    ): ClientRequest = js.native
    def post(
      url: String,
      oauth_token: String,
      oauth_token_secret: String,
      post_body: Unit,
      post_content_type: Unit,
      callback: dataCallback
    ): ClientRequest = js.native
    
    def put(url: String, oauth_token: String, oauth_token_secret: String): ClientRequest = js.native
    def put(url: String, oauth_token: String, oauth_token_secret: String, post_body: js.Any): ClientRequest = js.native
    def put(
      url: String,
      oauth_token: String,
      oauth_token_secret: String,
      post_body: js.Any,
      post_content_type: String
    ): ClientRequest = js.native
    def put(
      url: String,
      oauth_token: String,
      oauth_token_secret: String,
      post_body: js.Any,
      post_content_type: String,
      callback: dataCallback
    ): ClientRequest = js.native
    def put(
      url: String,
      oauth_token: String,
      oauth_token_secret: String,
      post_body: js.Any,
      post_content_type: Unit,
      callback: dataCallback
    ): ClientRequest = js.native
    def put(
      url: String,
      oauth_token: String,
      oauth_token_secret: String,
      post_body: Unit,
      post_content_type: String
    ): ClientRequest = js.native
    def put(
      url: String,
      oauth_token: String,
      oauth_token_secret: String,
      post_body: Unit,
      post_content_type: String,
      callback: dataCallback
    ): ClientRequest = js.native
    def put(
      url: String,
      oauth_token: String,
      oauth_token_secret: String,
      post_body: Unit,
      post_content_type: Unit,
      callback: dataCallback
    ): ClientRequest = js.native
    
    def setClientOptions(options: AccessTokenHttpMethod): Unit = js.native
    
    def signUrl(url: String, oauth_token: String, oauth_token_secret: String): String = js.native
    def signUrl(url: String, oauth_token: String, oauth_token_secret: String, method: String): String = js.native
  }
  
  @JSImport("oauth", "OAuth2")
  @js.native
  class OAuth2 protected () extends StObject {
    def this(clientId: String, clientSecret: String, baseSite: String) = this()
    def this(clientId: String, clientSecret: String, baseSite: String, authorizePath: String) = this()
    def this(
      clientId: String,
      clientSecret: String,
      baseSite: String,
      authorizePath: String,
      accessTokenPath: String
    ) = this()
    def this(
      clientId: String,
      clientSecret: String,
      baseSite: String,
      authorizePath: Unit,
      accessTokenPath: String
    ) = this()
    def this(
      clientId: String,
      clientSecret: String,
      baseSite: String,
      authorizePath: String,
      accessTokenPath: String,
      customHeaders: OutgoingHttpHeaders
    ) = this()
    def this(
      clientId: String,
      clientSecret: String,
      baseSite: String,
      authorizePath: String,
      accessTokenPath: Unit,
      customHeaders: OutgoingHttpHeaders
    ) = this()
    def this(
      clientId: String,
      clientSecret: String,
      baseSite: String,
      authorizePath: Unit,
      accessTokenPath: String,
      customHeaders: OutgoingHttpHeaders
    ) = this()
    def this(
      clientId: String,
      clientSecret: String,
      baseSite: String,
      authorizePath: Unit,
      accessTokenPath: Unit,
      customHeaders: OutgoingHttpHeaders
    ) = this()
    
    var _accessTokenName: String = js.native
    
    var _accessTokenUrl: String = js.native
    
    var _agent: Agent | Boolean = js.native
    
    var _authMethod: String = js.native
    
    var _authorizeUrl: String = js.native
    
    var _baseSite: String = js.native
    
    /* protected */ def _chooseHttpLibrary(parsedUrl: UrlWithStringQuery): String = js.native
    
    var _clientId: String = js.native
    
    var _clientSecret: String = js.native
    
    var _customHeaders: OutgoingHttpHeaders = js.native
    
    /* protected */ def _executeRequest(http_library: String, options: RequestOptions, callback: dataCallback): Unit = js.native
    /* protected */ def _executeRequest(http_library: String, options: RequestOptions, post_body: js.Any, callback: dataCallback): Unit = js.native
    
    /* protected */ def _getAccessTokenUrl(): String = js.native
    
    /* protected */ def _request(
      method: String,
      url: String,
      headers: Null,
      post_body: js.Any,
      access_token: String,
      callback: dataCallback
    ): Unit = js.native
    /* protected */ def _request(
      method: String,
      url: String,
      headers: Null,
      post_body: js.Any,
      access_token: Null,
      callback: dataCallback
    ): Unit = js.native
    /* protected */ def _request(
      method: String,
      url: String,
      headers: OutgoingHttpHeaders,
      post_body: js.Any,
      access_token: String,
      callback: dataCallback
    ): Unit = js.native
    /* protected */ def _request(
      method: String,
      url: String,
      headers: OutgoingHttpHeaders,
      post_body: js.Any,
      access_token: Null,
      callback: dataCallback
    ): Unit = js.native
    
    var _useAuthorizationHeaderForGET: Boolean = js.native
    
    def buildAuthHeader(token: String): String = js.native
    
    def get(url: String, access_token: String, callback: dataCallback): Unit = js.native
    
    def getAuthorizeUrl(): String = js.native
    def getAuthorizeUrl(params: js.Any): String = js.native
    
    def getOAuthAccessToken(code: String, callback: oauth2tokenCallback): Unit = js.native
    def getOAuthAccessToken(code: String, params: js.Any, callback: oauth2tokenCallback): Unit = js.native
    
    def getProtectedResource(url: String, access_token: String, callback: dataCallback): Unit = js.native
    
    def setAccessTokenName(name: String): Unit = js.native
    
    def setAgent(agent: Boolean): Unit = js.native
    def setAgent(agent: Agent): Unit = js.native
    
    def setAuthMethod(authMethod: String): Unit = js.native
    
    def useAuthorizationHeaderforGET(useIt: Boolean): Unit = js.native
  }
  
  @JSImport("oauth", "OAuthEcho")
  @js.native
  class OAuthEcho protected () extends OAuth {
    def this(
      realm: String,
      verify_credentials: String,
      consumerKey: String,
      consumerSecret: String,
      version: String,
      signatureMethod: String
    ) = this()
    def this(
      realm: String,
      verify_credentials: String,
      consumerKey: String,
      consumerSecret: String,
      version: String,
      signatureMethod: String,
      nonceSize: Double
    ) = this()
    def this(
      realm: String,
      verify_credentials: String,
      consumerKey: String,
      consumerSecret: String,
      version: String,
      signatureMethod: String,
      nonceSize: Double,
      customHeaders: OutgoingHttpHeaders
    ) = this()
    def this(
      realm: String,
      verify_credentials: String,
      consumerKey: String,
      consumerSecret: String,
      version: String,
      signatureMethod: String,
      nonceSize: Unit,
      customHeaders: OutgoingHttpHeaders
    ) = this()
  }
  
  type dataCallback = js.Function3[
    /* err */ Data, 
    /* result */ js.UndefOr[String | Buffer], 
    /* response */ js.UndefOr[IncomingMessage], 
    js.Any
  ]
  
  type oauth1tokenCallback = js.Function4[
    /* err */ Data, 
    /* token */ String, 
    /* token_secret */ String, 
    /* parsedQueryString */ js.Any, 
    js.Any
  ]
  
  type oauth2tokenCallback = js.Function4[
    /* err */ Data, 
    /* access_token */ String, 
    /* refresh_token */ String, 
    /* result */ js.Any, 
    js.Any
  ]
}
