package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoRunidQuery407 extends StObject {
  
  var parameters: PathRepoRunidQuery407
  
  var responses: `200ContentApplicationjsonArtifactsTotalcount`
}
object ParametersPathRepoRunidQuery407 {
  
  inline def apply(parameters: PathRepoRunidQuery407, responses: `200ContentApplicationjsonArtifactsTotalcount`): ParametersPathRepoRunidQuery407 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoRunidQuery407]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoRunidQuery407] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoRunidQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonArtifactsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
