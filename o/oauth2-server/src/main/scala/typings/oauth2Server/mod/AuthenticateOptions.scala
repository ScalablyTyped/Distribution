package typings.oauth2Server.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticateOptions extends StObject {
  
  /**
    * Set the X-Accepted-OAuth-Scopes HTTP header on response objects.
    */
  var addAcceptedScopesHeader: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the X-OAuth-Scopes HTTP header on response objects.
    */
  var addAuthorizedScopesHeader: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allow clients to pass bearer tokens in the query string of a request.
    */
  var allowBearerTokensInQueryString: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The scope(s) to authenticate.
    */
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
}
object AuthenticateOptions {
  
  inline def apply(): AuthenticateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticateOptions]
  }
  
  extension [Self <: AuthenticateOptions](x: Self) {
    
    inline def setAddAcceptedScopesHeader(value: Boolean): Self = StObject.set(x, "addAcceptedScopesHeader", value.asInstanceOf[js.Any])
    
    inline def setAddAcceptedScopesHeaderUndefined: Self = StObject.set(x, "addAcceptedScopesHeader", js.undefined)
    
    inline def setAddAuthorizedScopesHeader(value: Boolean): Self = StObject.set(x, "addAuthorizedScopesHeader", value.asInstanceOf[js.Any])
    
    inline def setAddAuthorizedScopesHeaderUndefined: Self = StObject.set(x, "addAuthorizedScopesHeader", js.undefined)
    
    inline def setAllowBearerTokensInQueryString(value: Boolean): Self = StObject.set(x, "allowBearerTokensInQueryString", value.asInstanceOf[js.Any])
    
    inline def setAllowBearerTokensInQueryStringUndefined: Self = StObject.set(x, "allowBearerTokensInQueryString", js.undefined)
    
    inline def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
  }
}
