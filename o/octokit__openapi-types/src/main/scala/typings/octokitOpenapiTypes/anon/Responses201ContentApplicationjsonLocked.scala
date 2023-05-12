package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonLocked extends StObject {
  
  var parameters: `540`
  
  var requestBody: ContentApplicationjsonDraft
  
  var responses: `201ContentApplicationjsonLocked`
}
object Responses201ContentApplicationjsonLocked {
  
  inline def apply(
    parameters: `540`,
    requestBody: ContentApplicationjsonDraft,
    responses: `201ContentApplicationjsonLocked`
  ): Responses201ContentApplicationjsonLocked = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonLocked]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonLocked] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDraft): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonLocked`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
