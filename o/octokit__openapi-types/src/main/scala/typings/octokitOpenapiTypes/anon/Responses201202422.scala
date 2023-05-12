package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201202422 extends StObject {
  
  var parameters: `540`
  
  var requestBody: ContentApplicationjsonAutomerge
  
  var responses: `201202422`
}
object Responses201202422 {
  
  inline def apply(parameters: `540`, requestBody: ContentApplicationjsonAutomerge, responses: `201202422`): Responses201202422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201202422]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201202422] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAutomerge): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201202422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
