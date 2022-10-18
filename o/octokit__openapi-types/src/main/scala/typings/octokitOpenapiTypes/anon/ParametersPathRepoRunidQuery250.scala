package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoRunidQuery250 extends StObject {
  
  var parameters: PathRepoRunidQuery250
  
  var responses: `200ContentApplicationjsonArtifactsTotalcount`
}
object ParametersPathRepoRunidQuery250 {
  
  inline def apply(parameters: PathRepoRunidQuery250, responses: `200ContentApplicationjsonArtifactsTotalcount`): ParametersPathRepoRunidQuery250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoRunidQuery250]
  }
  
  extension [Self <: ParametersPathRepoRunidQuery250](x: Self) {
    
    inline def setParameters(value: PathRepoRunidQuery250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonArtifactsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
