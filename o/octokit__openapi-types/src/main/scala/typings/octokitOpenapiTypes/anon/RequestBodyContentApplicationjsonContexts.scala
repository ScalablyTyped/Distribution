package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonContexts extends StObject {
  
  var parameters: PathBranch
  
  var requestBody: ContentApplicationjsonContexts
  
  var responses: `200Content177404`
}
object RequestBodyContentApplicationjsonContexts {
  
  inline def apply(parameters: PathBranch, requestBody: ContentApplicationjsonContexts, responses: `200Content177404`): RequestBodyContentApplicationjsonContexts = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonContexts]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonContexts](x: Self) {
    
    inline def setParameters(value: PathBranch): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonContexts): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content177404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
