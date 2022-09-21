package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery255 extends StObject {
  
  var parameters: Query255
  
  var responses: `200Content256`
}
object ParametersQuery255 {
  
  inline def apply(parameters: Query255, responses: `200Content256`): ParametersQuery255 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery255]
  }
  
  extension [Self <: ParametersQuery255](x: Self) {
    
    inline def setParameters(value: Query255): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content256`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
