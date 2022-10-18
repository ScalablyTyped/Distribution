package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAuthoridOwner extends StObject {
  
  var parameters: PathAuthoridOwner
  
  var requestBody: ContentApplicationjson138
  
  var responses: `200Content521`
}
object ParametersPathAuthoridOwner {
  
  inline def apply(parameters: PathAuthoridOwner, requestBody: ContentApplicationjson138, responses: `200Content521`): ParametersPathAuthoridOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAuthoridOwner]
  }
  
  extension [Self <: ParametersPathAuthoridOwner](x: Self) {
    
    inline def setParameters(value: PathAuthoridOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson138): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content521`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
