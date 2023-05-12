package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamslugStringQuery473 extends StObject {
  
  var parameters: PathTeamslugStringQuery473
  
  var responses: `534`
}
object ParametersPathTeamslugStringQuery473 {
  
  inline def apply(parameters: PathTeamslugStringQuery473, responses: `534`): ParametersPathTeamslugStringQuery473 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamslugStringQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamslugStringQuery473] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamslugStringQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `534`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
