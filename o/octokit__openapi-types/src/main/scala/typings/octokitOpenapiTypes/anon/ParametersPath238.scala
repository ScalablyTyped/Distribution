package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath238 extends StObject {
  
  var parameters: Path238
  
  var requestBody: ContentApplicationjsonAccesstoken
  
  var responses: `239`
}
object ParametersPath238 {
  
  inline def apply(parameters: Path238, requestBody: ContentApplicationjsonAccesstoken, responses: `239`): ParametersPath238 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath238]
  }
  
  extension [Self <: ParametersPath238](x: Self) {
    
    inline def setParameters(value: Path238): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAccesstoken): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `239`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
