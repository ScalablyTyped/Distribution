package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonPattern extends StObject {
  
  var parameters: `165`
  
  var requestBody: ContentApplicationjsonPattern
  
  var responses: `201Content426`
}
object RequestBodyContentApplicationjsonPattern {
  
  inline def apply(parameters: `165`, requestBody: ContentApplicationjsonPattern, responses: `201Content426`): RequestBodyContentApplicationjsonPattern = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonPattern]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonPattern] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPattern): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content426`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
