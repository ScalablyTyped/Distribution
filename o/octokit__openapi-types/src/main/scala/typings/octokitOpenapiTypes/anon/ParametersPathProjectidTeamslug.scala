package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathProjectidTeamslug extends StObject {
  
  var parameters: PathProjectidTeamslug
  
  var responses: `200Content381`
}
object ParametersPathProjectidTeamslug {
  
  inline def apply(parameters: PathProjectidTeamslug, responses: `200Content381`): ParametersPathProjectidTeamslug = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathProjectidTeamslug]
  }
  
  extension [Self <: ParametersPathProjectidTeamslug](x: Self) {
    
    inline def setParameters(value: PathProjectidTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content381`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
