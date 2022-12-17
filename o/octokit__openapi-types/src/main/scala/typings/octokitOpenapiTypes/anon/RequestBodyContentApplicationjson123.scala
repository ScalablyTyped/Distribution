package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson123 extends StObject {
  
  var parameters: PathRepo
  
  var requestBody: ContentApplicationjson123
}
object RequestBodyContentApplicationjson123 {
  
  inline def apply(parameters: PathRepo, requestBody: ContentApplicationjson123): RequestBodyContentApplicationjson123 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson123]
  }
  
  extension [Self <: RequestBodyContentApplicationjson123](x: Self) {
    
    inline def setParameters(value: PathRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson123): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
