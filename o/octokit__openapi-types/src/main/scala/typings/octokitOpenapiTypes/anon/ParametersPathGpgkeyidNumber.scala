package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathGpgkeyidNumber extends StObject {
  
  var parameters: PathGpgkeyidNumber
  
  var responses: `200ContentApplicationjsonCanencryptcomms`
}
object ParametersPathGpgkeyidNumber {
  
  inline def apply(parameters: PathGpgkeyidNumber, responses: `200ContentApplicationjsonCanencryptcomms`): ParametersPathGpgkeyidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathGpgkeyidNumber]
  }
  
  extension [Self <: ParametersPathGpgkeyidNumber](x: Self) {
    
    inline def setParameters(value: PathGpgkeyidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCanencryptcomms`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
