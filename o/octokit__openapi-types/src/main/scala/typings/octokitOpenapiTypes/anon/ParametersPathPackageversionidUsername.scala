package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackageversionidUsername extends StObject {
  
  var parameters: PathPackageversionidUsername
  
  var responses: `200ContentApplicationjsonDeletedat`
}
object ParametersPathPackageversionidUsername {
  
  inline def apply(parameters: PathPackageversionidUsername, responses: `200ContentApplicationjsonDeletedat`): ParametersPathPackageversionidUsername = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackageversionidUsername]
  }
  
  extension [Self <: ParametersPathPackageversionidUsername](x: Self) {
    
    inline def setParameters(value: PathPackageversionidUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDeletedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
