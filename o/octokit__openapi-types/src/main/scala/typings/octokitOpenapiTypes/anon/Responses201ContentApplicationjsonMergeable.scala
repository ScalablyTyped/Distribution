package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonMergeable extends StObject {
  
  var parameters: `472`
  
  var requestBody: ContentApplicationjsonDraft
  
  var responses: `201ContentApplicationjsonMergeable`
}
object Responses201ContentApplicationjsonMergeable {
  
  inline def apply(
    parameters: `472`,
    requestBody: ContentApplicationjsonDraft,
    responses: `201ContentApplicationjsonMergeable`
  ): Responses201ContentApplicationjsonMergeable = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonMergeable]
  }
  
  extension [Self <: Responses201ContentApplicationjsonMergeable](x: Self) {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDraft): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonMergeable`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
