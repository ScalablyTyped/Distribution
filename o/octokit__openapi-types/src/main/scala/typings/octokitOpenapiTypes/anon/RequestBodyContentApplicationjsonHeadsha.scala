package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonHeadsha extends StObject {
  
  var parameters: `165`
  
  var requestBody: ContentApplicationjsonHeadsha
  
  var responses: `200Content220`
}
object RequestBodyContentApplicationjsonHeadsha {
  
  inline def apply(parameters: `165`, requestBody: ContentApplicationjsonHeadsha, responses: `200Content220`): RequestBodyContentApplicationjsonHeadsha = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonHeadsha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonHeadsha] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonHeadsha): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content220`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
