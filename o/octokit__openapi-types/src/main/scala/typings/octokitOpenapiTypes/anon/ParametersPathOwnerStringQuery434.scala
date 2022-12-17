package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringQuery434 extends StObject {
  
  var parameters: PathOwnerStringQuery434
  
  var responses: `200ContentApplicationjsonNames`
}
object ParametersPathOwnerStringQuery434 {
  
  inline def apply(parameters: PathOwnerStringQuery434, responses: `200ContentApplicationjsonNames`): ParametersPathOwnerStringQuery434 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringQuery434]
  }
  
  extension [Self <: ParametersPathOwnerStringQuery434](x: Self) {
    
    inline def setParameters(value: PathOwnerStringQuery434): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonNames`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
