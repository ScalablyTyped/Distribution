package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content27403Content6 extends StObject {
  
  var parameters: PathBranchOwner
  
  var requestBody: ContentApplicationjson94
  
  var responses: `200Content27403Content6`
}
object Responses200Content27403Content6 {
  
  inline def apply(
    parameters: PathBranchOwner,
    requestBody: ContentApplicationjson94,
    responses: `200Content27403Content6`
  ): Responses200Content27403Content6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content27403Content6]
  }
  
  extension [Self <: Responses200Content27403Content6](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson94): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content27403Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
