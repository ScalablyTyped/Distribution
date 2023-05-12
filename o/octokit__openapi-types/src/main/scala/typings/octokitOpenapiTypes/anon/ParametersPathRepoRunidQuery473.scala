package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoRunidQuery473 extends StObject {
  
  var parameters: PathRepoRunidQuery473
  
  var responses: `200ContentApplicationjsonArtifactsTotalcount`
}
object ParametersPathRepoRunidQuery473 {
  
  inline def apply(parameters: PathRepoRunidQuery473, responses: `200ContentApplicationjsonArtifactsTotalcount`): ParametersPathRepoRunidQuery473 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoRunidQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoRunidQuery473] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoRunidQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonArtifactsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
