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
  def getAccessToken(accessToken: java.lang.String): stdLib.Promise[Token | Falsey] = js.native
  /**
           * Invoked to retrieve an existing access token previously saved through Model#saveToken().
           *
           */
  def getAccessToken(accessToken: java.lang.String, callback: Callback[Token]): stdLib.Promise[Token | Falsey] = js.native
  /**
           * Invoked during request authentication to check if the provided access token was authorized the requested scopes.
           *
           */
  def verifyScope(token: Token, scope: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  /**
           * Invoked during request authentication to check if the provided access token was authorized the requested scopes.
           *
           */
  def verifyScope(token: Token, scope: java.lang.String, callback: Callback[scala.Boolean]): stdLib.Promise[scala.Boolean] = js.native
  /**
           * Invoked during request authentication to check if the provided access token was authorized the requested scopes.
           *
           */
  def verifyScope(token: Token, scope: js.Array[java.lang.String]): stdLib.Promise[scala.Boolean] = js.native
  /**
           * Invoked during request authentication to check if the provided access token was authorized the requested scopes.
           *
           */
  def verifyScope(token: Token, scope: js.Array[java.lang.String], callback: Callback[scala.Boolean]): stdLib.Promise[scala.Boolean] = js.native
}

