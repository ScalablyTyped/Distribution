package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonPatternString extends StObject {
  
  var parameters: `76`
  
  var requestBody: ContentApplicationjsonPatternString
  
  var responses: `201ContentApplicationjsonPattern`
}
object RequestBodyContentApplicationjsonPatternString {
  
  inline def apply(
    parameters: `76`,
    requestBody: ContentApplicationjsonPatternString,
    responses: `201ContentApplicationjsonPattern`
  ): RequestBodyContentApplicationjsonPatternString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonPatternString]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonPatternString](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPatternString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonPattern`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
