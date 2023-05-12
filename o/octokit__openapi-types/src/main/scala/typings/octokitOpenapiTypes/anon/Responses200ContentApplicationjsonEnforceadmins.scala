package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonEnforceadmins extends StObject {
  
  var parameters: PathBranchOwner
  
  var requestBody: ContentApplicationjsonAllowdeletions
  
  var responses: `200ContentApplicationjsonEnforceadmins`
}
object Responses200ContentApplicationjsonEnforceadmins {
  
  inline def apply(
    parameters: PathBranchOwner,
    requestBody: ContentApplicationjsonAllowdeletions,
    responses: `200ContentApplicationjsonEnforceadmins`
  ): Responses200ContentApplicationjsonEnforceadmins = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonEnforceadmins]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonEnforceadmins] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAllowdeletions): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonEnforceadmins`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
