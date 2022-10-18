package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses616 extends StObject {
  
  var delete: Responses616
  
  var get: ParametersPath615
  
  var put: ParametersPath615Responses391
}
object DeleteResponses616 {
  
  inline def apply(delete: Responses616, get: ParametersPath615, put: ParametersPath615Responses391): DeleteResponses616 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses616]
  }
  
  extension [Self <: DeleteResponses616](x: Self) {
    
    inline def setDelete(value: Responses616): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath615): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPath615Responses391): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
