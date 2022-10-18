package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathLicenseString extends StObject {
  
  var parameters: PathLicenseString
  
  var responses: `200ContentApplicationjsonConditions`
}
object ParametersPathLicenseString {
  
  inline def apply(parameters: PathLicenseString, responses: `200ContentApplicationjsonConditions`): ParametersPathLicenseString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathLicenseString]
  }
  
  extension [Self <: ParametersPathLicenseString](x: Self) {
    
    inline def setParameters(value: PathLicenseString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonConditions`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
