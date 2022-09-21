package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPagePerpageSort extends StObject {
  
  var parameters: QueryPagePerpageSort
  
  var responses: `200ContentApplicationvndgithubv3starjson`
}
object ParametersQueryPagePerpageSort {
  
  inline def apply(parameters: QueryPagePerpageSort, responses: `200ContentApplicationvndgithubv3starjson`): ParametersQueryPagePerpageSort = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPagePerpageSort]
  }
  
  extension [Self <: ParametersQueryPagePerpageSort](x: Self) {
    
    inline def setParameters(value: QueryPagePerpageSort): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationvndgithubv3starjson`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
