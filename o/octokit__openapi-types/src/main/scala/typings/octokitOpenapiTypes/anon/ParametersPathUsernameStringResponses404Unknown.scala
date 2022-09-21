package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathUsernameStringResponses404Unknown extends StObject {
  
  var parameters: PathUsernameString
  
  var responses: `404Unknown`
}
object ParametersPathUsernameStringResponses404Unknown {
  
  inline def apply(parameters: PathUsernameString, responses: `404Unknown`): ParametersPathUsernameStringResponses404Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathUsernameStringResponses404Unknown]
  }
  
  extension [Self <: ParametersPathUsernameStringResponses404Unknown](x: Self) {
    
    inline def setParameters(value: PathUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
