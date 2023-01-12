package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses409422503 extends StObject {
  
  var parameters: `505`
  
  var requestBody: ContentApplicationjsonAuthorBranch
  
  var responses: `409422503`
}
object Responses409422503 {
  
  inline def apply(parameters: `505`, requestBody: ContentApplicationjsonAuthorBranch, responses: `409422503`): Responses409422503 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses409422503]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses409422503] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `505`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAuthorBranch): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409422503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
