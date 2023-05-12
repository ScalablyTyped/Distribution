package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath370QueryPerpageState extends StObject {
  
  var parameters: Path370QueryPerpageState
  
  var responses: `200Content102422`
}
object ParametersPath370QueryPerpageState {
  
  inline def apply(parameters: Path370QueryPerpageState, responses: `200Content102422`): ParametersPath370QueryPerpageState = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath370QueryPerpageState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath370QueryPerpageState] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path370QueryPerpageState): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content102422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
