package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters642RequestBodyContentApplicationjsonNameValue extends StObject {
  
  var parameters: `642`
  
  var requestBody: ContentApplicationjsonNameValue
  
  var responses: `506`
}
object Parameters642RequestBodyContentApplicationjsonNameValue {
  
  inline def apply(parameters: `642`, requestBody: ContentApplicationjsonNameValue, responses: `506`): Parameters642RequestBodyContentApplicationjsonNameValue = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters642RequestBodyContentApplicationjsonNameValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters642RequestBodyContentApplicationjsonNameValue] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `642`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNameValue): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `506`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
