package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringQuery188 extends StObject {
  
  var parameters: PathOwnerStringQuery188
  
  var responses: `200ContentApplicationjsonErrorsArray`
}
object ParametersPathOwnerStringQuery188 {
  
  inline def apply(parameters: PathOwnerStringQuery188, responses: `200ContentApplicationjsonErrorsArray`): ParametersPathOwnerStringQuery188 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringQuery188]
  }
  
  extension [Self <: ParametersPathOwnerStringQuery188](x: Self) {
    
    inline def setParameters(value: PathOwnerStringQuery188): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonErrorsArray`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
