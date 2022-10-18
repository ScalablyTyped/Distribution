package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content442404 extends StObject {
  
  var parameters: PathBranchOwnerRepo
  
  var requestBody: ContentApplicationjsonChecksContexts
  
  var responses: `200Content442404`
}
object Responses200Content442404 {
  
  inline def apply(
    parameters: PathBranchOwnerRepo,
    requestBody: ContentApplicationjsonChecksContexts,
    responses: `200Content442404`
  ): Responses200Content442404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content442404]
  }
  
  extension [Self <: Responses200Content442404](x: Self) {
    
    inline def setParameters(value: PathBranchOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonChecksContexts): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content442404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
