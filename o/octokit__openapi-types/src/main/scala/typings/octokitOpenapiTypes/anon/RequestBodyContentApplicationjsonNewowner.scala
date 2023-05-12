package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonNewowner extends StObject {
  
  var parameters: `141`
  
  var requestBody: ContentApplicationjsonNewowner
  
  var responses: `202Content363`
}
object RequestBodyContentApplicationjsonNewowner {
  
  inline def apply(parameters: `141`, requestBody: ContentApplicationjsonNewowner, responses: `202Content363`): RequestBodyContentApplicationjsonNewowner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonNewowner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonNewowner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNewowner): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202Content363`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
