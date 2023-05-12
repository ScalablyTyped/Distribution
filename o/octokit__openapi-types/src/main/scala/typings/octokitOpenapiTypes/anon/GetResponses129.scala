package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses129 extends StObject {
  
  /**
    * List child teams
    * @description Lists the child teams of the team specified by `{team_slug}`.
    *
    * **Note:** You can also specify a team by `org_id` and `team_id` using the route `GET /organizations/{org_id}/team/{team_id}/teams`.
    */
  var get: Responses129
}
object GetResponses129 {
  
  inline def apply(get: Responses129): GetResponses129 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses129]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses129] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses129): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
