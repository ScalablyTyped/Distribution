package typings.oauth2Server.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an OAuth2 server instance.
  */
@js.native
trait OAuth2Server extends StObject {
  
  /**
    * Authenticates a request.
    */
  def authenticate(request: Request, response: Response): js.Promise[Token] = js.native
  def authenticate(request: Request, response: Response, options: Unit, callback: Callback[Token]): js.Promise[Token] = js.native
  def authenticate(request: Request, response: Response, options: AuthenticateOptions): js.Promise[Token] = js.native
  def authenticate(request: Request, response: Response, options: AuthenticateOptions, callback: Callback[Token]): js.Promise[Token] = js.native
  
  /**
    * Authorizes a token request.
    */
  def authorize(request: Request, response: Response): js.Promise[AuthorizationCode] = js.native
  def authorize(request: Request, response: Response, options: Unit, callback: Callback[AuthorizationCode]): js.Promise[AuthorizationCode] = js.native
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
  def token(request: Request, response: Response, options: Unit, callback: Callback[Token]): js.Promise[Token] = js.native
  def token(request: Request, response: Response, options: TokenOptions): js.Promise[Token] = js.native
  def token(request: Request, response: Response, options: TokenOptions, callback: Callback[Token]): js.Promise[Token] = js.native
}
object OAuth2Server {
  
  /* static member */
  @scala.inline
  def apply: Instantiable1[/* options */ ServerOptions, OAuth2Server] = ^.asInstanceOf[js.Dynamic].selectDynamic("OAuth2Server").asInstanceOf[Instantiable1[/* options */ ServerOptions, OAuth2Server]]
}
