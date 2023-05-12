package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content124 extends StObject {
  
  /**
    * List team projects
    * @description Lists the organization projects for a team.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/projects`.
    */
  var get: Responses200Content124
}
object GetResponses200Content124 {
  
  inline def apply(get: Responses200Content124): GetResponses200Content124 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content124]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content124] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content124): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
