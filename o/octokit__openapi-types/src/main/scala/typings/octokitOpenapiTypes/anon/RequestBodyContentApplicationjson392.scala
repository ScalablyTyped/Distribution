package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson392 extends StObject {
  
  var parameters: `47`
  
  var requestBody: ContentApplicationjson392
  
  var responses: `200Content90403`
}
object RequestBodyContentApplicationjson392 {
  
  inline def apply(parameters: `47`, requestBody: ContentApplicationjson392, responses: `200Content90403`): RequestBodyContentApplicationjson392 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson392]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjson392] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `47`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson392): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content90403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
