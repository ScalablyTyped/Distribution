package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAutomerge extends StObject {
  
  var parameters: `141`
  
  var requestBody: ContentApplicationjsonAutomerge
  
  var responses: `202422`
}
object RequestBodyContentApplicationjsonAutomerge {
  
  inline def apply(parameters: `141`, requestBody: ContentApplicationjsonAutomerge, responses: `202422`): RequestBodyContentApplicationjsonAutomerge = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAutomerge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonAutomerge] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAutomerge): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
