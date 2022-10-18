package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathInvitationidOrg extends StObject {
  
  /**
    * Cancel an organization invitation. In order to cancel an organization invitation, the authenticated user must be an organization owner.
    *
    * This endpoint triggers [notifications](https://docs.github.com/en/github/managing-subscriptions-and-notifications-on-github/about-notifications).
    */
  var delete: ParametersPathInvitationidOrg
}
object DeleteParametersPathInvitationidOrg {
  
  inline def apply(delete: ParametersPathInvitationidOrg): DeleteParametersPathInvitationidOrg = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathInvitationidOrg]
  }
  
  extension [Self <: DeleteParametersPathInvitationidOrg](x: Self) {
    
    inline def setDelete(value: ParametersPathInvitationidOrg): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
