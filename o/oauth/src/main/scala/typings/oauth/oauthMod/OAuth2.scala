package typings.oauth.oauthMod

import typings.node.httpMod.Agent
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.RequestOptions
import typings.node.urlMod.UrlWithStringQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth", "OAuth2")
@js.native
class OAuth2 protected () extends js.Object {
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
    authorizePath: String,
    accessTokenPath: String,
    customHeaders: OutgoingHttpHeaders
  ) = this()
  var _accessTokenName: String = js.native
  var _accessTokenUrl: String = js.native
  var _agent: Agent | Boolean = js.native
  var _authMethod: String = js.native
  var _authorizeUrl: String = js.native
  var _baseSite: String = js.native
  var _clientId: String = js.native
  var _clientSecret: String = js.native
  var _customHeaders: OutgoingHttpHeaders = js.native
  var _useAuthorizationHeaderForGET: Boolean = js.native
  /* protected */ def _chooseHttpLibrary(parsedUrl: UrlWithStringQuery): String = js.native
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

