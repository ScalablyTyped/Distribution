package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses304401403404410 extends StObject {
  
  /** Deletes a project board. Returns a `404 Not Found` status if projects are disabled. */
  var delete: Responses304401403404410
  
  /** Gets a project by its `id`. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned. */
  var get: ParametersPath389
  
  /** Updates a project board's information. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned. */
  var patch: Responses401403404410422
}
object DeleteResponses304401403404410 {
  
  inline def apply(delete: Responses304401403404410, get: ParametersPath389, patch: Responses401403404410422): DeleteResponses304401403404410 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses304401403404410]
  }
  
  extension [Self <: DeleteResponses304401403404410](x: Self) {
    
    inline def setDelete(value: Responses304401403404410): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath389): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses401403404410422): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
