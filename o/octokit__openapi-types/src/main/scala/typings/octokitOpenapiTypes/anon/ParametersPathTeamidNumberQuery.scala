package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidNumberQuery extends StObject {
  
  var parameters: PathTeamidNumberQuery
  
  var responses: `200Content624`
}
object ParametersPathTeamidNumberQuery {
  
  inline def apply(parameters: PathTeamidNumberQuery, responses: `200Content624`): ParametersPathTeamidNumberQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidNumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamidNumberQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamidNumberQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content624`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
