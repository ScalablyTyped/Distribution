package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses349 extends StObject {
  
  var delete: Responses349
  
  var get: ParametersPath348
  
  var put: ParametersPath348Responses131
}
object DeleteResponses349 {
  
  inline def apply(delete: Responses349, get: ParametersPath348, put: ParametersPath348Responses131): DeleteResponses349 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses349]
  }
  
  extension [Self <: DeleteResponses349](x: Self) {
    
    inline def setDelete(value: Responses349): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath348): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPath348Responses131): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
