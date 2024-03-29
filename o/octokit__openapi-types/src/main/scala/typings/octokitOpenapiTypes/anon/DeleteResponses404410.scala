package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses404410 extends StObject {
  
  /**
    * Delete a project
    * @description Deletes a project board. Returns a `404 Not Found` status if projects are disabled.
    */
  var delete: Responses404410
  
  /**
    * Get a project
    * @description Gets a project by its `id`. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  var get: ParametersPath157
  
  /**
    * Update a project
    * @description Updates a project board's information. Returns a `404 Not Found` status if projects are disabled. If you do not have sufficient privileges to perform this action, a `401 Unauthorized` or `410 Gone` status is returned.
    */
  var patch: Responses403410
}
object DeleteResponses404410 {
  
  inline def apply(delete: Responses404410, get: ParametersPath157, patch: Responses403410): DeleteResponses404410 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses404410]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResponses404410] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses404410): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath157): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses403410): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
