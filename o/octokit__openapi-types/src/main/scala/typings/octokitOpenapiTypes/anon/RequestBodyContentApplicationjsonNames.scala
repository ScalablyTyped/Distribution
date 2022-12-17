package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonNames extends StObject {
  
  var parameters: `135`
  
  var requestBody: ContentApplicationjsonNames
  
  var responses: `200Content336404`
}
object RequestBodyContentApplicationjsonNames {
  
  inline def apply(parameters: `135`, requestBody: ContentApplicationjsonNames, responses: `200Content336404`): RequestBodyContentApplicationjsonNames = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonNames]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonNames](x: Self) {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNames): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content336404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
