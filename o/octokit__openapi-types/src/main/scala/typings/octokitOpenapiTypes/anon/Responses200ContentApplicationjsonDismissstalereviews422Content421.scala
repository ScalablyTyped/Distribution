package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonDismissstalereviews422Content421 extends StObject {
  
  var parameters: PathBranchOwner
  
  var requestBody: ContentApplicationjsonBypasspullrequestallowances
  
  var responses: `200ContentApplicationjsonDismissstalereviews422Content421`
}
object Responses200ContentApplicationjsonDismissstalereviews422Content421 {
  
  inline def apply(
    parameters: PathBranchOwner,
    requestBody: ContentApplicationjsonBypasspullrequestallowances,
    responses: `200ContentApplicationjsonDismissstalereviews422Content421`
  ): Responses200ContentApplicationjsonDismissstalereviews422Content421 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonDismissstalereviews422Content421]
  }
  
  extension [Self <: Responses200ContentApplicationjsonDismissstalereviews422Content421](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBypasspullrequestallowances): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDismissstalereviews422Content421`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
