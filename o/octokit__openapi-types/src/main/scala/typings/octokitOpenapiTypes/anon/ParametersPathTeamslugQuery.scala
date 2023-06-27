package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamslugQuery extends StObject {
  
  var parameters: PathTeamslugQuery
  
  var responses: `200Content134`
}
object ParametersPathTeamslugQuery {
  
  inline def apply(parameters: PathTeamslugQuery, responses: `200Content134`): ParametersPathTeamslugQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamslugQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamslugQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamslugQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content134`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
