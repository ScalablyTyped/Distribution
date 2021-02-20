package typings.oauth2Server

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<oauth2-server.oauth2-server.AuthorizationCode, 'authorizationCode' | 'expiresAt' | 'redirectUri' | 'scope'> */
  @js.native
  trait PickAuthorizationCodeauth extends StObject {
    
    var authorizationCode: String = js.native
    
    var expiresAt: Date = js.native
    
    var redirectUri: String = js.native
    
    var scope: js.UndefOr[String | js.Array[String]] = js.native
  }
  object PickAuthorizationCodeauth {
    
    @scala.inline
    def apply(authorizationCode: String, expiresAt: Date, redirectUri: String): PickAuthorizationCodeauth = {
      val __obj = js.Dynamic.literal(authorizationCode = authorizationCode.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickAuthorizationCodeauth]
    }
    
    @scala.inline
    implicit class PickAuthorizationCodeauthMutableBuilder[Self <: PickAuthorizationCodeauth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizationCode(value: String): Self = StObject.set(x, "authorizationCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresAt(value: Date): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
    }
  }
}
