package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPagePerpageQ extends StObject {
  
  var parameters: QueryPagePerpageQ
  
  var responses: `200ContentApplicationjsonIncompleteresultsBoolean`
}
object ParametersQueryPagePerpageQ {
  
  inline def apply(parameters: QueryPagePerpageQ, responses: `200ContentApplicationjsonIncompleteresultsBoolean`): ParametersQueryPagePerpageQ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPagePerpageQ]
  }
  
  extension [Self <: ParametersQueryPagePerpageQ](x: Self) {
    
    inline def setParameters(value: QueryPagePerpageQ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonIncompleteresultsBoolean`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
