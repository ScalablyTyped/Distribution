package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath361QueryPerpageState extends StObject {
  
  var parameters: Path361QueryPerpageState
  
  var responses: `200Content107422`
}
object ParametersPath361QueryPerpageState {
  
  inline def apply(parameters: Path361QueryPerpageState, responses: `200Content107422`): ParametersPath361QueryPerpageState = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath361QueryPerpageState]
  }
  
  extension [Self <: ParametersPath361QueryPerpageState](x: Self) {
    
    inline def setParameters(value: Path361QueryPerpageState): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content107422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
