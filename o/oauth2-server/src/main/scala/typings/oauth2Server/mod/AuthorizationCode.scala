package typings.oauth2Server.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface representing the authorization code and associated data.
  */
trait AuthorizationCode
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var authorizationCode: String
  
  var client: Client
  
  var expiresAt: Date
  
  var redirectUri: String
  
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var user: User
}
object AuthorizationCode {
  
  inline def apply(authorizationCode: String, client: Client, expiresAt: Date, redirectUri: String, user: User): AuthorizationCode = {
    val __obj = js.Dynamic.literal(authorizationCode = authorizationCode.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationCode]
  }
  
  extension [Self <: AuthorizationCode](x: Self) {
    
    inline def setAuthorizationCode(value: String): Self = StObject.set(x, "authorizationCode", value.asInstanceOf[js.Any])
    
    inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setExpiresAt(value: Date): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
    
    inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
