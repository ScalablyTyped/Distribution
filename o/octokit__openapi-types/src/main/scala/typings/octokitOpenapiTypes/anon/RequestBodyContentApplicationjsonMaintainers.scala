package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonMaintainers extends StObject {
  
  var parameters: PathOrg
  
  var requestBody: ContentApplicationjsonMaintainers
  
  var responses: `201Content114`
}
object RequestBodyContentApplicationjsonMaintainers {
  
  inline def apply(parameters: PathOrg, requestBody: ContentApplicationjsonMaintainers, responses: `201Content114`): RequestBodyContentApplicationjsonMaintainers = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonMaintainers]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonMaintainers](x: Self) {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonMaintainers): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content114`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
