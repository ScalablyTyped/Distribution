package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonError extends StObject {
  
  var parameters: `76`
  
  var responses: `200ContentApplicationjsonError`
}
object Responses200ContentApplicationjsonError {
  
  inline def apply(parameters: `76`, responses: `200ContentApplicationjsonError`): Responses200ContentApplicationjsonError = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonError]
  }
  
  extension [Self <: Responses200ContentApplicationjsonError](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonError`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
