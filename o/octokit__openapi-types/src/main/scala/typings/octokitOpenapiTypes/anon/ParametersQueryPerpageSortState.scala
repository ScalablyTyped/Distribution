package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPerpageSortState extends StObject {
  
  var parameters: QueryPerpageSortState
  
  var responses: `200Content559`
}
object ParametersQueryPerpageSortState {
  
  inline def apply(parameters: QueryPerpageSortState, responses: `200Content559`): ParametersQueryPerpageSortState = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPerpageSortState]
  }
  
  extension [Self <: ParametersQueryPerpageSortState](x: Self) {
    
    inline def setParameters(value: QueryPerpageSortState): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content559`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
