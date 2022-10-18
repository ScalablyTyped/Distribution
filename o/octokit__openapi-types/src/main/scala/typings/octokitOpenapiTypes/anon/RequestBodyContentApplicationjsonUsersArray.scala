package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonUsersArray extends StObject {
  
  var parameters: PathBranchOwner
  
  var requestBody: ContentApplicationjsonUsersArray
  
  var responses: `200Content41422Content8`
}
object RequestBodyContentApplicationjsonUsersArray {
  
  inline def apply(
    parameters: PathBranchOwner,
    requestBody: ContentApplicationjsonUsersArray,
    responses: `200Content41422Content8`
  ): RequestBodyContentApplicationjsonUsersArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonUsersArray]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonUsersArray](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonUsersArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content41422Content8`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
