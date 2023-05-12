package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters540RequestBodyContentApplicationjsonNameValue extends StObject {
  
  var parameters: `540`
  
  var requestBody: ContentApplicationjsonNameValue
  
  var responses: `506`
}
object Parameters540RequestBodyContentApplicationjsonNameValue {
  
  inline def apply(parameters: `540`, requestBody: ContentApplicationjsonNameValue, responses: `506`): Parameters540RequestBodyContentApplicationjsonNameValue = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters540RequestBodyContentApplicationjsonNameValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters540RequestBodyContentApplicationjsonNameValue] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNameValue): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `506`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
