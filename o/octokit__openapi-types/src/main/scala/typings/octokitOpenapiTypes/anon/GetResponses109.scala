package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses109 extends StObject {
  
  /**
    * Lists a team's repositories visible to the authenticated user.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/repos`.
    */
  var get: Responses109
}
object GetResponses109 {
  
  inline def apply(get: Responses109): GetResponses109 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses109]
  }
  
  extension [Self <: GetResponses109](x: Self) {
    
    inline def setGet(value: Responses109): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
