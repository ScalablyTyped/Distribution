package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters395RequestBodyContentApplicationjsonBodyNameString extends StObject {
  
  var parameters: `395`
  
  var requestBody: ContentApplicationjsonBodyNameString
  
  var responses: `201401403`
}
object Parameters395RequestBodyContentApplicationjsonBodyNameString {
  
  inline def apply(parameters: `395`, requestBody: ContentApplicationjsonBodyNameString, responses: `201401403`): Parameters395RequestBodyContentApplicationjsonBodyNameString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters395RequestBodyContentApplicationjsonBodyNameString]
  }
  
  extension [Self <: Parameters395RequestBodyContentApplicationjsonBodyNameString](x: Self) {
    
    inline def setParameters(value: `395`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyNameString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201401403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
