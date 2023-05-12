package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidQueryDirectionPage extends StObject {
  
  var parameters: PathTeamidQueryDirectionPage
  
  var responses: `200Content114`
}
object ParametersPathTeamidQueryDirectionPage {
  
  inline def apply(parameters: PathTeamidQueryDirectionPage, responses: `200Content114`): ParametersPathTeamidQueryDirectionPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidQueryDirectionPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamidQueryDirectionPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamidQueryDirectionPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content114`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
