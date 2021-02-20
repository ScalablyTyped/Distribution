package typings.oauth2Server.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticateOptions extends StObject {
  
  /**
    * Set the X-Accepted-OAuth-Scopes HTTP header on response objects.
    */
  var addAcceptedScopesHeader: js.UndefOr[Boolean] = js.native
  
  /**
    * Set the X-OAuth-Scopes HTTP header on response objects.
    */
  var addAuthorizedScopesHeader: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow clients to pass bearer tokens in the query string of a request.
    */
  var allowBearerTokensInQueryString: js.UndefOr[Boolean] = js.native
  
  /**
    * The scope(s) to authenticate.
    */
  var scope: js.UndefOr[String | js.Array[String]] = js.native
}
object AuthenticateOptions {
  
  @scala.inline
  def apply(): AuthenticateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticateOptions]
  }
  
  @scala.inline
  implicit class AuthenticateOptionsMutableBuilder[Self <: AuthenticateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddAcceptedScopesHeader(value: Boolean): Self = StObject.set(x, "addAcceptedScopesHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddAcceptedScopesHeaderUndefined: Self = StObject.set(x, "addAcceptedScopesHeader", js.undefined)
    
    @scala.inline
    def setAddAuthorizedScopesHeader(value: Boolean): Self = StObject.set(x, "addAuthorizedScopesHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddAuthorizedScopesHeaderUndefined: Self = StObject.set(x, "addAuthorizedScopesHeader", js.undefined)
    
    @scala.inline
    def setAllowBearerTokensInQueryString(value: Boolean): Self = StObject.set(x, "allowBearerTokensInQueryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowBearerTokensInQueryStringUndefined: Self = StObject.set(x, "allowBearerTokensInQueryString", js.undefined)
    
    @scala.inline
    def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
  }
}
