package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAnalysisidOwner extends StObject {
  
  var parameters: PathAnalysisidOwner
  
  var responses: `200ContentApplicationjsonApplicationjsonsarif`
}
object ParametersPathAnalysisidOwner {
  
  inline def apply(parameters: PathAnalysisidOwner, responses: `200ContentApplicationjsonApplicationjsonsarif`): ParametersPathAnalysisidOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAnalysisidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAnalysisidOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAnalysisidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonApplicationjsonsarif`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
