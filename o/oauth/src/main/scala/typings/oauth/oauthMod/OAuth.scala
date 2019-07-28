package typings.oauth.oauthMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.OutgoingHttpHeaders
import typings.oauth.Anon_AccessTokenHttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth", "OAuth")
@js.native
class OAuth protected () extends js.Object {
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
    authorize_callback: Null,
    signatureMethod: String,
    nonceSize: Double,
    customHeaders: OutgoingHttpHeaders
  ) = this()
  var NONCE_CHARS: js.Array[String] = js.native
  var _accessUrl: String = js.native
  var _authorize_callback: String = js.native
  var _clientOptions: Anon_AccessTokenHttpMethod = js.native
  var _consumerKey: String = js.native
  var _consumerSecret: String = js.native
  var _headers: OutgoingHttpHeaders = js.native
  var _isEcho: Boolean = js.native
  var _nonceSize: Double = js.native
  var _oauthParameterSeperator: String = js.native
  var _protectedKey: String = js.native
  var _realm: String = js.native
  var _requestUrl: String = js.native
  var _signatureMethod: String = js.native
  var _verifyCredentials: String = js.native
  var _version: String = js.native
  /* protected */ def _buildAuthorizationHeaders(orderedParameters: js.Array[js.Array[String]]): String = js.native
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
  /* protected */ def _isParameterNameAnOAuthParameter(parameter: String): Boolean = js.native
  /* protected */ def _makeArrayOfArgumentsHash(argumentHash: StringDictionary[String | js.Array[String]]): js.Array[js.Array[String]] = js.native
  /* protected */ def _normaliseRequestParams(args: js.Array[js.Array[String]]): String = js.native
  /* protected */ def _normalizeUrl(url: String): String = js.native
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
  /* protected */ def _prepareParameters(oauth_token_secret: String, method: String, url: String): js.Array[js.Array[String]] = js.native
  /* protected */ def _prepareParameters(oauth_token_secret: String, method: String, url: String, extra_params: js.Any): js.Array[js.Array[String]] = js.native
  /* protected */ def _prepareParameters(oauth_token: String, oauth_token_secret: String, method: String, url: String): js.Array[js.Array[String]] = js.native
  /* protected */ def _prepareParameters(oauth_token: String, oauth_token_secret: String, method: String, url: String, extra_params: js.Any): js.Array[js.Array[String]] = js.native
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
  /* protected */ def _sortRequestParams(argument_pairs: js.Array[js.Array[String]]): js.Array[js.Array[String]] = js.native
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
  def setClientOptions(options: Anon_AccessTokenHttpMethod): Unit = js.native
  def signUrl(url: String, oauth_token: String, oauth_token_secret: String): String = js.native
  def signUrl(url: String, oauth_token: String, oauth_token_secret: String, method: String): String = js.native
}

