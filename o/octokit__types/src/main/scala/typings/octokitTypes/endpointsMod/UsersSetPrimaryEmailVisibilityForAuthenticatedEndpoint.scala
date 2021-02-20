package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint extends StObject {
  
  /**
    * Specify the _primary_ email address that needs a visibility change.
    */
  var email: String = js.native
  
  /**
    * Use `public` to enable an authenticated user to view the specified email address, or use `private` so this primary email address cannot be seen publicly.
    */
  var visibility: String = js.native
}
object UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint {
  
  @scala.inline
  def apply(email: String, visibility: String): UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint]
  }
  
  @scala.inline
  implicit class UsersSetPrimaryEmailVisibilityForAuthenticatedEndpointMutableBuilder[Self <: UsersSetPrimaryEmailVisibilityForAuthenticatedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
