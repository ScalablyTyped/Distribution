package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPinned extends StObject {
  
  var parameters: QueryPinned
  
  var responses: `200Content115`
}
object ParametersQueryPinned {
  
  inline def apply(parameters: QueryPinned, responses: `200Content115`): ParametersQueryPinned = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPinned]
  }
  
  extension [Self <: ParametersQueryPinned](x: Self) {
    
    inline def setParameters(value: QueryPinned): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content115`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
