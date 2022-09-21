package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonNameString extends StObject {
  
  var parameters: Path135
  
  var requestBody: ContentApplicationjsonNameString
  
  var responses: `200Content136`
}
object RequestBodyContentApplicationjsonNameString {
  
  inline def apply(parameters: Path135, requestBody: ContentApplicationjsonNameString, responses: `200Content136`): RequestBodyContentApplicationjsonNameString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonNameString]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonNameString](x: Self) {
    
    inline def setParameters(value: Path135): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNameString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content136`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
