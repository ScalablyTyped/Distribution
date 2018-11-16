package typings
package oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
      /* scope */ java.lang.String | js.Array[java.lang.String], 
      /* callback */ js.UndefOr[Callback[java.lang.String]], 
      stdLib.Promise[java.lang.String]
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
      /* scope */ java.lang.String | js.Array[java.lang.String], 
      /* callback */ js.UndefOr[Callback[java.lang.String]], 
      stdLib.Promise[java.lang.String]
    ]
  ] = js.native
  /**
           * Invoked to check if the requested scope is valid for a particular client/user combination.
           *
           */
  var validateScope: js.UndefOr[
    js.Function4[
      /* user */ User, 
      /* client */ Client, 
      /* scope */ java.lang.String | js.Array[java.lang.String], 
      /* callback */ js.UndefOr[Callback[java.lang.String | Falsey]], 
      stdLib.Promise[java.lang.String | js.Array[java.lang.String] | Falsey]
    ]
  ] = js.native
  /**
           * Invoked to retrieve an existing authorization code previously saved through Model#saveAuthorizationCode().
           *
           */
  def getAuthorizationCode(authorizationCode: java.lang.String): stdLib.Promise[AuthorizationCode | Falsey] = js.native
  /**
           * Invoked to retrieve an existing authorization code previously saved through Model#saveAuthorizationCode().
           *
           */
  def getAuthorizationCode(authorizationCode: java.lang.String, callback: Callback[AuthorizationCode]): stdLib.Promise[AuthorizationCode | Falsey] = js.native
  /**
           * Invoked to revoke an authorization code.
           *
           */
  def revokeAuthorizationCode(code: AuthorizationCode): stdLib.Promise[scala.Boolean] = js.native
  /**
           * Invoked to revoke an authorization code.
           *
           */
  def revokeAuthorizationCode(code: AuthorizationCode, callback: Callback[scala.Boolean]): stdLib.Promise[scala.Boolean] = js.native
  /**
           * Invoked to save an authorization code.
           *
           */
  def saveAuthorizationCode(code: AuthorizationCode, client: Client, user: User): stdLib.Promise[AuthorizationCode | Falsey] = js.native
  /**
           * Invoked to save an authorization code.
           *
           */
  def saveAuthorizationCode(code: AuthorizationCode, client: Client, user: User, callback: Callback[AuthorizationCode]): stdLib.Promise[AuthorizationCode | Falsey] = js.native
}

