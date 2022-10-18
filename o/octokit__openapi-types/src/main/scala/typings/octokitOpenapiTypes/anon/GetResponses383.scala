package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses383 extends StObject {
  
  /**
    * Lists the child teams of the team specified by `{team_slug}`.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/teams`.
    */
  var get: Responses383
}
object GetResponses383 {
  
  inline def apply(get: Responses383): GetResponses383 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses383]
  }
  
  extension [Self <: GetResponses383](x: Self) {
    
    inline def setGet(value: Responses383): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
