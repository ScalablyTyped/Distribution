package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content387 extends StObject {
  
  var parameters: Path389
  
  var requestBody: ContentApplicationjsonNameString
  
  var responses: `201Content387`
}
object Responses201Content387 {
  
  inline def apply(parameters: Path389, requestBody: ContentApplicationjsonNameString, responses: `201Content387`): Responses201Content387 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content387]
  }
  
  extension [Self <: Responses201Content387](x: Self) {
    
    inline def setParameters(value: Path389): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNameString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content387`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
