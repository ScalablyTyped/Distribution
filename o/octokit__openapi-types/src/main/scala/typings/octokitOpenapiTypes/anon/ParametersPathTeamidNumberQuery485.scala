package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidNumberQuery485 extends StObject {
  
  var parameters: PathTeamidNumberQuery485
  
  var responses: `200Content454Headers404Content55`
}
object ParametersPathTeamidNumberQuery485 {
  
  inline def apply(parameters: PathTeamidNumberQuery485, responses: `200Content454Headers404Content55`): ParametersPathTeamidNumberQuery485 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidNumberQuery485]
  }
  
  extension [Self <: ParametersPathTeamidNumberQuery485](x: Self) {
    
    inline def setParameters(value: PathTeamidNumberQuery485): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content454Headers404Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
