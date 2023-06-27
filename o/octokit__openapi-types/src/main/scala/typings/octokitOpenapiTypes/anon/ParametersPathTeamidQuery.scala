package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidQuery extends StObject {
  
  var parameters: PathTeamidQuery
  
  var responses: `200Content134`
}
object ParametersPathTeamidQuery {
  
  inline def apply(parameters: PathTeamidQuery, responses: `200Content134`): ParametersPathTeamidQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamidQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamidQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content134`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
