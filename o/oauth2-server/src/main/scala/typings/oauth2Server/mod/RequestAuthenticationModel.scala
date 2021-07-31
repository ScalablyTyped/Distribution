package typings.oauth2Server.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestAuthenticationModel extends StObject {
  
  /**
    * Invoked to retrieve an existing access token previously saved through Model#saveToken().
    *
    */
  def getAccessToken(accessToken: String): js.Promise[Token | Falsey] = js.native
  def getAccessToken(accessToken: String, callback: Callback[Token]): js.Promise[Token | Falsey] = js.native
  
  /**
    * Invoked during request authentication to check if the provided access token was authorized the requested scopes.
    *
    */
  def verifyScope(token: Token, scope: String): js.Promise[Boolean] = js.native
  def verifyScope(token: Token, scope: String, callback: Callback[Boolean]): js.Promise[Boolean] = js.native
  def verifyScope(token: Token, scope: js.Array[String]): js.Promise[Boolean] = js.native
  def verifyScope(token: Token, scope: js.Array[String], callback: Callback[Boolean]): js.Promise[Boolean] = js.native
}
