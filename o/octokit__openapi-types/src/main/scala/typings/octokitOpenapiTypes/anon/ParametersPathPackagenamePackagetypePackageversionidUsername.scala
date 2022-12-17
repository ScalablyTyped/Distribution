package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagenamePackagetypePackageversionidUsername extends StObject {
  
  var parameters: PathPackagenamePackagetypePackageversionidUsername
  
  var responses: `401Content48403Content48`
}
object ParametersPathPackagenamePackagetypePackageversionidUsername {
  
  inline def apply(
    parameters: PathPackagenamePackagetypePackageversionidUsername,
    responses: `401Content48403Content48`
  ): ParametersPathPackagenamePackagetypePackageversionidUsername = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagenamePackagetypePackageversionidUsername]
  }
  
  extension [Self <: ParametersPathPackagenamePackagetypePackageversionidUsername](x: Self) {
    
    inline def setParameters(value: PathPackagenamePackagetypePackageversionidUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401Content48403Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
