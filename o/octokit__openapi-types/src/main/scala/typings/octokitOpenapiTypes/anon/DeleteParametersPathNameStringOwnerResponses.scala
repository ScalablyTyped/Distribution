package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathNameStringOwnerResponses extends StObject {
  
  var delete: ParametersPathNameStringOwnerResponses
  
  var get: ParametersPathNameStringOwner
  
  var patch: Responses541
}
object DeleteParametersPathNameStringOwnerResponses {
  
  inline def apply(
    delete: ParametersPathNameStringOwnerResponses,
    get: ParametersPathNameStringOwner,
    patch: Responses541
  ): DeleteParametersPathNameStringOwnerResponses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathNameStringOwnerResponses]
  }
  
  extension [Self <: DeleteParametersPathNameStringOwnerResponses](x: Self) {
    
    inline def setDelete(value: ParametersPathNameStringOwnerResponses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathNameStringOwner): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses541): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
