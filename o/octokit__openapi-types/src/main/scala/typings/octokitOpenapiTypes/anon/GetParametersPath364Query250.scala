package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath364Query250 extends StObject {
  
  /**
    * The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the following values: `direct_member`, `admin`, `billing_manager`, `hiring_manager`, or `reinstate`. If the invitee is not a GitHub member, the `login` field in the return hash will be `null`.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/invitations`.
    */
  var get: ParametersPath364Query250
}
object GetParametersPath364Query250 {
  
  inline def apply(get: ParametersPath364Query250): GetParametersPath364Query250 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath364Query250]
  }
  
  extension [Self <: GetParametersPath364Query250](x: Self) {
    
    inline def setGet(value: ParametersPath364Query250): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
