package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonRequiredapprovingreviewcount extends StObject {
  
  var parameters: PathBranchOwner
  
  var requestBody: ContentApplicationjsonRequiredapprovingreviewcount
  
  var responses: `200ContentApplicationjsonDismissalrestrictions422Content8`
}
object RequestBodyContentApplicationjsonRequiredapprovingreviewcount {
  
  inline def apply(
    parameters: PathBranchOwner,
    requestBody: ContentApplicationjsonRequiredapprovingreviewcount,
    responses: `200ContentApplicationjsonDismissalrestrictions422Content8`
  ): RequestBodyContentApplicationjsonRequiredapprovingreviewcount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonRequiredapprovingreviewcount]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonRequiredapprovingreviewcount](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonRequiredapprovingreviewcount): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDismissalrestrictions422Content8`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
