package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson249 extends StObject {
  
  var parameters: Path246
  
  var requestBody: ContentApplicationjson249
}
object RequestBodyContentApplicationjson249 {
  
  inline def apply(parameters: Path246, requestBody: ContentApplicationjson249): RequestBodyContentApplicationjson249 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson249]
  }
  
  extension [Self <: RequestBodyContentApplicationjson249](x: Self) {
    
    inline def setParameters(value: Path246): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson249): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
