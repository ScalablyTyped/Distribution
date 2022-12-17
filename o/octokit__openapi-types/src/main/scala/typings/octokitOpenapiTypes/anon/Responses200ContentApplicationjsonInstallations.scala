package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonInstallations extends StObject {
  
  var parameters: PathOrg
  
  var responses: `200ContentApplicationjsonInstallations`
}
object Responses200ContentApplicationjsonInstallations {
  
  inline def apply(parameters: PathOrg, responses: `200ContentApplicationjsonInstallations`): Responses200ContentApplicationjsonInstallations = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonInstallations]
  }
  
  extension [Self <: Responses200ContentApplicationjsonInstallations](x: Self) {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonInstallations`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
