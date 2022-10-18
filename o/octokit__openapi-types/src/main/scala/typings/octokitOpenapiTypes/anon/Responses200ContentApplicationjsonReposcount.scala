package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonReposcount extends StObject {
  
  var parameters: PathTeamslug
  
  var responses: `200ContentApplicationjsonReposcount`
}
object Responses200ContentApplicationjsonReposcount {
  
  inline def apply(parameters: PathTeamslug, responses: `200ContentApplicationjsonReposcount`): Responses200ContentApplicationjsonReposcount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonReposcount]
  }
  
  extension [Self <: Responses200ContentApplicationjsonReposcount](x: Self) {
    
    inline def setParameters(value: PathTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonReposcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
