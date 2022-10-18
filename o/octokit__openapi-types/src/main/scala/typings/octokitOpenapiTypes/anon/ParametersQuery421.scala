package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery421 extends StObject {
  
  var parameters: Query421
  
  var responses: `423`
}
object ParametersQuery421 {
  
  inline def apply(parameters: Query421, responses: `423`): ParametersQuery421 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery421]
  }
  
  extension [Self <: ParametersQuery421](x: Self) {
    
    inline def setParameters(value: Query421): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `423`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
