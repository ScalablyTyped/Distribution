package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath292QueryClientipLocation extends StObject {
  
  var parameters: Path292QueryClientipLocation
  
  var responses: `200ContentApplicationjsonMachinesTotalcount`
}
object ParametersPath292QueryClientipLocation {
  
  inline def apply(parameters: Path292QueryClientipLocation, responses: `200ContentApplicationjsonMachinesTotalcount`): ParametersPath292QueryClientipLocation = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath292QueryClientipLocation]
  }
  
  extension [Self <: ParametersPath292QueryClientipLocation](x: Self) {
    
    inline def setParameters(value: Path292QueryClientipLocation): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonMachinesTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
