package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamslugString extends StObject {
  
  var parameters: PathTeamslugString
  
  var responses: `409Unknown`
}
object ParametersPathTeamslugString {
  
  inline def apply(parameters: PathTeamslugString, responses: `409Unknown`): ParametersPathTeamslugString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamslugString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamslugString] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamslugString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
