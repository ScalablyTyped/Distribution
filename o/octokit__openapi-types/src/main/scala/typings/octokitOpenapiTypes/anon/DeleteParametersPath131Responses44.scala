package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath131Responses44 extends StObject {
  
  /** Delete a project column */
  var delete: ParametersPath131Responses44
  
  /** Get a project column */
  var get: ParametersPath131
  
  /** Update an existing project column */
  var patch: RequestBodyContentApplicationjsonName
}
object DeleteParametersPath131Responses44 {
  
  inline def apply(
    delete: ParametersPath131Responses44,
    get: ParametersPath131,
    patch: RequestBodyContentApplicationjsonName
  ): DeleteParametersPath131Responses44 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath131Responses44]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPath131Responses44] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPath131Responses44): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath131): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonName): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
