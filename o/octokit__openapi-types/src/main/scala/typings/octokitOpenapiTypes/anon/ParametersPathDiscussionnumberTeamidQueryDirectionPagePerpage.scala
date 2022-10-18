package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberTeamidQueryDirectionPagePerpage extends StObject {
  
  var parameters: PathDiscussionnumberTeamidQueryDirectionPagePerpage
  
  var responses: `200Content60`
}
object ParametersPathDiscussionnumberTeamidQueryDirectionPagePerpage {
  
  inline def apply(parameters: PathDiscussionnumberTeamidQueryDirectionPagePerpage, responses: `200Content60`): ParametersPathDiscussionnumberTeamidQueryDirectionPagePerpage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberTeamidQueryDirectionPagePerpage]
  }
  
  extension [Self <: ParametersPathDiscussionnumberTeamidQueryDirectionPagePerpage](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumberTeamidQueryDirectionPagePerpage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content60`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
