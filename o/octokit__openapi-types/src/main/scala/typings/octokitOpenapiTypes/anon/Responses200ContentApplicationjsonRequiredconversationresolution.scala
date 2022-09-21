package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonRequiredconversationresolution extends StObject {
  
  var parameters: PathBranchOwner
  
  var requestBody: ContentApplicationjsonAllowdeletions
  
  var responses: `200ContentApplicationjsonRequiredconversationresolution`
}
object Responses200ContentApplicationjsonRequiredconversationresolution {
  
  inline def apply(
    parameters: PathBranchOwner,
    requestBody: ContentApplicationjsonAllowdeletions,
    responses: `200ContentApplicationjsonRequiredconversationresolution`
  ): Responses200ContentApplicationjsonRequiredconversationresolution = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonRequiredconversationresolution]
  }
  
  extension [Self <: Responses200ContentApplicationjsonRequiredconversationresolution](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAllowdeletions): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRequiredconversationresolution`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
