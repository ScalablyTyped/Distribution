package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathSshsigningkeyidNumber extends StObject {
  
  var parameters: PathSshsigningkeyidNumber
  
  var responses: `200ContentApplicationjsonCreatedatIdKey`
}
object ParametersPathSshsigningkeyidNumber {
  
  inline def apply(parameters: PathSshsigningkeyidNumber, responses: `200ContentApplicationjsonCreatedatIdKey`): ParametersPathSshsigningkeyidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathSshsigningkeyidNumber]
  }
  
  extension [Self <: ParametersPathSshsigningkeyidNumber](x: Self) {
    
    inline def setParameters(value: PathSshsigningkeyidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCreatedatIdKey`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
