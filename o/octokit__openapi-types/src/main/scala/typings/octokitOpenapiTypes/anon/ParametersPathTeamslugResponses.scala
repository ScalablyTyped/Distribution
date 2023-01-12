package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamslugResponses extends StObject {
  
  var parameters: PathTeamslug
}
object ParametersPathTeamslugResponses {
  
  inline def apply(parameters: PathTeamslug): ParametersPathTeamslugResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamslugResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamslugResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
