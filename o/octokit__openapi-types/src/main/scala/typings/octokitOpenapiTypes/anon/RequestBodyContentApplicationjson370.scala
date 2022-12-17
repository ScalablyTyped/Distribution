package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson370 extends StObject {
  
  var parameters: `57`
  
  var requestBody: ContentApplicationjson370
  
  var responses: `200Content86403`
}
object RequestBodyContentApplicationjson370 {
  
  inline def apply(parameters: `57`, requestBody: ContentApplicationjson370, responses: `200Content86403`): RequestBodyContentApplicationjson370 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson370]
  }
  
  extension [Self <: RequestBodyContentApplicationjson370](x: Self) {
    
    inline def setParameters(value: `57`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson370): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content86403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
