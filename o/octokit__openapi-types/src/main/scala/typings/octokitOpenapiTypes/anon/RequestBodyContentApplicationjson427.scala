package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson427 extends StObject {
  
  var parameters: PathEnterpriseString
  
  var requestBody: ContentApplicationjson427
}
object RequestBodyContentApplicationjson427 {
  
  inline def apply(parameters: PathEnterpriseString, requestBody: ContentApplicationjson427): RequestBodyContentApplicationjson427 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson427]
  }
  
  extension [Self <: RequestBodyContentApplicationjson427](x: Self) {
    
    inline def setParameters(value: PathEnterpriseString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson427): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
