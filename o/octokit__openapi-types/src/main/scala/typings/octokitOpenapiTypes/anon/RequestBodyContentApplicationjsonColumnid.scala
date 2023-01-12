package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonColumnid extends StObject {
  
  var parameters: PathCardid
  
  var requestBody: ContentApplicationjsonColumnid
  
  var responses: `422503`
}
object RequestBodyContentApplicationjsonColumnid {
  
  inline def apply(parameters: PathCardid, requestBody: ContentApplicationjsonColumnid, responses: `422503`): RequestBodyContentApplicationjsonColumnid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonColumnid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonColumnid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCardid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonColumnid): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
