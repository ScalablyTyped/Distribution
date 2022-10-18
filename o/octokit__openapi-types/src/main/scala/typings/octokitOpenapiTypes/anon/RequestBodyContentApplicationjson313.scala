package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson313 extends StObject {
  
  var parameters: `303`
  
  var requestBody: ContentApplicationjson313
}
object RequestBodyContentApplicationjson313 {
  
  inline def apply(parameters: `303`, requestBody: ContentApplicationjson313): RequestBodyContentApplicationjson313 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson313]
  }
  
  extension [Self <: RequestBodyContentApplicationjson313](x: Self) {
    
    inline def setParameters(value: `303`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson313): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
