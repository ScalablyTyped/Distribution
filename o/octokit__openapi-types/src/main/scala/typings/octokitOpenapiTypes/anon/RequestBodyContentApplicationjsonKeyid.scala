package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonKeyid extends StObject {
  
  var parameters: PathSecretname
  
  var requestBody: ContentApplicationjsonKeyid
  
  var responses: `201Content60`
}
object RequestBodyContentApplicationjsonKeyid {
  
  inline def apply(parameters: PathSecretname, requestBody: ContentApplicationjsonKeyid, responses: `201Content60`): RequestBodyContentApplicationjsonKeyid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonKeyid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonKeyid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonKeyid): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content60`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
