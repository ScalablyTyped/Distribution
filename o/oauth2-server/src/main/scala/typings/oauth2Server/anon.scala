package typings.oauth2Server

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<oauth2-server.oauth2-server.AuthorizationCode, 'authorizationCode' | 'expiresAt' | 'redirectUri' | 'scope'> */
  trait PickAuthorizationCodeauth extends StObject {
    
    var authorizationCode: String
    
    var expiresAt: Date
    
    var redirectUri: String
    
    var scope: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object PickAuthorizationCodeauth {
    
    inline def apply(authorizationCode: String, expiresAt: Date, redirectUri: String): PickAuthorizationCodeauth = {
      val __obj = js.Dynamic.literal(authorizationCode = authorizationCode.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickAuthorizationCodeauth]
    }
    
    extension [Self <: PickAuthorizationCodeauth](x: Self) {
      
      inline def setAuthorizationCode(value: String): Self = StObject.set(x, "authorizationCode", value.asInstanceOf[js.Any])
      
      inline def setExpiresAt(value: Date): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
    }
  }
}
