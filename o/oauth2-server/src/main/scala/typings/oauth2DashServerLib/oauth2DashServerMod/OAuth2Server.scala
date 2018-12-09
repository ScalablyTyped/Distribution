package typings
package oauth2DashServerLib.oauth2DashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents an OAuth2 server instance.
 */
@js.native
trait OAuth2Server extends js.Object {
  /**
       * Authenticates a request.
       */
  def authenticate(
    request: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Request,
    response: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Response
  ): js.Promise[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Token] = js.native
  /**
       * Authenticates a request.
       */
  def authenticate(
    request: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Request,
    response: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Response,
    options: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.AuthenticateOptions
  ): js.Promise[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Token] = js.native
  /**
       * Authenticates a request.
       */
  def authenticate(
    request: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Request,
    response: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Response,
    options: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.AuthenticateOptions,
    callback: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Callback[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Token]
  ): js.Promise[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Token] = js.native
  /**
       * Authorizes a token request.
       */
  def authorize(
    request: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Request,
    response: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Response
  ): js.Promise[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.AuthorizationCode] = js.native
  /**
       * Authorizes a token request.
       */
  def authorize(
    request: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Request,
    response: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Response,
    options: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.AuthorizeOptions
  ): js.Promise[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.AuthorizationCode] = js.native
  /**
       * Authorizes a token request.
       */
  def authorize(
    request: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Request,
    response: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Response,
    options: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.AuthorizeOptions,
    callback: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Callback[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.AuthorizationCode]
  ): js.Promise[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.AuthorizationCode] = js.native
  /**
       * Retrieves a new token for an authorized token request.
       */
  def token(
    request: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Request,
    response: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Response
  ): js.Promise[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Token] = js.native
  /**
       * Retrieves a new token for an authorized token request.
       */
  def token(
    request: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Request,
    response: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Response,
    options: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.TokenOptions
  ): js.Promise[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Token] = js.native
  /**
       * Retrieves a new token for an authorized token request.
       */
  def token(
    request: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Request,
    response: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Response,
    options: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.TokenOptions,
    callback: oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Callback[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Token]
  ): js.Promise[oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs.Token] = js.native
}

