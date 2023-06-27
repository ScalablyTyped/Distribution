package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters582RequestBodyContentApplicationjsonValue extends StObject {
  
  var parameters: `582`
  
  var requestBody: ContentApplicationjsonValue
  
  var responses: `590`
}
object Parameters582RequestBodyContentApplicationjsonValue {
  
  inline def apply(parameters: `582`, requestBody: ContentApplicationjsonValue, responses: `590`): Parameters582RequestBodyContentApplicationjsonValue = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters582RequestBodyContentApplicationjsonValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters582RequestBodyContentApplicationjsonValue] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `582`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonValue): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `590`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
