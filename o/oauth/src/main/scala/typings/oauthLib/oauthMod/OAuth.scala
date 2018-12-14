package typings
package oauthLib.oauthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth", "OAuth")
@js.native
class OAuth protected () extends js.Object {
  def this(requestUrl: java.lang.String, accessUrl: java.lang.String, consumerKey: java.lang.String, consumerSecret: java.lang.String, version: java.lang.String, authorize_callback: java.lang.String, signatureMethod: java.lang.String) = this()
  def this(requestUrl: java.lang.String, accessUrl: java.lang.String, consumerKey: java.lang.String, consumerSecret: java.lang.String, version: java.lang.String, authorize_callback: scala.Null, signatureMethod: java.lang.String) = this()
  def this(requestUrl: java.lang.String, accessUrl: java.lang.String, consumerKey: java.lang.String, consumerSecret: java.lang.String, version: java.lang.String, authorize_callback: java.lang.String, signatureMethod: java.lang.String, nonceSize: scala.Double) = this()
  def this(requestUrl: java.lang.String, accessUrl: java.lang.String, consumerKey: java.lang.String, consumerSecret: java.lang.String, version: java.lang.String, authorize_callback: scala.Null, signatureMethod: java.lang.String, nonceSize: scala.Double) = this()
  def this(requestUrl: java.lang.String, accessUrl: java.lang.String, consumerKey: java.lang.String, consumerSecret: java.lang.String, version: java.lang.String, authorize_callback: java.lang.String, signatureMethod: java.lang.String, nonceSize: scala.Double, customHeaders: nodeLib.httpMod.OutgoingHttpHeaders) = this()
  def this(requestUrl: java.lang.String, accessUrl: java.lang.String, consumerKey: java.lang.String, consumerSecret: java.lang.String, version: java.lang.String, authorize_callback: scala.Null, signatureMethod: java.lang.String, nonceSize: scala.Double, customHeaders: nodeLib.httpMod.OutgoingHttpHeaders) = this()
  var NONCE_CHARS: js.Array[java.lang.String] = js.native
  var _accessUrl: java.lang.String = js.native
  var _authorize_callback: java.lang.String = js.native
  var _clientOptions: oauthLib.Anon_RequestTokenHttpMethod = js.native
  var _consumerKey: java.lang.String = js.native
  var _consumerSecret: java.lang.String = js.native
  var _headers: nodeLib.httpMod.OutgoingHttpHeaders = js.native
  var _isEcho: scala.Boolean = js.native
  var _nonceSize: scala.Double = js.native
  var _oauthParameterSeperator: java.lang.String = js.native
  var _protectedKey: java.lang.String = js.native
  var _realm: java.lang.String = js.native
  var _requestUrl: java.lang.String = js.native
  var _signatureMethod: java.lang.String = js.native
  var _verifyCredentials: java.lang.String = js.native
  var _version: java.lang.String = js.native
  /* protected */ def _buildAuthorizationHeaders(orderedParameters: js.Array[js.Array[java.lang.String]]): java.lang.String = js.native
  /* protected */ def _createClient(
    port: js.UndefOr[java.lang.String | scala.Double],
    hostname: js.UndefOr[java.lang.String],
    method: js.UndefOr[java.lang.String],
    path: js.UndefOr[java.lang.String],
    headers: js.UndefOr[nodeLib.httpMod.OutgoingHttpHeaders],
    sslEnabled: js.UndefOr[scala.Boolean]
  ): nodeLib.httpMod.ClientRequest = js.native
  /* protected */ def _createSignature(signatureBase: java.lang.String, tokenSecret: java.lang.String): java.lang.String = js.native
  /* protected */ def _createSignatureBase(method: java.lang.String, url: java.lang.String, parameters: java.lang.String): java.lang.String = js.native
  /* protected */ def _decodeData(toDecode: java.lang.String): java.lang.String = js.native
  /* protected */ def _encodeData(toEncode: java.lang.String): java.lang.String = js.native
  /* protected */ def _getNonce(nonceSize: scala.Double): java.lang.String = js.native
  /* protected */ def _getSignature(
    method: java.lang.String,
    url: java.lang.String,
    parameters: java.lang.String,
    tokenSecret: java.lang.String
  ): java.lang.String = js.native
  /* protected */ def _getTimestamp(): scala.Double | java.lang.String = js.native
  /* protected */ def _isParameterNameAnOAuthParameter(parameter: java.lang.String): scala.Boolean = js.native
  /* protected */ def _makeArrayOfArgumentsHash(
    argumentHash: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  ): js.Array[js.Array[java.lang.String]] = js.native
  /* protected */ def _normaliseRequestParams(args: js.Array[js.Array[java.lang.String]]): java.lang.String = js.native
  /* protected */ def _normalizeUrl(url: java.lang.String): java.lang.String = js.native
  /* protected */ def _performSecureRequest(
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String,
    method: java.lang.String,
    url: java.lang.String
  ): nodeLib.httpMod.ClientRequest = js.native
  /* protected */ def _performSecureRequest(
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String,
    method: java.lang.String,
    url: java.lang.String,
    extra_params: js.Any
  ): nodeLib.httpMod.ClientRequest = js.native
  /* protected */ def _performSecureRequest(
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String,
    method: java.lang.String,
    url: java.lang.String,
    extra_params: js.Any,
    post_body: js.Any
  ): nodeLib.httpMod.ClientRequest = js.native
  /* protected */ def _performSecureRequest(
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String,
    method: java.lang.String,
    url: java.lang.String,
    extra_params: js.Any,
    post_body: js.Any,
    post_content_type: java.lang.String
  ): nodeLib.httpMod.ClientRequest = js.native
  /* protected */ def _performSecureRequest(
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String,
    method: java.lang.String,
    url: java.lang.String,
    extra_params: js.Any,
    post_body: js.Any,
    post_content_type: java.lang.String,
    callback: dataCallback
  ): nodeLib.httpMod.ClientRequest = js.native
  /* protected */ def _prepareParameters(oauth_token_secret: java.lang.String, method: java.lang.String, url: java.lang.String): js.Array[js.Array[java.lang.String]] = js.native
  /* protected */ def _prepareParameters(
    oauth_token_secret: java.lang.String,
    method: java.lang.String,
    url: java.lang.String,
    extra_params: js.Any
  ): js.Array[js.Array[java.lang.String]] = js.native
  /* protected */ def _prepareParameters(
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String,
    method: java.lang.String,
    url: java.lang.String
  ): js.Array[js.Array[java.lang.String]] = js.native
  /* protected */ def _prepareParameters(
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String,
    method: java.lang.String,
    url: java.lang.String,
    extra_params: js.Any
  ): js.Array[js.Array[java.lang.String]] = js.native
  /* protected */ def _putOrPost(
    method: java.lang.String,
    url: java.lang.String,
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String
  ): nodeLib.httpMod.ClientRequest = js.native
  /* protected */ def _putOrPost(
    method: java.lang.String,
    url: java.lang.String,
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String,
    post_body: js.Any
  ): nodeLib.httpMod.ClientRequest = js.native
  /* protected */ def _putOrPost(
    method: java.lang.String,
    url: java.lang.String,
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String,
    post_body: js.Any,
    post_content_type: java.lang.String
  ): nodeLib.httpMod.ClientRequest = js.native
  /* protected */ def _putOrPost(
    method: java.lang.String,
    url: java.lang.String,
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String,
    post_body: js.Any,
    post_content_type: java.lang.String,
    callback: dataCallback
  ): nodeLib.httpMod.ClientRequest = js.native
  /* protected */ def _sortRequestParams(argument_pairs: js.Array[js.Array[java.lang.String]]): js.Array[js.Array[java.lang.String]] = js.native
  def authHeader(url: java.lang.String, oauth_token: java.lang.String, oauth_token_secret: java.lang.String): java.lang.String = js.native
  def authHeader(
    url: java.lang.String,
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String,
    method: java.lang.String
  ): java.lang.String = js.native
  def delete(
    url: java.lang.String,
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String,
    callback: dataCallback
  ): nodeLib.httpMod.ClientRequest = js.native
  def get(
    url: java.lang.String,
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String,
    callback: dataCallback
  ): nodeLib.httpMod.ClientRequest = js.native
  def getOAuthAccessToken(oauth_token: java.lang.String, oauth_token_secret: java.lang.String, callback: oauth1tokenCallback): scala.Unit = js.native
  def getOAuthAccessToken(
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String,
    oauth_verifier: java.lang.String,
    callback: oauth1tokenCallback
  ): scala.Unit = js.native
  def getOAuthRequestToken(callback: oauth1tokenCallback): scala.Unit = js.native
  def getOAuthRequestToken(extraparams: js.Any, callback: oauth1tokenCallback): scala.Unit = js.native
  def getProtectedResource(
    url: java.lang.String,
    method: java.lang.String,
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String,
    callback: dataCallback
  ): scala.Unit = js.native
  def post(url: java.lang.String, oauth_token: java.lang.String, oauth_token_secret: java.lang.String): nodeLib.httpMod.ClientRequest = js.native
  def post(
    url: java.lang.String,
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String,
    post_body: js.Any
  ): nodeLib.httpMod.ClientRequest = js.native
  def post(
    url: java.lang.String,
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String,
    post_body: js.Any,
    post_content_type: java.lang.String
  ): nodeLib.httpMod.ClientRequest = js.native
  def post(
    url: java.lang.String,
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String,
    post_body: js.Any,
    post_content_type: java.lang.String,
    callback: dataCallback
  ): nodeLib.httpMod.ClientRequest = js.native
  def put(url: java.lang.String, oauth_token: java.lang.String, oauth_token_secret: java.lang.String): nodeLib.httpMod.ClientRequest = js.native
  def put(
    url: java.lang.String,
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String,
    post_body: js.Any
  ): nodeLib.httpMod.ClientRequest = js.native
  def put(
    url: java.lang.String,
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String,
    post_body: js.Any,
    post_content_type: java.lang.String
  ): nodeLib.httpMod.ClientRequest = js.native
  def put(
    url: java.lang.String,
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String,
    post_body: js.Any,
    post_content_type: java.lang.String,
    callback: dataCallback
  ): nodeLib.httpMod.ClientRequest = js.native
  def setClientOptions(options: oauthLib.Anon_RequestTokenHttpMethod): scala.Unit = js.native
  def signUrl(url: java.lang.String, oauth_token: java.lang.String, oauth_token_secret: java.lang.String): java.lang.String = js.native
  def signUrl(
    url: java.lang.String,
    oauth_token: java.lang.String,
    oauth_token_secret: java.lang.String,
    method: java.lang.String
  ): java.lang.String = js.native
}

