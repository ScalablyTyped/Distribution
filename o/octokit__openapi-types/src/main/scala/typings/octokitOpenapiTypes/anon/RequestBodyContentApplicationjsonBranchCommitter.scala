package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBranchCommitter extends StObject {
  
  var parameters: `115`
  
  var requestBody: ContentApplicationjsonBranchCommitter
  
  var responses: `200404409`
}
object RequestBodyContentApplicationjsonBranchCommitter {
  
  inline def apply(parameters: `115`, requestBody: ContentApplicationjsonBranchCommitter, responses: `200404409`): RequestBodyContentApplicationjsonBranchCommitter = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBranchCommitter]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonBranchCommitter](x: Self) {
    
    inline def setParameters(value: `115`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBranchCommitter): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200404409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
