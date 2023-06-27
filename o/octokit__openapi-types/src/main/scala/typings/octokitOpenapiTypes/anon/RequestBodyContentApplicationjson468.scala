package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson468 extends StObject {
  
  var parameters: `55`
  
  var requestBody: ContentApplicationjson468
  
  var responses: `200Content104403`
}
object RequestBodyContentApplicationjson468 {
  
  inline def apply(parameters: `55`, requestBody: ContentApplicationjson468, responses: `200Content104403`): RequestBodyContentApplicationjson468 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson468]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjson468] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `55`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson468): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content104403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
