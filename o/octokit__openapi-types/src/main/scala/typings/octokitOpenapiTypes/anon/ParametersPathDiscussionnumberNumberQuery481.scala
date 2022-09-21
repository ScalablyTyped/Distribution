package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberNumberQuery481 extends StObject {
  
  var parameters: PathDiscussionnumberNumberQuery481
  
  var responses: `200Content482`
}
object ParametersPathDiscussionnumberNumberQuery481 {
  
  inline def apply(parameters: PathDiscussionnumberNumberQuery481, responses: `200Content482`): ParametersPathDiscussionnumberNumberQuery481 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberNumberQuery481]
  }
  
  extension [Self <: ParametersPathDiscussionnumberNumberQuery481](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumberNumberQuery481): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content482`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
