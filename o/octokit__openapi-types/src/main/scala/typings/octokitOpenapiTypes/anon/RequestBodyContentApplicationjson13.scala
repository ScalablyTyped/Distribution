package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson13 extends StObject {
  
  var parameters: PathEnterprise
  
  var requestBody: ContentApplicationjson13
}
object RequestBodyContentApplicationjson13 {
  
  inline def apply(parameters: PathEnterprise, requestBody: ContentApplicationjson13): RequestBodyContentApplicationjson13 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson13]
  }
  
  extension [Self <: RequestBodyContentApplicationjson13](x: Self) {
    
    inline def setParameters(value: PathEnterprise): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson13): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
