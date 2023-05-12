package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content48 extends StObject {
  
  /**
    * List team repositories (Legacy)
    * @deprecated
    * @description **Deprecation Notice:** This endpoint route is deprecated and will be removed from the Teams API. We recommend migrating your existing code to use the new [List team repositories](https://docs.github.com/rest/reference/teams#list-team-repositories) endpoint.
    */
  var get: Responses200Content48
}
object GetResponses200Content48 {
  
  inline def apply(get: Responses200Content48): GetResponses200Content48 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content48]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content48] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content48): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
