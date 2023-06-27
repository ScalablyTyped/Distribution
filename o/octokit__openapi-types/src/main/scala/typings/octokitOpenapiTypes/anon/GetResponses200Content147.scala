package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content147 extends StObject {
  
  /**
    * List team projects
    * @description Lists the organization projects for a team.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/projects`.
    */
  var get: Responses200Content147
}
object GetResponses200Content147 {
  
  inline def apply(get: Responses200Content147): GetResponses200Content147 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content147]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content147] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content147): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
