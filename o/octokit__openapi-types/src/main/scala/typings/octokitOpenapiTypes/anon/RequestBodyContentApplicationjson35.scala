package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson35 extends StObject {
  
  var parameters: PathThreadid
  
  var requestBody: ContentApplicationjson35
  
  var responses: `200304401403`
}
object RequestBodyContentApplicationjson35 {
  
  inline def apply(parameters: PathThreadid, requestBody: ContentApplicationjson35, responses: `200304401403`): RequestBodyContentApplicationjson35 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson35]
  }
  
  extension [Self <: RequestBodyContentApplicationjson35](x: Self) {
    
    inline def setParameters(value: PathThreadid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson35): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304401403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
