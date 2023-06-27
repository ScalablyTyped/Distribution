package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters437RequestBodyContentApplicationjsonNameValue extends StObject {
  
  var parameters: `437`
  
  var requestBody: ContentApplicationjsonNameValue
  
  var responses: `201Content63`
}
object Parameters437RequestBodyContentApplicationjsonNameValue {
  
  inline def apply(parameters: `437`, requestBody: ContentApplicationjsonNameValue, responses: `201Content63`): Parameters437RequestBodyContentApplicationjsonNameValue = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters437RequestBodyContentApplicationjsonNameValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters437RequestBodyContentApplicationjsonNameValue] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `437`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNameValue): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content63`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
