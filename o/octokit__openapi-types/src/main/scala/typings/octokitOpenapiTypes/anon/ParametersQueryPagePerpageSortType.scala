package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPagePerpageSortType extends StObject {
  
  var parameters: QueryPagePerpageSortType
  
  var responses: `361`
}
object ParametersQueryPagePerpageSortType {
  
  inline def apply(parameters: QueryPagePerpageSortType, responses: `361`): ParametersQueryPagePerpageSortType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPagePerpageSortType]
  }
  
  extension [Self <: ParametersQueryPagePerpageSortType](x: Self) {
    
    inline def setParameters(value: QueryPagePerpageSortType): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `361`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
