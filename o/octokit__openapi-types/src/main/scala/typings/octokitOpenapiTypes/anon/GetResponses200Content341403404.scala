package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content341403404 extends StObject {
  
  /** **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [`List child teams`](https://docs.github.com/rest/reference/teams#list-child-teams) endpoint. */
  var get: Responses200Content341403404
}
object GetResponses200Content341403404 {
  
  inline def apply(get: Responses200Content341403404): GetResponses200Content341403404 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content341403404]
  }
  
  extension [Self <: GetResponses200Content341403404](x: Self) {
    
    inline def setGet(value: Responses200Content341403404): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
