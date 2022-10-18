package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content439 extends StObject {
  
  var parameters: PathBranchOwnerRepo
  
  var requestBody: ContentApplicationjsonRequiredconversationresolution
  
  var responses: `200Content439`
}
object Responses200Content439 {
  
  inline def apply(
    parameters: PathBranchOwnerRepo,
    requestBody: ContentApplicationjsonRequiredconversationresolution,
    responses: `200Content439`
  ): Responses200Content439 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content439]
  }
  
  extension [Self <: Responses200Content439](x: Self) {
    
    inline def setParameters(value: PathBranchOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonRequiredconversationresolution): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content439`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
