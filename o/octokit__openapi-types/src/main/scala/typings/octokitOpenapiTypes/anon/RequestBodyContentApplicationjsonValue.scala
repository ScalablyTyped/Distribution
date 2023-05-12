package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonValue extends StObject {
  
  var parameters: `47`
  
  var requestBody: ContentApplicationjsonValue
  
  var responses: `201Content55`
}
object RequestBodyContentApplicationjsonValue {
  
  inline def apply(parameters: `47`, requestBody: ContentApplicationjsonValue, responses: `201Content55`): RequestBodyContentApplicationjsonValue = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonValue] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `47`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonValue): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
