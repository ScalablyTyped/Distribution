package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses345 extends StObject {
  
  /**
    * In order to remove a user's membership with an organization, the authenticated user must be an organization owner.
    *
    * If the specified user is an active member of the organization, this will remove them from the organization. If the specified user has been invited to the organization, this will cancel their invitation. The specified user will receive an email notification in both cases.
    */
  var delete: Responses345
  
  /** In order to get a user's membership with an organization, the authenticated user must be an organization member. The `state` parameter in the response can be used to identify the user's membership status. */
  var get: Responses200Content344
  
  /**
    * Only authenticated organization owners can add a member to the organization or update the member's role.
    *
    * *   If the authenticated user is _adding_ a member to the organization, the invited user will receive an email inviting them to the organization. The user's [membership status](https://docs.github.com/rest/reference/orgs#get-organization-membership-for-a-user) will be `pending` until they accept the invitation.
    *
    * *   Authenticated users can _update_ a user's membership by passing the `role` parameter. If the authenticated user changes a member's role to `admin`, the affected user will receive an email notifying them that they've been made an organization owner. If the authenticated user changes an owner's role to `member`, no email will be sent.
    *
    * **Rate limits**
    *
    * To prevent abuse, the authenticated user is limited to 50 organization invitations per 24 hour period. If the organization is more than one month old or on a paid plan, the limit is 500 invitations per 24 hour period.
    */
  var put: Responses200Content344403
}
object DeleteResponses345 {
  
  inline def apply(delete: Responses345, get: Responses200Content344, put: Responses200Content344403): DeleteResponses345 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses345]
  }
  
  extension [Self <: DeleteResponses345](x: Self) {
    
    inline def setDelete(value: Responses345): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content344): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses200Content344403): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
