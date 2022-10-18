package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery350 extends StObject {
  
  var parameters: Query350
  
  var responses: `351`
}
object ParametersQuery350 {
  
  inline def apply(parameters: Query350, responses: `351`): ParametersQuery350 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery350]
  }
  
  extension [Self <: ParametersQuery350](x: Self) {
    
    inline def setParameters(value: Query350): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `351`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
