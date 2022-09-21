package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery533 extends StObject {
  
  var parameters: Query533
  
  var responses: `400Content420`
}
object ParametersQuery533 {
  
  inline def apply(parameters: Query533, responses: `400Content420`): ParametersQuery533 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery533]
  }
  
  extension [Self <: ParametersQuery533](x: Self) {
    
    inline def setParameters(value: Query533): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400Content420`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
