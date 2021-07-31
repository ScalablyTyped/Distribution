package typings.oauth2Server.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface representing the refresh token and associated data.
  */
trait RefreshToken
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var client: Client
  
  var refreshToken: String
  
  var refreshTokenExpiresAt: js.UndefOr[Date] = js.undefined
  
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var user: User
}
object RefreshToken {
  
  @scala.inline
  def apply(client: Client, refreshToken: String, user: User): RefreshToken = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshToken]
  }
  
  @scala.inline
  implicit class RefreshTokenMutableBuilder[Self <: RefreshToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenExpiresAt(value: Date): Self = StObject.set(x, "refreshTokenExpiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenExpiresAtUndefined: Self = StObject.set(x, "refreshTokenExpiresAt", js.undefined)
    
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
