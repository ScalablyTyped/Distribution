package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses361 extends StObject {
  
  /**
    * Lists a team's repositories visible to the authenticated user.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/repos`.
    */
  var get: Responses361
}
object GetResponses361 {
  
  inline def apply(get: Responses361): GetResponses361 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses361]
  }
  
  extension [Self <: GetResponses361](x: Self) {
    
    inline def setGet(value: Responses361): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
