package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content124404 extends StObject {
  
  /**
    * List team projects (Legacy)
    * @deprecated
    * @description **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List team projects`](https://docs.github.com/rest/reference/teams#list-team-projects) endpoint.
    *
    * Lists the organization projects for a team.
    */
  var get: Responses200Content124404
}
object GetResponses200Content124404 {
  
  inline def apply(get: Responses200Content124404): GetResponses200Content124404 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content124404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content124404] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content124404): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
