package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonTeamsArrayUsersArray extends StObject {
  
  var parameters: PathPullnumber
  
  var responses: `200ContentApplicationjsonTeamsArrayUsersArray`
}
object Responses200ContentApplicationjsonTeamsArrayUsersArray {
  
  inline def apply(parameters: PathPullnumber, responses: `200ContentApplicationjsonTeamsArrayUsersArray`): Responses200ContentApplicationjsonTeamsArrayUsersArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonTeamsArrayUsersArray]
  }
  
  extension [Self <: Responses200ContentApplicationjsonTeamsArrayUsersArray](x: Self) {
    
    inline def setParameters(value: PathPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonTeamsArrayUsersArray`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
