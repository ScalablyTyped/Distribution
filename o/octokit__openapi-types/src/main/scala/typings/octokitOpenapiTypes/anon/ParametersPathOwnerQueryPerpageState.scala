package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerQueryPerpageState extends StObject {
  
  var parameters: PathOwnerQueryPerpageState
  
  var responses: `401403404410`
}
object ParametersPathOwnerQueryPerpageState {
  
  inline def apply(parameters: PathOwnerQueryPerpageState, responses: `401403404410`): ParametersPathOwnerQueryPerpageState = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerQueryPerpageState]
  }
  
  extension [Self <: ParametersPathOwnerQueryPerpageState](x: Self) {
    
    inline def setParameters(value: PathOwnerQueryPerpageState): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401403404410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
