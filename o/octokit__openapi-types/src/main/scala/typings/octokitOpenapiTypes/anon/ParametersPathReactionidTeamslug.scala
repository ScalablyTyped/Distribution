package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathReactionidTeamslug extends StObject {
  
  var parameters: PathReactionidTeamslug
}
object ParametersPathReactionidTeamslug {
  
  inline def apply(parameters: PathReactionidTeamslug): ParametersPathReactionidTeamslug = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathReactionidTeamslug]
  }
  
  extension [Self <: ParametersPathReactionidTeamslug](x: Self) {
    
    inline def setParameters(value: PathReactionidTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
