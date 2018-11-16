package typings
package oauthLib.oauthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth", "OAuth2")
@js.native
class OAuth2 protected () extends js.Object {
  def this(clientId: java.lang.String, clientSecret: java.lang.String, baseSite: java.lang.String) = this()
  def this(clientId: java.lang.String, clientSecret: java.lang.String, baseSite: java.lang.String, authorizePath: java.lang.String) = this()
  def this(clientId: java.lang.String, clientSecret: java.lang.String, baseSite: java.lang.String, authorizePath: java.lang.String, accessTokenPath: java.lang.String) = this()
  def this(clientId: java.lang.String, clientSecret: java.lang.String, baseSite: java.lang.String, authorizePath: java.lang.String, accessTokenPath: java.lang.String, customHeaders: nodeLib.httpMod.OutgoingHttpHeaders) = this()
  var _accessTokenName: java.lang.String = js.native
  var _accessTokenUrl: java.lang.String = js.native
  var _agent: nodeLib.httpMod.Agent | scala.Boolean = js.native
  var _authMethod: java.lang.String = js.native
  var _authorizeUrl: java.lang.String = js.native
  var _baseSite: java.lang.String = js.native
  var _clientId: java.lang.String = js.native
  var _clientSecret: java.lang.String = js.native
  var _customHeaders: nodeLib.httpMod.OutgoingHttpHeaders = js.native
  var _useAuthorizationHeaderForGET: scala.Boolean = js.native
  /* protected */ def _chooseHttpLibrary(parsedUrl: nodeLib.urlMod.UrlWithStringQuery): java.lang.String = js.native
  /* protected */ def _executeRequest(http_library: java.lang.String, options: nodeLib.httpMod.RequestOptions, callback: dataCallback): scala.Unit = js.native
  /* protected */ def _executeRequest(
    http_library: java.lang.String,
    options: nodeLib.httpMod.RequestOptions,
    post_body: js.Any,
    callback: dataCallback
  ): scala.Unit = js.native
  /* protected */ def _getAccessTokenUrl(): java.lang.String = js.native
  /* protected */ def _request(
    method: java.lang.String,
    url: java.lang.String,
    headers: nodeLib.httpMod.OutgoingHttpHeaders,
    post_body: js.Any,
    access_token: java.lang.String,
    callback: dataCallback
  ): scala.Unit = js.native
  /* protected */ def _request(
    method: java.lang.String,
    url: java.lang.String,
    headers: nodeLib.httpMod.OutgoingHttpHeaders,
    post_body: js.Any,
    access_token: scala.Null,
    callback: dataCallback
  ): scala.Unit = js.native
  /* protected */ def _request(
    method: java.lang.String,
    url: java.lang.String,
    headers: scala.Null,
    post_body: js.Any,
    access_token: java.lang.String,
    callback: dataCallback
  ): scala.Unit = js.native
  /* protected */ def _request(
    method: java.lang.String,
    url: java.lang.String,
    headers: scala.Null,
    post_body: js.Any,
    access_token: scala.Null,
    callback: dataCallback
  ): scala.Unit = js.native
  def buildAuthHeader(token: java.lang.String): java.lang.String = js.native
  def get(url: java.lang.String, access_token: java.lang.String, callback: dataCallback): scala.Unit = js.native
  def getAuthorizeUrl(): java.lang.String = js.native
  def getAuthorizeUrl(params: js.Any): java.lang.String = js.native
  def getOAuthAccessToken(code: java.lang.String, callback: oauth2tokenCallback): scala.Unit = js.native
  def getOAuthAccessToken(code: java.lang.String, params: js.Any, callback: oauth2tokenCallback): scala.Unit = js.native
  def getProtectedResource(url: java.lang.String, access_token: java.lang.String, callback: dataCallback): scala.Unit = js.native
  def setAccessTokenName(name: java.lang.String): scala.Unit = js.native
  def setAgent(agent: nodeLib.httpMod.Agent): scala.Unit = js.native
  def setAgent(agent: scala.Boolean): scala.Unit = js.native
  def setAuthMethod(authMethod: java.lang.String): scala.Unit = js.native
  def useAuthorizationHeaderforGET(useIt: scala.Boolean): scala.Unit = js.native
}

