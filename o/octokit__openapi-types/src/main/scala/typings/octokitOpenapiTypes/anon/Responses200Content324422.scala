package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content324422 extends StObject {
  
  var parameters: PathBranchOwnerRepo
  
  var requestBody: ContentApplicationjsonUsersArray
  
  var responses: `200Content324422`
}
object Responses200Content324422 {
  
  inline def apply(
    parameters: PathBranchOwnerRepo,
    requestBody: ContentApplicationjsonUsersArray,
    responses: `200Content324422`
  ): Responses200Content324422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content324422]
  }
  
  extension [Self <: Responses200Content324422](x: Self) {
    
    inline def setParameters(value: PathBranchOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonUsersArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content324422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
