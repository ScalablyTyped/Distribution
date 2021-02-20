package typings.oauth2Server.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizeOptions extends StObject {
  
  /**
    * Allow clients to specify an empty state
    */
  var allowEmptyState: js.UndefOr[Boolean] = js.native
  
  /**
    * The authenticate handler
    */
  var authenticateHandler: js.UndefOr[js.Object] = js.native
  
  /**
    * Lifetime of generated authorization codes in seconds (default = 5 minutes).
    */
  var authorizationCodeLifetime: js.UndefOr[Double] = js.native
}
object AuthorizeOptions {
  
  @scala.inline
  def apply(): AuthorizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeOptions]
  }
  
  @scala.inline
  implicit class AuthorizeOptionsMutableBuilder[Self <: AuthorizeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowEmptyState(value: Boolean): Self = StObject.set(x, "allowEmptyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEmptyStateUndefined: Self = StObject.set(x, "allowEmptyState", js.undefined)
    
    @scala.inline
    def setAuthenticateHandler(value: js.Object): Self = StObject.set(x, "authenticateHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticateHandlerUndefined: Self = StObject.set(x, "authenticateHandler", js.undefined)
    
    @scala.inline
    def setAuthorizationCodeLifetime(value: Double): Self = StObject.set(x, "authorizationCodeLifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationCodeLifetimeUndefined: Self = StObject.set(x, "authorizationCodeLifetime", js.undefined)
  }
}
