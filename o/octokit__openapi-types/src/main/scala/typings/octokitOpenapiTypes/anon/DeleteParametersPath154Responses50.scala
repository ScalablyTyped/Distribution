package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath154Responses50 extends StObject {
  
  /**
    * Delete a project column
    * @description Deletes a project column.
    */
  var delete: ParametersPath154Responses50
  
  /**
    * Get a project column
    * @description Gets information about a project column.
    */
  var get: ParametersPath154
  
  /** Update an existing project column */
  var patch: RequestBodyContentApplicationjsonName
}
object DeleteParametersPath154Responses50 {
  
  inline def apply(
    delete: ParametersPath154Responses50,
    get: ParametersPath154,
    patch: RequestBodyContentApplicationjsonName
  ): DeleteParametersPath154Responses50 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath154Responses50]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPath154Responses50] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPath154Responses50): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath154): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonName): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
