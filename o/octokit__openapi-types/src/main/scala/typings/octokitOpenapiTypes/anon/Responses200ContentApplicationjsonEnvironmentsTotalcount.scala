package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonEnvironmentsTotalcount extends StObject {
  
  var parameters: PathOwnerString
  
  var responses: `200ContentApplicationjsonEnvironmentsTotalcount`
}
object Responses200ContentApplicationjsonEnvironmentsTotalcount {
  
  inline def apply(parameters: PathOwnerString, responses: `200ContentApplicationjsonEnvironmentsTotalcount`): Responses200ContentApplicationjsonEnvironmentsTotalcount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonEnvironmentsTotalcount]
  }
  
  extension [Self <: Responses200ContentApplicationjsonEnvironmentsTotalcount](x: Self) {
    
    inline def setParameters(value: PathOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonEnvironmentsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
