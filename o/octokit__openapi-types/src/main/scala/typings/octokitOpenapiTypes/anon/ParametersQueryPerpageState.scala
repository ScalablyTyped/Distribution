package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPerpageState extends StObject {
  
  var parameters: QueryPerpageState
  
  var responses: `200401403404`
}
object ParametersQueryPerpageState {
  
  inline def apply(parameters: QueryPerpageState, responses: `200401403404`): ParametersQueryPerpageState = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPerpageState]
  }
  
  extension [Self <: ParametersQueryPerpageState](x: Self) {
    
    inline def setParameters(value: QueryPerpageState): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
