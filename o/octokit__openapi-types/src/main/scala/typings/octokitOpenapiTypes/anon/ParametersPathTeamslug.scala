package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTeamslug extends StObject {
  
  var parameters: PathTeamslug
}
object ParametersPathTeamslug {
  
  inline def apply(parameters: PathTeamslug): ParametersPathTeamslug = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTeamslug]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTeamslug] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
