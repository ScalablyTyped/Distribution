package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidNumberQuery479 extends StObject {
  
  var parameters: PathTeamidNumberQuery479
  
  var responses: `200Content478`
}
object ParametersPathTeamidNumberQuery479 {
  
  inline def apply(parameters: PathTeamidNumberQuery479, responses: `200Content478`): ParametersPathTeamidNumberQuery479 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidNumberQuery479]
  }
  
  extension [Self <: ParametersPathTeamidNumberQuery479](x: Self) {
    
    inline def setParameters(value: PathTeamidNumberQuery479): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content478`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
