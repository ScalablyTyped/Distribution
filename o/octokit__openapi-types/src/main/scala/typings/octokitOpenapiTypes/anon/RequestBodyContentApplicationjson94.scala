package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson94 extends StObject {
  
  var parameters: PathBranchOwner
  
  var requestBody: ContentApplicationjson94
  
  var responses: `200Content27404Content6422Content8`
}
object RequestBodyContentApplicationjson94 {
  
  inline def apply(
    parameters: PathBranchOwner,
    requestBody: ContentApplicationjson94,
    responses: `200Content27404Content6422Content8`
  ): RequestBodyContentApplicationjson94 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson94]
  }
  
  extension [Self <: RequestBodyContentApplicationjson94](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson94): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content27404Content6422Content8`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
