package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRunidQuery extends StObject {
  
  var parameters: PathRunidQuery
  
  var responses: `200ContentApplicationjsonArtifacts`
}
object ParametersPathRunidQuery {
  
  inline def apply(parameters: PathRunidQuery, responses: `200ContentApplicationjsonArtifacts`): ParametersPathRunidQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRunidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRunidQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRunidQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonArtifacts`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
