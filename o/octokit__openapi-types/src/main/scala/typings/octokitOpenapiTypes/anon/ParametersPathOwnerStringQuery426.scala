package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringQuery426 extends StObject {
  
  var parameters: PathOwnerStringQuery426
  
  var responses: `200ContentApplicationjsonCodespacesTotalcount`
}
object ParametersPathOwnerStringQuery426 {
  
  inline def apply(parameters: PathOwnerStringQuery426, responses: `200ContentApplicationjsonCodespacesTotalcount`): ParametersPathOwnerStringQuery426 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringQuery426]
  }
  
  extension [Self <: ParametersPathOwnerStringQuery426](x: Self) {
    
    inline def setParameters(value: PathOwnerStringQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCodespacesTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
