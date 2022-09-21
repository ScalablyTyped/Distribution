package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidQueryPage extends StObject {
  
  var parameters: PathTeamidQueryPage
  
  var responses: `123`
}
object ParametersPathTeamidQueryPage {
  
  inline def apply(parameters: PathTeamidQueryPage, responses: `123`): ParametersPathTeamidQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidQueryPage]
  }
  
  extension [Self <: ParametersPathTeamidQueryPage](x: Self) {
    
    inline def setParameters(value: PathTeamidQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `123`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
