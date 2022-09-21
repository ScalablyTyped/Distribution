package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoRunidQuery426 extends StObject {
  
  var parameters: PathRepoRunidQuery426
  
  var responses: `200ContentApplicationjsonArtifactsTotalcount`
}
object ParametersPathRepoRunidQuery426 {
  
  inline def apply(parameters: PathRepoRunidQuery426, responses: `200ContentApplicationjsonArtifactsTotalcount`): ParametersPathRepoRunidQuery426 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoRunidQuery426]
  }
  
  extension [Self <: ParametersPathRepoRunidQuery426](x: Self) {
    
    inline def setParameters(value: PathRepoRunidQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonArtifactsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
