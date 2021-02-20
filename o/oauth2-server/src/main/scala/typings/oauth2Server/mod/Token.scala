package typings.oauth2Server.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface representing the token(s) and associated data.
  */
@js.native
trait Token
  extends /* key */ StringDictionary[js.Any] {
  
  var accessToken: String = js.native
  
  var accessTokenExpiresAt: js.UndefOr[Date] = js.native
  
  var client: Client = js.native
  
  var refreshToken: js.UndefOr[String] = js.native
  
  var refreshTokenExpiresAt: js.UndefOr[Date] = js.native
  
  var scope: js.UndefOr[String | js.Array[String]] = js.native
  
  var user: User = js.native
}
object Token {
  
  @scala.inline
  def apply(accessToken: String, client: Client, user: User): Token = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  implicit class TokenMutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenExpiresAt(value: Date): Self = StObject.set(x, "accessTokenExpiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenExpiresAtUndefined: Self = StObject.set(x, "accessTokenExpiresAt", js.undefined)
    
    @scala.inline
    def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenExpiresAt(value: Date): Self = StObject.set(x, "refreshTokenExpiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenExpiresAtUndefined: Self = StObject.set(x, "refreshTokenExpiresAt", js.undefined)
    
    @scala.inline
    def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    
    @scala.inline
    def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
