package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonAddedby extends StObject {
  
  var parameters: `472`
  
  var requestBody: ContentApplicationjsonReadonly
  
  var responses: `201ContentApplicationjsonAddedby`
}
object Responses201ContentApplicationjsonAddedby {
  
  inline def apply(
    parameters: `472`,
    requestBody: ContentApplicationjsonReadonly,
    responses: `201ContentApplicationjsonAddedby`
  ): Responses201ContentApplicationjsonAddedby = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonAddedby]
  }
  
  extension [Self <: Responses201ContentApplicationjsonAddedby](x: Self) {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonReadonly): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonAddedby`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
