package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberTeamidQueryContentPage extends StObject {
  
  var parameters: PathDiscussionnumberTeamidQueryContentPage
  
  var responses: `200Content118`
}
object ParametersPathDiscussionnumberTeamidQueryContentPage {
  
  inline def apply(parameters: PathDiscussionnumberTeamidQueryContentPage, responses: `200Content118`): ParametersPathDiscussionnumberTeamidQueryContentPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberTeamidQueryContentPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDiscussionnumberTeamidQueryContentPage] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDiscussionnumberTeamidQueryContentPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content118`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
