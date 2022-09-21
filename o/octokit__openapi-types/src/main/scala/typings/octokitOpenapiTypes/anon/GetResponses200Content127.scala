package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content127 extends StObject {
  
  /**
    * Lists the organization projects for a team.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/projects`.
    */
  var get: Responses200Content127
}
object GetResponses200Content127 {
  
  inline def apply(get: Responses200Content127): GetResponses200Content127 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content127]
  }
  
  extension [Self <: GetResponses200Content127](x: Self) {
    
    inline def setGet(value: Responses200Content127): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
