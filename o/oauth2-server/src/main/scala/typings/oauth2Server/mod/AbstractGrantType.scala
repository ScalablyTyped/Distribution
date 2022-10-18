package typings.oauth2Server.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("oauth2-server", "AbstractGrantType")
@js.native
open class AbstractGrantType protected () extends StObject {
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
  def getAccessTokenExpiresAt(): js.Date = js.native
  
  /**
    * Get refresh token expiration date.
    *
    */
  def getRefreshTokenExpiresAt(): js.Date = js.native
  
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
