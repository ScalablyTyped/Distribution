package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathClientidString extends StObject {
  
  var parameters: PathClientidString
  
  var requestBody: ContentApplicationjsonAccesstoken
  
  var responses: `422Content397`
}
object ParametersPathClientidString {
  
  inline def apply(
    parameters: PathClientidString,
    requestBody: ContentApplicationjsonAccesstoken,
    responses: `422Content397`
  ): ParametersPathClientidString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathClientidString]
  }
  
  extension [Self <: ParametersPathClientidString](x: Self) {
    
    inline def setParameters(value: PathClientidString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAccesstoken): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422Content397`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
