package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentnumberDiscussionnumberTeamidQuery464 extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumberTeamidQuery464
  
  var responses: `200Content465`
}
object ParametersPathCommentnumberDiscussionnumberTeamidQuery464 {
  
  inline def apply(parameters: PathCommentnumberDiscussionnumberTeamidQuery464, responses: `200Content465`): ParametersPathCommentnumberDiscussionnumberTeamidQuery464 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentnumberDiscussionnumberTeamidQuery464]
  }
  
  extension [Self <: ParametersPathCommentnumberDiscussionnumberTeamidQuery464](x: Self) {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumberTeamidQuery464): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content465`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
