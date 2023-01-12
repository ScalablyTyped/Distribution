package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPagePerpageState extends StObject {
  
  var parameters: QueryPagePerpageState
  
  var responses: `304401403422`
}
object ParametersQueryPagePerpageState {
  
  inline def apply(parameters: QueryPagePerpageState, responses: `304401403422`): ParametersQueryPagePerpageState = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPagePerpageState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryPagePerpageState] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPagePerpageState): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304401403422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
