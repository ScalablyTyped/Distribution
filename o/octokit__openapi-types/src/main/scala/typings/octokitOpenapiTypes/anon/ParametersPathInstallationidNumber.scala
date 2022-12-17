package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathInstallationidNumber extends StObject {
  
  var parameters: PathInstallationidNumber
  
  var responses: `200ContentApplicationjsonContactemail`
}
object ParametersPathInstallationidNumber {
  
  inline def apply(parameters: PathInstallationidNumber, responses: `200ContentApplicationjsonContactemail`): ParametersPathInstallationidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathInstallationidNumber]
  }
  
  extension [Self <: ParametersPathInstallationidNumber](x: Self) {
    
    inline def setParameters(value: PathInstallationidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonContactemail`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
