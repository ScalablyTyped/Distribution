package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery119 extends StObject {
  
  var parameters: Query119
  
  var responses: `200Content120`
}
object ParametersQuery119 {
  
  inline def apply(parameters: Query119, responses: `200Content120`): ParametersQuery119 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery119]
  }
  
  extension [Self <: ParametersQuery119](x: Self) {
    
    inline def setParameters(value: Query119): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content120`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
