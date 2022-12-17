package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson285 extends StObject {
  
  var parameters: `135`
  
  var requestBody: ContentApplicationjson285
  
  var responses: `202205`
}
object RequestBodyContentApplicationjson285 {
  
  inline def apply(parameters: `135`, requestBody: ContentApplicationjson285, responses: `202205`): RequestBodyContentApplicationjson285 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson285]
  }
  
  extension [Self <: RequestBodyContentApplicationjson285](x: Self) {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson285): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202205`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
