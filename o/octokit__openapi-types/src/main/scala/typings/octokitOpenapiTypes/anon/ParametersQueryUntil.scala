package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryUntil extends StObject {
  
  var parameters: QueryUntil
  
  var responses: `400404`
}
object ParametersQueryUntil {
  
  inline def apply(parameters: QueryUntil, responses: `400404`): ParametersQueryUntil = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryUntil]
  }
  
  extension [Self <: ParametersQueryUntil](x: Self) {
    
    inline def setParameters(value: QueryUntil): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
