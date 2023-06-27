package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAnalysisidQuery extends StObject {
  
  var parameters: PathAnalysisidQuery
  
  var responses: `400403`
}
object ParametersPathAnalysisidQuery {
  
  inline def apply(parameters: PathAnalysisidQuery, responses: `400403`): ParametersPathAnalysisidQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAnalysisidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAnalysisidQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAnalysisidQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
