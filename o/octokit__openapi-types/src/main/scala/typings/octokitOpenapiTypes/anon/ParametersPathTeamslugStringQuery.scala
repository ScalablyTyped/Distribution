package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamslugStringQuery extends StObject {
  
  var parameters: PathTeamslugStringQuery
  
  var responses: `200Content624`
}
object ParametersPathTeamslugStringQuery {
  
  inline def apply(parameters: PathTeamslugStringQuery, responses: `200Content624`): ParametersPathTeamslugStringQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamslugStringQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamslugStringQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamslugStringQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content624`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
