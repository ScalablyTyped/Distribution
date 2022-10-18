package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathProjectidTeamslugResponses extends StObject {
  
  /**
    * Removes an organization project from a team. An organization owner or a team maintainer can remove any project from the team. To remove a project from a team as an organization member, the authenticated user must have `read` access to both the team and project, or `admin` access to the team or project. This endpoint removes the project from the team, but does not delete the project.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `DELETE /organizations/{org_id}/team/{team_id}/projects/{project_id}`.
    */
  var delete: ParametersPathProjectidTeamslugResponses
  
  /**
    * Checks whether a team has `read`, `write`, or `admin` permissions for an organization project. The response includes projects inherited from a parent team.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/projects/{project_id}`.
    */
  var get: ParametersPathProjectidTeamslug
  
  /**
    * Adds an organization project to a team. To add a project to a team or update the team's permission on a project, the authenticated user must have `admin` permissions for the project. The project and team must be part of the same organization.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `PUT /organizations/{org_id}/team/{team_id}/projects/{project_id}`.
    */
  var put: Responses403ContentApplicationjsonDocumentationurlMessage
}
object DeleteParametersPathProjectidTeamslugResponses {
  
  inline def apply(
    delete: ParametersPathProjectidTeamslugResponses,
    get: ParametersPathProjectidTeamslug,
    put: Responses403ContentApplicationjsonDocumentationurlMessage
  ): DeleteParametersPathProjectidTeamslugResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathProjectidTeamslugResponses]
  }
  
  extension [Self <: DeleteParametersPathProjectidTeamslugResponses](x: Self) {
    
    inline def setDelete(value: ParametersPathProjectidTeamslugResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathProjectidTeamslug): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses403ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
