package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentnumberDiscussionnumberTeamidQuery481 extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumberTeamidQuery481
  
  var responses: `200Content482`
}
object ParametersPathCommentnumberDiscussionnumberTeamidQuery481 {
  
  inline def apply(parameters: PathCommentnumberDiscussionnumberTeamidQuery481, responses: `200Content482`): ParametersPathCommentnumberDiscussionnumberTeamidQuery481 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentnumberDiscussionnumberTeamidQuery481]
  }
  
  extension [Self <: ParametersPathCommentnumberDiscussionnumberTeamidQuery481](x: Self) {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumberTeamidQuery481): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content482`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
