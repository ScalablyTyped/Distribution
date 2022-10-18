package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson88 extends StObject {
  
  var parameters: PathRepoSecretname
  
  var requestBody: ContentApplicationjson88
  
  var responses: `201Content4`
}
object RequestBodyContentApplicationjson88 {
  
  inline def apply(parameters: PathRepoSecretname, requestBody: ContentApplicationjson88, responses: `201Content4`): RequestBodyContentApplicationjson88 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson88]
  }
  
  extension [Self <: RequestBodyContentApplicationjson88](x: Self) {
    
    inline def setParameters(value: PathRepoSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson88): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content4`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
