package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathProjectidNumberUsernameString extends StObject {
  
  var parameters: PathProjectidNumberUsernameString
  
  var requestBody: Content121
  
  var responses: `304Unknown401Content48403Content48`
}
object ParametersPathProjectidNumberUsernameString {
  
  inline def apply(
    parameters: PathProjectidNumberUsernameString,
    requestBody: Content121,
    responses: `304Unknown401Content48403Content48`
  ): ParametersPathProjectidNumberUsernameString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathProjectidNumberUsernameString]
  }
  
  extension [Self <: ParametersPathProjectidNumberUsernameString](x: Self) {
    
    inline def setParameters(value: PathProjectidNumberUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content121): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304Unknown401Content48403Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
