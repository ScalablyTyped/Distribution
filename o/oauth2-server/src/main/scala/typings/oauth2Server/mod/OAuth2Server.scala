package typings.oauth2Server.mod

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
  def authenticate(request: Request, response: Response): js.Promise[Token] = js.native
  def authenticate(request: Request, response: Response, options: AuthenticateOptions): js.Promise[Token] = js.native
  def authenticate(request: Request, response: Response, options: AuthenticateOptions, callback: Callback[Token]): js.Promise[Token] = js.native
  /**
    * Authorizes a token request.
    */
  def authorize(request: Request, response: Response): js.Promise[AuthorizationCode] = js.native
  def authorize(request: Request, response: Response, options: AuthorizeOptions): js.Promise[AuthorizationCode] = js.native
  def authorize(
    request: Request,
    response: Response,
    options: AuthorizeOptions,
    callback: Callback[AuthorizationCode]
  ): js.Promise[AuthorizationCode] = js.native
  /**
    * Retrieves a new token for an authorized token request.
    */
  def token(request: Request, response: Response): js.Promise[Token] = js.native
  def token(request: Request, response: Response, options: TokenOptions): js.Promise[Token] = js.native
  def token(request: Request, response: Response, options: TokenOptions, callback: Callback[Token]): js.Promise[Token] = js.native
}

