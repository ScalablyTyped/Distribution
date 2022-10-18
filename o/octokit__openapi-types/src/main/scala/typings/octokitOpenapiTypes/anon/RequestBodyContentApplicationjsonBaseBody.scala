package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBaseBody extends StObject {
  
  var parameters: PathPullnumber
  
  var requestBody: ContentApplicationjsonBaseBody
  
  var responses: `200169`
}
object RequestBodyContentApplicationjsonBaseBody {
  
  inline def apply(parameters: PathPullnumber, requestBody: ContentApplicationjsonBaseBody, responses: `200169`): RequestBodyContentApplicationjsonBaseBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBaseBody]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonBaseBody](x: Self) {
    
    inline def setParameters(value: PathPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBaseBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200169`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
