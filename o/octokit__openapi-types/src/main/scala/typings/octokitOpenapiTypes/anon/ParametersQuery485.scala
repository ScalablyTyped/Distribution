package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery485 extends StObject {
  
  var parameters: Query485
  
  var responses: `469`
}
object ParametersQuery485 {
  
  inline def apply(parameters: Query485, responses: `469`): ParametersQuery485 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery485]
  }
  
  extension [Self <: ParametersQuery485](x: Self) {
    
    inline def setParameters(value: Query485): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `469`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
