package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content349 extends StObject {
  
  /** **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [List team repositories](https://docs.github.com/rest/reference/teams#list-team-repositories) endpoint. */
  var get: Responses200Content349
}
object GetResponses200Content349 {
  
  inline def apply(get: Responses200Content349): GetResponses200Content349 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content349]
  }
  
  extension [Self <: GetResponses200Content349](x: Self) {
    
    inline def setGet(value: Responses200Content349): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
