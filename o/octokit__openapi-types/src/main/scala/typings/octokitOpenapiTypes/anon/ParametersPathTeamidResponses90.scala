package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidResponses90 extends StObject {
  
  var parameters: PathTeamid
  
  var responses: `90`
}
object ParametersPathTeamidResponses90 {
  
  inline def apply(parameters: PathTeamid, responses: `90`): ParametersPathTeamidResponses90 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidResponses90]
  }
  
  extension [Self <: ParametersPathTeamidResponses90](x: Self) {
    
    inline def setParameters(value: PathTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `90`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
