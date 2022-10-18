package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson414 extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjson414
}
object RequestBodyContentApplicationjson414 {
  
  inline def apply(parameters: `395`, requestBody: ContentApplicationjson414): RequestBodyContentApplicationjson414 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson414]
  }
  
  extension [Self <: RequestBodyContentApplicationjson414](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson414): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
