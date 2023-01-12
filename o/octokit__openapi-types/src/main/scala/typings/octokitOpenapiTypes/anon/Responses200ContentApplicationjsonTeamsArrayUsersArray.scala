package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonTeamsArrayUsersArray extends StObject {
  
  var parameters: PathPullnumberRepo
  
  var responses: `200ContentApplicationjsonTeamsArrayUsersArray`
}
object Responses200ContentApplicationjsonTeamsArrayUsersArray {
  
  inline def apply(parameters: PathPullnumberRepo, responses: `200ContentApplicationjsonTeamsArrayUsersArray`): Responses200ContentApplicationjsonTeamsArrayUsersArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonTeamsArrayUsersArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonTeamsArrayUsersArray] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumberRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonTeamsArrayUsersArray`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
