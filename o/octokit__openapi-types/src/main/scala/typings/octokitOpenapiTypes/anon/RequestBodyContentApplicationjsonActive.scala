package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonActive extends StObject {
  
  var parameters: PathOrg
  
  var requestBody: ContentApplicationjsonActive
  
  var responses: `201404422`
}
object RequestBodyContentApplicationjsonActive {
  
  inline def apply(parameters: PathOrg, requestBody: ContentApplicationjsonActive, responses: `201404422`): RequestBodyContentApplicationjsonActive = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonActive]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonActive](x: Self) {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonActive): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
