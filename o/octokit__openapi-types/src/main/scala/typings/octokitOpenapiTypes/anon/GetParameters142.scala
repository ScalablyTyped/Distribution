package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters142 extends StObject {
  
  /**
    * List pending team invitations
    * @description The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the following values: `direct_member`, `admin`, `billing_manager`, `hiring_manager`, or `reinstate`. If the invitee is not a GitHub member, the `login` field in the return hash will be `null`.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/invitations`.
    */
  var get: Parameters142
}
object GetParameters142 {
  
  inline def apply(get: Parameters142): GetParameters142 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters142]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters142] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters142): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
