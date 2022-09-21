package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryCountFilter extends StObject {
  
  var parameters: QueryCountFilter
  
  var responses: `429`
}
object ParametersQueryCountFilter {
  
  inline def apply(parameters: QueryCountFilter, responses: `429`): ParametersQueryCountFilter = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryCountFilter]
  }
  
  extension [Self <: ParametersQueryCountFilter](x: Self) {
    
    inline def setParameters(value: QueryCountFilter): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `429`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
