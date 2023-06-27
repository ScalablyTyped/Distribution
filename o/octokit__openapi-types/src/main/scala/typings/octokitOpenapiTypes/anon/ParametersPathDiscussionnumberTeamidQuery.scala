package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberTeamidQuery extends StObject {
  
  var parameters: PathDiscussionnumberTeamidQuery
  
  var responses: `200Content136`
}
object ParametersPathDiscussionnumberTeamidQuery {
  
  inline def apply(parameters: PathDiscussionnumberTeamidQuery, responses: `200Content136`): ParametersPathDiscussionnumberTeamidQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberTeamidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDiscussionnumberTeamidQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDiscussionnumberTeamidQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content136`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
