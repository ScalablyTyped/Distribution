package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathProjectidTeamidResponses75 extends StObject {
  
  /**
    * Remove a project from a team (Legacy)
    * @deprecated
    * @description **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Remove a project from a team](https://docs.github.com/rest/reference/teams#remove-a-project-from-a-team) endpoint.
    *
    * Removes an organization project from a team. An organization owner or a team maintainer can remove any project from the team. To remove a project from a team as an organization member, the authenticated user must have `read` access to both the team and project, or `admin` access to the team or project. **Note:** This endpoint removes the project from the team, but does not delete it.
    */
  var delete: ParametersPathProjectidTeamidResponses75
  
  /**
    * Check team permissions for a project (Legacy)
    * @deprecated
    * @description **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Check team permissions for a project](https://docs.github.com/rest/reference/teams#check-team-permissions-for-a-project) endpoint.
    *
    * Checks whether a team has `read`, `write`, or `admin` permissions for an organization project. The response includes projects inherited from a parent team.
    */
  var get: ParametersPathProjectidTeamid
  
  /**
    * Add or update team project permissions (Legacy)
    * @deprecated
    * @description **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Add or update team project permissions](https://docs.github.com/rest/reference/teams#add-or-update-team-project-permissions) endpoint.
    *
    * Adds an organization project to a team. To add a project to a team or update the team's permission on a project, the authenticated user must have `admin` permissions for the project. The project and team must be part of the same organization.
    */
  var put: Responses403ContentApplicationjsonDocumentationurl404
}
object DeleteParametersPathProjectidTeamidResponses75 {
  
  inline def apply(
    delete: ParametersPathProjectidTeamidResponses75,
    get: ParametersPathProjectidTeamid,
    put: Responses403ContentApplicationjsonDocumentationurl404
  ): DeleteParametersPathProjectidTeamidResponses75 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathProjectidTeamidResponses75]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathProjectidTeamidResponses75] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathProjectidTeamidResponses75): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathProjectidTeamid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses403ContentApplicationjsonDocumentationurl404): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
