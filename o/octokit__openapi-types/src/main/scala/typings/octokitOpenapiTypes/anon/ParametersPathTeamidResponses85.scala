package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidResponses85 extends StObject {
  
  var parameters: PathTeamid
  
  var responses: `85`
}
object ParametersPathTeamidResponses85 {
  
  inline def apply(parameters: PathTeamid, responses: `85`): ParametersPathTeamidResponses85 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidResponses85]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamidResponses85] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `85`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
