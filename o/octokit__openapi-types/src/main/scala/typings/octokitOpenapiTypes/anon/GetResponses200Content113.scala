package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content113 extends StObject {
  
  /**
    * Delete a team
    * @description To delete a team, the authenticated user must be an organization owner or team maintainer.
    *
    * If you are an organization owner, deleting a parent team will delete all of its child teams as well.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `DELETE /organizations/{org_id}/team/{team_id}`.
    */
  var delete: ParametersPathTeamslug
  
  /**
    * Get a team by name
    * @description Gets a team using the team's `slug`. To create the `slug`, GitHub replaces special characters in the `name` string, changes all words to lowercase, and replaces spaces with a `-` separator. For example, `"My TEam Näme"` would become `my-team-name`.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}`.
    */
  var get: Responses200Content113
  
  /**
    * Update a team
    * @description To edit a team, the authenticated user must either be an organization owner or a team maintainer.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `PATCH /organizations/{org_id}/team/{team_id}`.
    */
  var patch: Responses200201
}
object GetResponses200Content113 {
  
  inline def apply(delete: ParametersPathTeamslug, get: Responses200Content113, patch: Responses200201): GetResponses200Content113 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content113]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content113] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathTeamslug): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Responses200Content113): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200201): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
