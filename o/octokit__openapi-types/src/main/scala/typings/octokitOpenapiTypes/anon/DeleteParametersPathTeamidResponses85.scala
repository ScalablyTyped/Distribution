package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathTeamidResponses85 extends StObject {
  
  /**
    * Delete a team (Legacy)
    * @deprecated
    * @description **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Delete a team](https://docs.github.com/rest/reference/teams#delete-a-team) endpoint.
    *
    * To delete a team, the authenticated user must be an organization owner or team maintainer.
    *
    * If you are an organization owner, deleting a parent team will delete all of its child teams as well.
    */
  var delete: ParametersPathTeamidResponses85
  
  /**
    * Get a team (Legacy)
    * @deprecated
    * @description **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the [Get a team by name](https://docs.github.com/rest/reference/teams#get-a-team-by-name) endpoint.
    */
  var get: ParametersPathTeamid
  
  /**
    * Update a team (Legacy)
    * @deprecated
    * @description **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [Update a team](https://docs.github.com/rest/reference/teams#update-a-team) endpoint.
    *
    * To edit a team, the authenticated user must either be an organization owner or a team maintainer.
    *
    * **Note:** With nested teams, the `privacy` for parent teams cannot be `secret`.
    */
  var patch: RequestBodyContentApplicationjsonParentteamid
}
object DeleteParametersPathTeamidResponses85 {
  
  inline def apply(
    delete: ParametersPathTeamidResponses85,
    get: ParametersPathTeamid,
    patch: RequestBodyContentApplicationjsonParentteamid
  ): DeleteParametersPathTeamidResponses85 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathTeamidResponses85]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathTeamidResponses85] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathTeamidResponses85): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathTeamid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonParentteamid): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
