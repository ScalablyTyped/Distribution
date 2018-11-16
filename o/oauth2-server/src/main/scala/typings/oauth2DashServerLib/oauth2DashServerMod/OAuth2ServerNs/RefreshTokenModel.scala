package typings
package oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshTokenModel
  extends BaseModel
     with RequestAuthenticationModel {
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
           * Invoked to retrieve an existing refresh token previously saved through Model#saveToken().
           *
           */
  def getRefreshToken(refreshToken: java.lang.String): stdLib.Promise[RefreshToken | Falsey] = js.native
  /**
           * Invoked to retrieve an existing refresh token previously saved through Model#saveToken().
           *
           */
  def getRefreshToken(refreshToken: java.lang.String, callback: Callback[RefreshToken]): stdLib.Promise[RefreshToken | Falsey] = js.native
  /**
           * Invoked to revoke a refresh token.
           *
           */
  def revokeToken(token: RefreshToken): stdLib.Promise[scala.Boolean] = js.native
  /**
           * Invoked to revoke a refresh token.
           *
           */
  def revokeToken(token: RefreshToken, callback: Callback[scala.Boolean]): stdLib.Promise[scala.Boolean] = js.native
  /**
           * Invoked to revoke a refresh token.
           *
           */
  def revokeToken(token: Token): stdLib.Promise[scala.Boolean] = js.native
  /**
           * Invoked to revoke a refresh token.
           *
           */
  def revokeToken(token: Token, callback: Callback[scala.Boolean]): stdLib.Promise[scala.Boolean] = js.native
}

