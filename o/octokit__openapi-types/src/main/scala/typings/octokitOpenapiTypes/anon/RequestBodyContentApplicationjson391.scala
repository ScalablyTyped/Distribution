package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson391 extends StObject {
  
  var parameters: PathReleaseid
  
  var requestBody: ContentApplicationjson391
  
  var responses: `200201422`
}
object RequestBodyContentApplicationjson391 {
  
  inline def apply(parameters: PathReleaseid, requestBody: ContentApplicationjson391, responses: `200201422`): RequestBodyContentApplicationjson391 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson391]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjson391] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathReleaseid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson391): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200201422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
