package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonNewowner extends StObject {
  
  var parameters: `165`
  
  var requestBody: ContentApplicationjsonNewowner
  
  var responses: `202Content434`
}
object RequestBodyContentApplicationjsonNewowner {
  
  inline def apply(parameters: `165`, requestBody: ContentApplicationjsonNewowner, responses: `202Content434`): RequestBodyContentApplicationjsonNewowner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonNewowner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonNewowner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNewowner): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202Content434`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
