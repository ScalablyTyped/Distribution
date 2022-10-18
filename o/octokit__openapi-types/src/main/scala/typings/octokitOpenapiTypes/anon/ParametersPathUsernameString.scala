package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathUsernameString extends StObject {
  
  var parameters: PathUsernameString
  
  var responses: `401Content6403Content6`
}
object ParametersPathUsernameString {
  
  inline def apply(parameters: PathUsernameString, responses: `401Content6403Content6`): ParametersPathUsernameString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathUsernameString]
  }
  
  extension [Self <: ParametersPathUsernameString](x: Self) {
    
    inline def setParameters(value: PathUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401Content6403Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
