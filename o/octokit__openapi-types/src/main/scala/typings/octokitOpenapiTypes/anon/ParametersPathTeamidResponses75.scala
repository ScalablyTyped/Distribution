package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamidResponses75 extends StObject {
  
  var parameters: PathTeamid
  
  var responses: `75`
}
object ParametersPathTeamidResponses75 {
  
  inline def apply(parameters: PathTeamid, responses: `75`): ParametersPathTeamidResponses75 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamidResponses75]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamidResponses75] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `75`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
