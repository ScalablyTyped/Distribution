package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath325Responses extends StObject {
  
  var delete: ParametersPath325Responses
  
  var get: ParametersPath325
  
  var put: Responses239
}
object DeleteParametersPath325Responses {
  
  inline def apply(delete: ParametersPath325Responses, get: ParametersPath325, put: Responses239): DeleteParametersPath325Responses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath325Responses]
  }
  
  extension [Self <: DeleteParametersPath325Responses](x: Self) {
    
    inline def setDelete(value: ParametersPath325Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath325): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Responses239): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
