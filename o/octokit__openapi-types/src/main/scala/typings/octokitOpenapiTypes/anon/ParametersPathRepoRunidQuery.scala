package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoRunidQuery extends StObject {
  
  var parameters: PathRepoRunidQuery
  
  var responses: `200ContentApplicationjsonArtifactsTotalcount`
}
object ParametersPathRepoRunidQuery {
  
  inline def apply(parameters: PathRepoRunidQuery, responses: `200ContentApplicationjsonArtifactsTotalcount`): ParametersPathRepoRunidQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoRunidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoRunidQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoRunidQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonArtifactsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
