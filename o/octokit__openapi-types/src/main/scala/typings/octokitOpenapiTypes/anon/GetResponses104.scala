package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses104 extends StObject {
  
  /**
    * List team repositories
    * @description Lists a team's repositories visible to the authenticated user.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/repos`.
    */
  var get: Responses104
}
object GetResponses104 {
  
  inline def apply(get: Responses104): GetResponses104 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses104]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses104] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses104): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
