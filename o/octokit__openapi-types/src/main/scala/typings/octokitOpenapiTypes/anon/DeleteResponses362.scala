package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses362 extends StObject {
  
  var delete: Responses362
  
  var get: ParametersPath361
  
  var put: ParametersPath361Responses140
}
object DeleteResponses362 {
  
  inline def apply(delete: Responses362, get: ParametersPath361, put: ParametersPath361Responses140): DeleteResponses362 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses362]
  }
  
  extension [Self <: DeleteResponses362](x: Self) {
    
    inline def setDelete(value: Responses362): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath361): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPath361Responses140): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
