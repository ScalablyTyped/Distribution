package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content27 extends StObject {
  
  /**
    * Lists the license consumption information for all users, including those from connected servers, associated with an enterprise.
    * To use this endpoint, you must be an enterprise admin, and you must use an access
    * token with the `read:enterprise` scope.
    *
    * **Note:** The license consumption API endpoints for enterprise accounts are currently
    * in Beta and are subject to change.
    */
  var get: Responses200Content27
}
object GetResponses200Content27 {
  
  inline def apply(get: Responses200Content27): GetResponses200Content27 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content27]
  }
  
  extension [Self <: GetResponses200Content27](x: Self) {
    
    inline def setGet(value: Responses200Content27): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
