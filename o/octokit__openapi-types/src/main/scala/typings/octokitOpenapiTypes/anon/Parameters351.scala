package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters351 extends StObject {
  
  var parameters: `351`
  
  var requestBody: ContentApplicationjsonDisplayName
  
  var responses: `200Content350`
}
object Parameters351 {
  
  inline def apply(parameters: `351`, requestBody: ContentApplicationjsonDisplayName, responses: `200Content350`): Parameters351 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters351]
  }
  
  extension [Self <: Parameters351](x: Self) {
    
    inline def setParameters(value: `351`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDisplayName): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content350`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
