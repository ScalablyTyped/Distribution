package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson191 extends StObject {
  
  var parameters: PathRepoSecretname
  
  var requestBody: ContentApplicationjson191
  
  var responses: `201Content63`
}
object RequestBodyContentApplicationjson191 {
  
  inline def apply(parameters: PathRepoSecretname, requestBody: ContentApplicationjson191, responses: `201Content63`): RequestBodyContentApplicationjson191 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson191]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjson191] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson191): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content63`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
