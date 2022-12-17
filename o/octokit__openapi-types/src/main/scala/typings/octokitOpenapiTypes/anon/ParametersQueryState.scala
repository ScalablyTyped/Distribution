package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryState extends StObject {
  
  var parameters: QueryState
  
  var responses: `200401403404`
}
object ParametersQueryState {
  
  inline def apply(parameters: QueryState, responses: `200401403404`): ParametersQueryState = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryState]
  }
  
  extension [Self <: ParametersQueryState](x: Self) {
    
    inline def setParameters(value: QueryState): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
