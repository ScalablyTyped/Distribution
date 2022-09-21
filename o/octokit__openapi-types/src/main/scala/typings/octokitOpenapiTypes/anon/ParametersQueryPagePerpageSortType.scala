package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPagePerpageSortType extends StObject {
  
  var parameters: QueryPagePerpageSortType
  
  var responses: `475`
}
object ParametersQueryPagePerpageSortType {
  
  inline def apply(parameters: QueryPagePerpageSortType, responses: `475`): ParametersQueryPagePerpageSortType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPagePerpageSortType]
  }
  
  extension [Self <: ParametersQueryPagePerpageSortType](x: Self) {
    
    inline def setParameters(value: QueryPagePerpageSortType): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `475`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
