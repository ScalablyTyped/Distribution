package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content28 extends StObject {
  
  /**
    * Gets information about the status of a license sync job for an enterprise.
    * To use this endpoint, you must be an enterprise admin, and you must use an access
    * token with the `read:enterprise` scope.
    */
  var get: Responses200Content28
}
object GetResponses200Content28 {
  
  inline def apply(get: Responses200Content28): GetResponses200Content28 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content28]
  }
  
  extension [Self <: GetResponses200Content28](x: Self) {
    
    inline def setGet(value: Responses200Content28): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
