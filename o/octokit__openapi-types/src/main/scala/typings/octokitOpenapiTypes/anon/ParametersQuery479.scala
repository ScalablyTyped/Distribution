package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery479 extends StObject {
  
  var parameters: Query479
  
  var responses: `200Content480`
}
object ParametersQuery479 {
  
  inline def apply(parameters: Query479, responses: `200Content480`): ParametersQuery479 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery479]
  }
  
  extension [Self <: ParametersQuery479](x: Self) {
    
    inline def setParameters(value: Query479): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content480`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
