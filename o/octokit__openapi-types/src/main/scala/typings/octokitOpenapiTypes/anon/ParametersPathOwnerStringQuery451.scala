package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringQuery451 extends StObject {
  
  var parameters: PathOwnerStringQuery451
  
  var responses: `200ContentApplicationjsonNames`
}
object ParametersPathOwnerStringQuery451 {
  
  inline def apply(parameters: PathOwnerStringQuery451, responses: `200ContentApplicationjsonNames`): ParametersPathOwnerStringQuery451 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringQuery451]
  }
  
  extension [Self <: ParametersPathOwnerStringQuery451](x: Self) {
    
    inline def setParameters(value: PathOwnerStringQuery451): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonNames`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
