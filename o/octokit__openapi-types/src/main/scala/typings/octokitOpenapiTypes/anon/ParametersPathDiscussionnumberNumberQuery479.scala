package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberNumberQuery479 extends StObject {
  
  var parameters: PathDiscussionnumberNumberQuery479
  
  var responses: `200Content480`
}
object ParametersPathDiscussionnumberNumberQuery479 {
  
  inline def apply(parameters: PathDiscussionnumberNumberQuery479, responses: `200Content480`): ParametersPathDiscussionnumberNumberQuery479 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberNumberQuery479]
  }
  
  extension [Self <: ParametersPathDiscussionnumberNumberQuery479](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumberNumberQuery479): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content480`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
