package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathProjectidUsername extends StObject {
  
  var parameters: PathProjectidUsername
  
  var requestBody: Content121
  
  var responses: `131`
}
object ParametersPathProjectidUsername {
  
  inline def apply(parameters: PathProjectidUsername, requestBody: Content121, responses: `131`): ParametersPathProjectidUsername = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathProjectidUsername]
  }
  
  extension [Self <: ParametersPathProjectidUsername](x: Self) {
    
    inline def setParameters(value: PathProjectidUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content121): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `131`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
