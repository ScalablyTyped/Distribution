package typings.oauth2Server.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface representing the refresh token and associated data.
  */
trait RefreshToken
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var client: Client
  
  var refreshToken: String
  
  var refreshTokenExpiresAt: js.UndefOr[js.Date] = js.undefined
  
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var user: User
}
object RefreshToken {
  
  inline def apply(client: Client, refreshToken: String, user: User): RefreshToken = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefreshToken] (val x: Self) extends AnyVal {
    
    inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenExpiresAt(value: js.Date): Self = StObject.set(x, "refreshTokenExpiresAt", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenExpiresAtUndefined: Self = StObject.set(x, "refreshTokenExpiresAt", js.undefined)
    
    inline def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
