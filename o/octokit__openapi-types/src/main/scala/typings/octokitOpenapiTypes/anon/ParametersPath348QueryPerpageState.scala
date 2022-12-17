package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath348QueryPerpageState extends StObject {
  
  var parameters: Path348QueryPerpageState
  
  var responses: `200Content99422`
}
object ParametersPath348QueryPerpageState {
  
  inline def apply(parameters: Path348QueryPerpageState, responses: `200Content99422`): ParametersPath348QueryPerpageState = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath348QueryPerpageState]
  }
  
  extension [Self <: ParametersPath348QueryPerpageState](x: Self) {
    
    inline def setParameters(value: Path348QueryPerpageState): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content99422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
