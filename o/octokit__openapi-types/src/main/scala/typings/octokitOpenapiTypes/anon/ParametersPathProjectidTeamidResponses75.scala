package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathProjectidTeamidResponses75 extends StObject {
  
  var parameters: PathProjectidTeamid
  
  var responses: `75`
}
object ParametersPathProjectidTeamidResponses75 {
  
  inline def apply(parameters: PathProjectidTeamid, responses: `75`): ParametersPathProjectidTeamidResponses75 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathProjectidTeamidResponses75]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathProjectidTeamidResponses75] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathProjectidTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `75`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
