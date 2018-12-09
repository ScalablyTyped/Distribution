package typings
package oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestAuthenticationModel extends js.Object {
  /**
           * Invoked to retrieve an existing access token previously saved through Model#saveToken().
           *
           */
  def getAccessToken(accessToken: java.lang.String): js.Promise[Token | Falsey] = js.native
  /**
           * Invoked to retrieve an existing access token previously saved through Model#saveToken().
           *
           */
  def getAccessToken(accessToken: java.lang.String, callback: Callback[Token]): js.Promise[Token | Falsey] = js.native
  /**
           * Invoked during request authentication to check if the provided access token was authorized the requested scopes.
           *
           */
  def verifyScope(token: Token, scope: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
           * Invoked during request authentication to check if the provided access token was authorized the requested scopes.
           *
           */
  def verifyScope(token: Token, scope: java.lang.String, callback: Callback[scala.Boolean]): js.Promise[scala.Boolean] = js.native
  /**
           * Invoked during request authentication to check if the provided access token was authorized the requested scopes.
           *
           */
  def verifyScope(token: Token, scope: js.Array[java.lang.String]): js.Promise[scala.Boolean] = js.native
  /**
           * Invoked during request authentication to check if the provided access token was authorized the requested scopes.
           *
           */
  def verifyScope(token: Token, scope: js.Array[java.lang.String], callback: Callback[scala.Boolean]): js.Promise[scala.Boolean] = js.native
}

