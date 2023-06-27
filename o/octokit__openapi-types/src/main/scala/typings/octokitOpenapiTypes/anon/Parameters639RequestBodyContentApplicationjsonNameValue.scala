package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters639RequestBodyContentApplicationjsonNameValue extends StObject {
  
  var parameters: `639`
  
  var requestBody: ContentApplicationjsonNameValue
  
  var responses: `590`
}
object Parameters639RequestBodyContentApplicationjsonNameValue {
  
  inline def apply(parameters: `639`, requestBody: ContentApplicationjsonNameValue, responses: `590`): Parameters639RequestBodyContentApplicationjsonNameValue = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters639RequestBodyContentApplicationjsonNameValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters639RequestBodyContentApplicationjsonNameValue] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNameValue): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `590`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
