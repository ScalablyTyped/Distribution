package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryClientipRef extends StObject {
  
  var parameters: QueryClientipRef
  
  var responses: `200ContentApplicationjsonDefaults`
}
object ParametersQueryClientipRef {
  
  inline def apply(parameters: QueryClientipRef, responses: `200ContentApplicationjsonDefaults`): ParametersQueryClientipRef = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryClientipRef]
  }
  
  extension [Self <: ParametersQueryClientipRef](x: Self) {
    
    inline def setParameters(value: QueryClientipRef): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDefaults`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
