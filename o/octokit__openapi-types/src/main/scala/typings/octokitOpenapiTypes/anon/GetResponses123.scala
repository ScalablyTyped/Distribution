package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses123 extends StObject {
  
  /**
    * List team repositories
    * @description Lists a team's repositories visible to the authenticated user.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/repos`.
    */
  var get: Responses123
}
object GetResponses123 {
  
  inline def apply(get: Responses123): GetResponses123 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses123]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses123] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses123): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
