package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryUntil extends StObject {
  
  var parameters: QueryUntil
  
  var responses: `409500`
}
object ParametersQueryUntil {
  
  inline def apply(parameters: QueryUntil, responses: `409500`): ParametersQueryUntil = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryUntil]
  }
  
  extension [Self <: ParametersQueryUntil](x: Self) {
    
    inline def setParameters(value: QueryUntil): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
