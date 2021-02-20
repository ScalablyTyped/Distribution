package typings.oauth2Server.mod

import typings.oauth2Server.anon.PickAuthorizationCodeauth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizationCodeModel
  extends BaseModel
     with RequestAuthenticationModel {
  
  /**
    * Invoked to generate a new authorization code.
    *
    */
  var generateAuthorizationCode: js.UndefOr[
    js.Function4[
      /* client */ Client, 
      /* user */ User, 
      /* scope */ String | js.Array[String], 
      /* callback */ js.UndefOr[Callback[String]], 
      js.Promise[String]
    ]
  ] = js.native
  
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
    * Invoked to retrieve an existing authorization code previously saved through Model#saveAuthorizationCode().
    *
    */
  def getAuthorizationCode(authorizationCode: String): js.Promise[AuthorizationCode | Falsey] = js.native
  def getAuthorizationCode(authorizationCode: String, callback: Callback[AuthorizationCode]): js.Promise[AuthorizationCode | Falsey] = js.native
  
  /**
    * Invoked to revoke an authorization code.
    *
    */
  def revokeAuthorizationCode(code: AuthorizationCode): js.Promise[Boolean] = js.native
  def revokeAuthorizationCode(code: AuthorizationCode, callback: Callback[Boolean]): js.Promise[Boolean] = js.native
  
  /**
    * Invoked to save an authorization code.
    *
    */
  def saveAuthorizationCode(code: PickAuthorizationCodeauth, client: Client, user: User): js.Promise[AuthorizationCode | Falsey] = js.native
  def saveAuthorizationCode(code: PickAuthorizationCodeauth, client: Client, user: User, callback: Callback[AuthorizationCode]): js.Promise[AuthorizationCode | Falsey] = js.native
  
  /**
    * Invoked to check if the requested scope is valid for a particular client/user combination.
    *
    */
  var validateScope: js.UndefOr[
    js.Function4[
      /* user */ User, 
      /* client */ Client, 
      /* scope */ String | js.Array[String], 
      /* callback */ js.UndefOr[Callback[String | Falsey]], 
      js.Promise[String | js.Array[String] | Falsey]
    ]
  ] = js.native
}
