package typings.oauth2DashServer.oauth2DashServerMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth2-server", "AbstractGrantType")
@js.native
abstract class AbstractGrantType protected () extends js.Object {
  /**
    * Instantiates AbstractGrantType using the supplied options.
    *
    */
  def this(options: TokenOptions) = this()
  /**
    * Generate access token. Calls Model#generateAccessToken() if implemented.
    *
    */
  def generateAccessToken(client: Client, user: User, scope: String): js.Promise[String] = js.native
  def generateAccessToken(client: Client, user: User, scope: js.Array[String]): js.Promise[String] = js.native
  /**
    * Generate refresh token. Calls Model#generateRefreshToken() if implemented.
    *
    */
  def generateRefreshToken(client: Client, user: User, scope: String): js.Promise[String] = js.native
  def generateRefreshToken(client: Client, user: User, scope: js.Array[String]): js.Promise[String] = js.native
  /**
    * Get access token expiration date.
    *
    */
  def getAccessTokenExpiresAt(): Date = js.native
  /**
    * Get refresh token expiration date.
    *
    */
  def getRefreshTokenExpiresAt(): Date = js.native
  /**
    * Get scope from the request body.
    *
    */
  def getScope(request: Request): String = js.native
  /**
    * Retrieve info from the request and client and return token
    *
    */
  def handle(request: Request, client: Client): js.Promise[Token | Falsey] = js.native
  /**
    * Validate requested scope. Calls Model#validateScope() if implemented.
    *
    */
  def validateScope(user: User, client: Client, scope: String): js.Promise[String | js.Array[String] | Falsey] = js.native
  def validateScope(user: User, client: Client, scope: js.Array[String]): js.Promise[String | js.Array[String] | Falsey] = js.native
}

