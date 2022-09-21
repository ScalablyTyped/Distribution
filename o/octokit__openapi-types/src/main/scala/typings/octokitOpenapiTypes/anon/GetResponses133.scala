package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses133 extends StObject {
  
  /**
    * Lists the child teams of the team specified by `{team_slug}`.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/teams`.
    */
  var get: Responses133
}
object GetResponses133 {
  
  inline def apply(get: Responses133): GetResponses133 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses133]
  }
  
  extension [Self <: GetResponses133](x: Self) {
    
    inline def setGet(value: Responses133): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
