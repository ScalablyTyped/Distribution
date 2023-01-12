package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamslugStringResponses extends StObject {
  
  var parameters: PathTeamslugString
}
object ParametersPathTeamslugStringResponses {
  
  inline def apply(parameters: PathTeamslugString): ParametersPathTeamslugStringResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamslugStringResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamslugStringResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamslugString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
