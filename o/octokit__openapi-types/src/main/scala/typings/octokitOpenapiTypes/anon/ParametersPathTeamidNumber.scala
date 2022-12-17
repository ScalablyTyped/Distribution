package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidNumber extends StObject {
  
  var parameters: PathTeamidNumber
  
  var responses: `200ContentApplicationjsonReposcount`
}
object ParametersPathTeamidNumber {
  
  inline def apply(parameters: PathTeamidNumber, responses: `200ContentApplicationjsonReposcount`): ParametersPathTeamidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidNumber]
  }
  
  extension [Self <: ParametersPathTeamidNumber](x: Self) {
    
    inline def setParameters(value: PathTeamidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonReposcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
