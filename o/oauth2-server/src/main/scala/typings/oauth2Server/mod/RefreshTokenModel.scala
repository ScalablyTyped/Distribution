package typings.oauth2Server.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshTokenModel
  extends StObject
     with BaseModel
     with RequestAuthenticationModel {
  
  /**
    * Invoked to generate a new refresh token.
    *
    */
  var generateRefreshToken: js.UndefOr[
    js.Function4[
      /* client */ Client, 
      /* user */ User, 
      /* scope */ String | js.Array[String], 
      /* callback */ js.UndefOr[Callback[String]], 
      js.Promise[String]
    ]
  ] = js.native
  
  /**
    * Invoked to retrieve an existing refresh token previously saved through Model#saveToken().
    *
    */
  def getRefreshToken(refreshToken: String): js.Promise[RefreshToken | Falsey] = js.native
  def getRefreshToken(refreshToken: String, callback: Callback[RefreshToken]): js.Promise[RefreshToken | Falsey] = js.native
  
  /**
    * Invoked to revoke a refresh token.
    *
    */
  def revokeToken(token: RefreshToken): js.Promise[Boolean] = js.native
  def revokeToken(token: RefreshToken, callback: Callback[Boolean]): js.Promise[Boolean] = js.native
  def revokeToken(token: Token): js.Promise[Boolean] = js.native
  def revokeToken(token: Token, callback: Callback[Boolean]): js.Promise[Boolean] = js.native
}
