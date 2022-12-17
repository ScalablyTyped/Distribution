package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberNumberQuery464 extends StObject {
  
  var parameters: PathDiscussionnumberNumberQuery464
  
  var responses: `200Content465`
}
object ParametersPathDiscussionnumberNumberQuery464 {
  
  inline def apply(parameters: PathDiscussionnumberNumberQuery464, responses: `200Content465`): ParametersPathDiscussionnumberNumberQuery464 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberNumberQuery464]
  }
  
  extension [Self <: ParametersPathDiscussionnumberNumberQuery464](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumberNumberQuery464): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content465`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
