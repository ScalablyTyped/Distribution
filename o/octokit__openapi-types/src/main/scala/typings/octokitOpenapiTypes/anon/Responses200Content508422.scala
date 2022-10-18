package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content508422 extends StObject {
  
  var parameters: `506`
  
  var requestBody: ContentApplicationjsonForce
  
  var responses: `200Content508422`
}
object Responses200Content508422 {
  
  inline def apply(parameters: `506`, requestBody: ContentApplicationjsonForce, responses: `200Content508422`): Responses200Content508422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content508422]
  }
  
  extension [Self <: Responses200Content508422](x: Self) {
    
    inline def setParameters(value: `506`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonForce): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content508422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
