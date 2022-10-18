package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonChecksContexts extends StObject {
  
  var parameters: PathBranchOwner
  
  var requestBody: ContentApplicationjsonChecksContexts
  
  var responses: `200ContentApplicationjsonContexts404Content6`
}
object RequestBodyContentApplicationjsonChecksContexts {
  
  inline def apply(
    parameters: PathBranchOwner,
    requestBody: ContentApplicationjsonChecksContexts,
    responses: `200ContentApplicationjsonContexts404Content6`
  ): RequestBodyContentApplicationjsonChecksContexts = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonChecksContexts]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonChecksContexts](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonChecksContexts): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonContexts404Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
