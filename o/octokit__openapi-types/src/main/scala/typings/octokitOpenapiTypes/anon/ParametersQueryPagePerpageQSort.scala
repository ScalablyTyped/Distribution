package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPagePerpageQSort extends StObject {
  
  var parameters: QueryPagePerpageQSort
  
  var responses: `200304403422503`
}
object ParametersQueryPagePerpageQSort {
  
  inline def apply(parameters: QueryPagePerpageQSort, responses: `200304403422503`): ParametersQueryPagePerpageQSort = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPagePerpageQSort]
  }
  
  extension [Self <: ParametersQueryPagePerpageQSort](x: Self) {
    
    inline def setParameters(value: QueryPagePerpageQSort): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304403422503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
