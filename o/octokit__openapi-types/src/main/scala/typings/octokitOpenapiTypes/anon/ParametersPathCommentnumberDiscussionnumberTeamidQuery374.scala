package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentnumberDiscussionnumberTeamidQuery374 extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumberTeamidQuery374
  
  var responses: `200Content375`
}
object ParametersPathCommentnumberDiscussionnumberTeamidQuery374 {
  
  inline def apply(parameters: PathCommentnumberDiscussionnumberTeamidQuery374, responses: `200Content375`): ParametersPathCommentnumberDiscussionnumberTeamidQuery374 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentnumberDiscussionnumberTeamidQuery374]
  }
  
  extension [Self <: ParametersPathCommentnumberDiscussionnumberTeamidQuery374](x: Self) {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumberTeamidQuery374): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content375`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
