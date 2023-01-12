package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses101 extends StObject {
  
  /**
    * Lists a team's repositories visible to the authenticated user.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/repos`.
    */
  var get: Responses101
}
object GetResponses101 {
  
  inline def apply(get: Responses101): GetResponses101 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses101]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses101] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses101): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
