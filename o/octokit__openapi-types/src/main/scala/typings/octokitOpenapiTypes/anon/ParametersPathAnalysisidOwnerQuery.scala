package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAnalysisidOwnerQuery extends StObject {
  
  var parameters: PathAnalysisidOwnerQuery
  
  var responses: `400403404`
}
object ParametersPathAnalysisidOwnerQuery {
  
  inline def apply(parameters: PathAnalysisidOwnerQuery, responses: `400403404`): ParametersPathAnalysisidOwnerQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAnalysisidOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAnalysisidOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAnalysisidOwnerQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
