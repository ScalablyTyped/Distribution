package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPerpageState extends StObject {
  
  var parameters: QueryPerpageState
  
  var responses: `200Content102`
}
object ParametersQueryPerpageState {
  
  inline def apply(parameters: QueryPerpageState, responses: `200Content102`): ParametersQueryPerpageState = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPerpageState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryPerpageState] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPerpageState): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content102`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
