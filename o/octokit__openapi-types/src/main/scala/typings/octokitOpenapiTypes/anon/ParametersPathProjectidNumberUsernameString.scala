package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathProjectidNumberUsernameString extends StObject {
  
  var parameters: PathProjectidNumberUsernameString
  
  var requestBody: Content129
  
  var responses: `304Unknown401Content55403Content55`
}
object ParametersPathProjectidNumberUsernameString {
  
  inline def apply(
    parameters: PathProjectidNumberUsernameString,
    requestBody: Content129,
    responses: `304Unknown401Content55403Content55`
  ): ParametersPathProjectidNumberUsernameString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathProjectidNumberUsernameString]
  }
  
  extension [Self <: ParametersPathProjectidNumberUsernameString](x: Self) {
    
    inline def setParameters(value: PathProjectidNumberUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content129): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304Unknown401Content55403Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
