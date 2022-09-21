package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathProjectidNumber extends StObject {
  
  var parameters: PathProjectidNumber
  
  var responses: `200ContentApplicationjsonOwnerurl`
}
object ParametersPathProjectidNumber {
  
  inline def apply(parameters: PathProjectidNumber, responses: `200ContentApplicationjsonOwnerurl`): ParametersPathProjectidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathProjectidNumber]
  }
  
  extension [Self <: ParametersPathProjectidNumber](x: Self) {
    
    inline def setParameters(value: PathProjectidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOwnerurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
