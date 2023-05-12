package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters496RequestBodyContentApplicationjsonValue extends StObject {
  
  var parameters: `496`
  
  var requestBody: ContentApplicationjsonValue
  
  var responses: `506`
}
object Parameters496RequestBodyContentApplicationjsonValue {
  
  inline def apply(parameters: `496`, requestBody: ContentApplicationjsonValue, responses: `506`): Parameters496RequestBodyContentApplicationjsonValue = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters496RequestBodyContentApplicationjsonValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters496RequestBodyContentApplicationjsonValue] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `496`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonValue): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `506`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
