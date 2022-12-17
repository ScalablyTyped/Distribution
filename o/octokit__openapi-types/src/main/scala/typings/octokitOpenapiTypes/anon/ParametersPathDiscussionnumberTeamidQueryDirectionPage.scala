package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberTeamidQueryDirectionPage extends StObject {
  
  var parameters: PathDiscussionnumberTeamidQueryDirectionPage
  
  var responses: `200Content110`
}
object ParametersPathDiscussionnumberTeamidQueryDirectionPage {
  
  inline def apply(parameters: PathDiscussionnumberTeamidQueryDirectionPage, responses: `200Content110`): ParametersPathDiscussionnumberTeamidQueryDirectionPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberTeamidQueryDirectionPage]
  }
  
  extension [Self <: ParametersPathDiscussionnumberTeamidQueryDirectionPage](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumberTeamidQueryDirectionPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content110`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
