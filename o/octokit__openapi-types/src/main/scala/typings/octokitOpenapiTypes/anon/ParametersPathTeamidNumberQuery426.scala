package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidNumberQuery426 extends StObject {
  
  var parameters: PathTeamidNumberQuery426
  
  var responses: `484`
}
object ParametersPathTeamidNumberQuery426 {
  
  inline def apply(parameters: PathTeamidNumberQuery426, responses: `484`): ParametersPathTeamidNumberQuery426 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidNumberQuery426]
  }
  
  extension [Self <: ParametersPathTeamidNumberQuery426](x: Self) {
    
    inline def setParameters(value: PathTeamidNumberQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `484`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
