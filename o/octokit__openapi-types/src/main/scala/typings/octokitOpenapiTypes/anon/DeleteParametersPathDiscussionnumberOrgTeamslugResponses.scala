package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathDiscussionnumberOrgTeamslugResponses extends StObject {
  
  /**
    * Delete a discussion from a team's page. OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `DELETE /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}`.
    */
  var delete: ParametersPathDiscussionnumberOrgTeamslugResponses
  
  /**
    * Get a specific discussion on a team's page. OAuth access tokens require the `read:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}`.
    */
  var get: ParametersPathDiscussionnumberOrgTeamslug
  
  /**
    * Edits the title and body text of a discussion post. Only the parameters you provide are updated. OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `PATCH /organizations/{org_id}/team/{team_id}/discussions/{discussion_number}`.
    */
  var patch: Responses200Content370
}
object DeleteParametersPathDiscussionnumberOrgTeamslugResponses {
  
  inline def apply(
    delete: ParametersPathDiscussionnumberOrgTeamslugResponses,
    get: ParametersPathDiscussionnumberOrgTeamslug,
    patch: Responses200Content370
  ): DeleteParametersPathDiscussionnumberOrgTeamslugResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathDiscussionnumberOrgTeamslugResponses]
  }
  
  extension [Self <: DeleteParametersPathDiscussionnumberOrgTeamslugResponses](x: Self) {
    
    inline def setDelete(value: ParametersPathDiscussionnumberOrgTeamslugResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathDiscussionnumberOrgTeamslug): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content370): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
