package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathTeamslugQueryPage extends StObject {
  
  /**
    * List pending team invitations
    * @description The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the following values: `direct_member`, `admin`, `billing_manager`, `hiring_manager`, or `reinstate`. If the invitee is not a GitHub member, the `login` field in the return hash will be `null`.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/invitations`.
    */
  var get: ParametersPathTeamslugQueryPage
}
object GetParametersPathTeamslugQueryPage {
  
  inline def apply(get: ParametersPathTeamslugQueryPage): GetParametersPathTeamslugQueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathTeamslugQueryPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathTeamslugQueryPage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathTeamslugQueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
