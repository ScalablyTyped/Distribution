package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringQuery197 extends StObject {
  
  var parameters: PathOwnerStringQuery197
  
  var responses: `200ContentApplicationjsonErrorsArray`
}
object ParametersPathOwnerStringQuery197 {
  
  inline def apply(parameters: PathOwnerStringQuery197, responses: `200ContentApplicationjsonErrorsArray`): ParametersPathOwnerStringQuery197 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringQuery197]
  }
  
  extension [Self <: ParametersPathOwnerStringQuery197](x: Self) {
    
    inline def setParameters(value: PathOwnerStringQuery197): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonErrorsArray`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
