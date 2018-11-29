package typings
package oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractGrantType extends js.Object {
  /**
           * Generate access token. Calls Model#generateAccessToken() if implemented.
           *
           */
  def generateAccessToken(client: Client, user: User, scope: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  /**
           * Generate access token. Calls Model#generateAccessToken() if implemented.
           *
           */
  def generateAccessToken(client: Client, user: User, scope: js.Array[java.lang.String]): stdLib.Promise[java.lang.String] = js.native
  /**
           * Generate refresh token. Calls Model#generateRefreshToken() if implemented.
           *
           */
  def generateRefreshToken(client: Client, user: User, scope: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  /**
           * Generate refresh token. Calls Model#generateRefreshToken() if implemented.
           *
           */
  def generateRefreshToken(client: Client, user: User, scope: js.Array[java.lang.String]): stdLib.Promise[java.lang.String] = js.native
  /**
           * Get access token expiration date.
           *
           */
  def getAccessTokenExpiresAt(): stdLib.Date = js.native
  /**
           * Get refresh token expiration date.
           *
           */
  def getRefreshTokenExpiresAt(): stdLib.Date = js.native
  /**
           * Get scope from the request body.
           *
           */
  def getScope(request: Request): java.lang.String = js.native
  /**
           * Retrieve info from the request and client and return token
           *
           */
  def handle(request: Request, client: Client): stdLib.Promise[Token | Falsey] = js.native
  /**
           * Validate requested scope. Calls Model#validateScope() if implemented.
           *
           */
  def validateScope(user: User, client: Client, scope: java.lang.String): stdLib.Promise[java.lang.String | js.Array[java.lang.String] | Falsey] = js.native
  /**
           * Validate requested scope. Calls Model#validateScope() if implemented.
           *
           */
  def validateScope(user: User, client: Client, scope: js.Array[java.lang.String]): stdLib.Promise[java.lang.String | js.Array[java.lang.String] | Falsey] = js.native
}

