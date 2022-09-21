package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPerpageQSort extends StObject {
  
  var parameters: QueryPerpageQSort
  
  var responses: `304403422503`
}
object ParametersQueryPerpageQSort {
  
  inline def apply(parameters: QueryPerpageQSort, responses: `304403422503`): ParametersQueryPerpageQSort = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPerpageQSort]
  }
  
  extension [Self <: ParametersQueryPerpageQSort](x: Self) {
    
    inline def setParameters(value: QueryPerpageQSort): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304403422503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
