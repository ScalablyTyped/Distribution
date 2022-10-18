package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoTeamslug extends StObject {
  
  var parameters: PathRepoTeamslug
  
  var responses: `200Content382`
}
object ParametersPathRepoTeamslug {
  
  inline def apply(parameters: PathRepoTeamslug, responses: `200Content382`): ParametersPathRepoTeamslug = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoTeamslug]
  }
  
  extension [Self <: ParametersPathRepoTeamslug](x: Self) {
    
    inline def setParameters(value: PathRepoTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content382`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
