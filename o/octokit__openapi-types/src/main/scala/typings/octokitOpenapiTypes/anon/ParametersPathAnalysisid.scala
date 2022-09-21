package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAnalysisid extends StObject {
  
  var parameters: PathAnalysisid
  
  var responses: `200ContentApplicationjsonsarif`
}
object ParametersPathAnalysisid {
  
  inline def apply(parameters: PathAnalysisid, responses: `200ContentApplicationjsonsarif`): ParametersPathAnalysisid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAnalysisid]
  }
  
  extension [Self <: ParametersPathAnalysisid](x: Self) {
    
    inline def setParameters(value: PathAnalysisid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonsarif`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
