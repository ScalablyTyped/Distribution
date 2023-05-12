package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathDiscussionnumberOrg extends StObject {
  
  /**
    * Delete team discussion reaction
    * @description **Note:** You can also specify a team or organization with `team_id` and `org_id` using the route `DELETE /organizations/:org_id/team/:team_id/discussions/:discussion_number/reactions/:reaction_id`.
    *
    * Delete a reaction to a [team discussion](https://docs.github.com/rest/reference/teams#discussions). OAuth access tokens require the `write:discussion` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).
    */
  var delete: ParametersPathDiscussionnumberOrg
}
object DeleteParametersPathDiscussionnumberOrg {
  
  inline def apply(delete: ParametersPathDiscussionnumberOrg): DeleteParametersPathDiscussionnumberOrg = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathDiscussionnumberOrg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathDiscussionnumberOrg] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathDiscussionnumberOrg): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
