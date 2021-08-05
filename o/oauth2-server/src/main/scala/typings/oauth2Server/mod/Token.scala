package typings.oauth2Server.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface representing the token(s) and associated data.
  */
trait Token
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var accessToken: String
  
  var accessTokenExpiresAt: js.UndefOr[Date] = js.undefined
  
  var client: Client
  
  var refreshToken: js.UndefOr[String] = js.undefined
  
  var refreshTokenExpiresAt: js.UndefOr[Date] = js.undefined
  
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var user: User
}
object Token {
  
  inline def apply(accessToken: String, client: Client, user: User): Token = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  extension [Self <: Token](x: Self) {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenExpiresAt(value: Date): Self = StObject.set(x, "accessTokenExpiresAt", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenExpiresAtUndefined: Self = StObject.set(x, "accessTokenExpiresAt", js.undefined)
    
    inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenExpiresAt(value: Date): Self = StObject.set(x, "refreshTokenExpiresAt", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenExpiresAtUndefined: Self = StObject.set(x, "refreshTokenExpiresAt", js.undefined)
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    
    inline def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
