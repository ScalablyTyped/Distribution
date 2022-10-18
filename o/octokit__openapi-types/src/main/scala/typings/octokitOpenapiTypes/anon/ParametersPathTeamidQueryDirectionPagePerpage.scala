package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidQueryDirectionPagePerpage extends StObject {
  
  var parameters: PathTeamidQueryDirectionPagePerpage
  
  var responses: `200Content59`
}
object ParametersPathTeamidQueryDirectionPagePerpage {
  
  inline def apply(parameters: PathTeamidQueryDirectionPagePerpage, responses: `200Content59`): ParametersPathTeamidQueryDirectionPagePerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidQueryDirectionPagePerpage]
  }
  
  extension [Self <: ParametersPathTeamidQueryDirectionPagePerpage](x: Self) {
    
    inline def setParameters(value: PathTeamidQueryDirectionPagePerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content59`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
