package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202409422 extends StObject {
  
  var parameters: `472`
  
  var requestBody: ContentApplicationjsonAutomerge
  
  var responses: `202409422`
}
object Responses202409422 {
  
  inline def apply(parameters: `472`, requestBody: ContentApplicationjsonAutomerge, responses: `202409422`): Responses202409422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202409422]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses202409422] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAutomerge): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202409422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
