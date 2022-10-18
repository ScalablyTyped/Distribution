package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonInstallationsTotalcount extends StObject {
  
  var parameters: Path300
  
  var responses: `200ContentApplicationjsonInstallationsTotalcount`
}
object Responses200ContentApplicationjsonInstallationsTotalcount {
  
  inline def apply(parameters: Path300, responses: `200ContentApplicationjsonInstallationsTotalcount`): Responses200ContentApplicationjsonInstallationsTotalcount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonInstallationsTotalcount]
  }
  
  extension [Self <: Responses200ContentApplicationjsonInstallationsTotalcount](x: Self) {
    
    inline def setParameters(value: Path300): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonInstallationsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
