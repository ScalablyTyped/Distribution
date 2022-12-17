package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonConditions extends StObject {
  
  var parameters: PathLicense
  
  var responses: `200ContentApplicationjsonConditions`
}
object Responses200ContentApplicationjsonConditions {
  
  inline def apply(parameters: PathLicense, responses: `200ContentApplicationjsonConditions`): Responses200ContentApplicationjsonConditions = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonConditions]
  }
  
  extension [Self <: Responses200ContentApplicationjsonConditions](x: Self) {
    
    inline def setParameters(value: PathLicense): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonConditions`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
