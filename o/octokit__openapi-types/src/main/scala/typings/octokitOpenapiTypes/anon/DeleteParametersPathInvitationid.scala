package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathInvitationid extends StObject {
  
  /**
    * Cancel an organization invitation. In order to cancel an organization invitation, the authenticated user must be an organization owner.
    *
    * This endpoint triggers [notifications](https://docs.github.com/en/github/managing-subscriptions-and-notifications-on-github/about-notifications).
    */
  var delete: ParametersPathInvitationid
}
object DeleteParametersPathInvitationid {
  
  inline def apply(delete: ParametersPathInvitationid): DeleteParametersPathInvitationid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathInvitationid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathInvitationid] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathInvitationid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
