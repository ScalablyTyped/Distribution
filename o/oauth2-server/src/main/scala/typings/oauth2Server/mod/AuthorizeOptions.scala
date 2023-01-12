package typings.oauth2Server.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeOptions extends StObject {
  
  /**
    * Allow clients to specify an empty state
    */
  var allowEmptyState: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The authenticate handler
    */
  var authenticateHandler: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Lifetime of generated authorization codes in seconds (default = 5 minutes).
    */
  var authorizationCodeLifetime: js.UndefOr[Double] = js.undefined
}
object AuthorizeOptions {
  
  inline def apply(): AuthorizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizeOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowEmptyState(value: Boolean): Self = StObject.set(x, "allowEmptyState", value.asInstanceOf[js.Any])
    
    inline def setAllowEmptyStateUndefined: Self = StObject.set(x, "allowEmptyState", js.undefined)
    
    inline def setAuthenticateHandler(value: js.Object): Self = StObject.set(x, "authenticateHandler", value.asInstanceOf[js.Any])
    
    inline def setAuthenticateHandlerUndefined: Self = StObject.set(x, "authenticateHandler", js.undefined)
    
    inline def setAuthorizationCodeLifetime(value: Double): Self = StObject.set(x, "authorizationCodeLifetime", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationCodeLifetimeUndefined: Self = StObject.set(x, "authorizationCodeLifetime", js.undefined)
  }
}
