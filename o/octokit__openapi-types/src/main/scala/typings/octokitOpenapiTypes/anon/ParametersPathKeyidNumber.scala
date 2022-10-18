package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathKeyidNumber extends StObject {
  
  var parameters: PathKeyidNumber
  
  var responses: `200ContentApplicationjsonReadonly`
}
object ParametersPathKeyidNumber {
  
  inline def apply(parameters: PathKeyidNumber, responses: `200ContentApplicationjsonReadonly`): ParametersPathKeyidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathKeyidNumber]
  }
  
  extension [Self <: ParametersPathKeyidNumber](x: Self) {
    
    inline def setParameters(value: PathKeyidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonReadonly`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
