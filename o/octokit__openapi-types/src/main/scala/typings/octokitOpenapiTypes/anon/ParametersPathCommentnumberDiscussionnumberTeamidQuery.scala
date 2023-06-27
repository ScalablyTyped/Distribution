package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentnumberDiscussionnumberTeamidQuery extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumberTeamidQuery
  
  var responses: `200Content628`
}
object ParametersPathCommentnumberDiscussionnumberTeamidQuery {
  
  inline def apply(parameters: PathCommentnumberDiscussionnumberTeamidQuery, responses: `200Content628`): ParametersPathCommentnumberDiscussionnumberTeamidQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentnumberDiscussionnumberTeamidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCommentnumberDiscussionnumberTeamidQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumberTeamidQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content628`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
