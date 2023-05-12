package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyResponses extends StObject {
  
  var parameters: PathClientid
  
  var requestBody: ContentApplicationjsonAccesstoken
  
  var responses: `9`
}
object RequestBodyResponses {
  
  inline def apply(parameters: PathClientid, requestBody: ContentApplicationjsonAccesstoken, responses: `9`): RequestBodyResponses = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyResponses] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathClientid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAccesstoken): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `9`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
