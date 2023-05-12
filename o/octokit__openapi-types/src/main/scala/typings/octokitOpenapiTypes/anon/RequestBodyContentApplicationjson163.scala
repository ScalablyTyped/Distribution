package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson163 extends StObject {
  
  var parameters: PathRepoSecretname
  
  var requestBody: ContentApplicationjson163
  
  var responses: `201Content55`
}
object RequestBodyContentApplicationjson163 {
  
  inline def apply(parameters: PathRepoSecretname, requestBody: ContentApplicationjson163, responses: `201Content55`): RequestBodyContentApplicationjson163 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson163]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjson163] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson163): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
