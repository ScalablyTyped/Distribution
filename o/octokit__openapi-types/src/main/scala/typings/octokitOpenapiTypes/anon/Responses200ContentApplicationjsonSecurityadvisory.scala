package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonSecurityadvisory extends StObject {
  
  var parameters: PathAlertnumber
  
  var responses: `200ContentApplicationjsonSecurityadvisory`
}
object Responses200ContentApplicationjsonSecurityadvisory {
  
  inline def apply(parameters: PathAlertnumber, responses: `200ContentApplicationjsonSecurityadvisory`): Responses200ContentApplicationjsonSecurityadvisory = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonSecurityadvisory]
  }
  
  extension [Self <: Responses200ContentApplicationjsonSecurityadvisory](x: Self) {
    
    inline def setParameters(value: PathAlertnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonSecurityadvisory`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
