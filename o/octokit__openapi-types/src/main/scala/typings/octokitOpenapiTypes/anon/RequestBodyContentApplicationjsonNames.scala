package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonNames extends StObject {
  
  var parameters: `76`
  
  var requestBody: ContentApplicationjsonNames
  
  var responses: `200ContentApplicationjsonNames404Content6`
}
object RequestBodyContentApplicationjsonNames {
  
  inline def apply(
    parameters: `76`,
    requestBody: ContentApplicationjsonNames,
    responses: `200ContentApplicationjsonNames404Content6`
  ): RequestBodyContentApplicationjsonNames = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonNames]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonNames](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNames): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonNames404Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
