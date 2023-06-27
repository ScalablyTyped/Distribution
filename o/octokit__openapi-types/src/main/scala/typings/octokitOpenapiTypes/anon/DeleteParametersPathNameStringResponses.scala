package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathNameStringResponses extends StObject {
  
  /**
    * Delete a label
    * @description Deletes a label using the given label name.
    */
  var delete: ParametersPathNameStringResponses
  
  /**
    * Get a label
    * @description Gets a label using the given name.
    */
  var get: ParametersPathNameString
  
  /**
    * Update a label
    * @description Updates a label using the given label name.
    */
  var patch: Responses344
}
object DeleteParametersPathNameStringResponses {
  
  inline def apply(delete: ParametersPathNameStringResponses, get: ParametersPathNameString, patch: Responses344): DeleteParametersPathNameStringResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathNameStringResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathNameStringResponses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathNameStringResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathNameString): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses344): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
