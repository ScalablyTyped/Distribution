package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content107 extends StObject {
  
  /**
    * To delete a team, the authenticated user must be an organization owner or team maintainer.
    *
    * If you are an organization owner, deleting a parent team will delete all of its child teams as well.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `DELETE /organizations/{org_id}/team/{team_id}`.
    */
  var delete: ParametersPathTeamslugResponses
  
  /**
    * Gets a team using the team's `slug`. GitHub generates the `slug` from the team `name`.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}`.
    */
  var get: Responses200Content107
  
  /**
    * To edit a team, the authenticated user must either be an organization owner or a team maintainer.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `PATCH /organizations/{org_id}/team/{team_id}`.
    */
  var patch: RequestBodyContentApplicationjsonParentteamid
}
object GetResponses200Content107 {
  
  inline def apply(
    delete: ParametersPathTeamslugResponses,
    get: Responses200Content107,
    patch: RequestBodyContentApplicationjsonParentteamid
  ): GetResponses200Content107 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content107]
  }
  
  extension [Self <: GetResponses200Content107](x: Self) {
    
    inline def setDelete(value: ParametersPathTeamslugResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content107): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonParentteamid): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
