package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonIgnored extends StObject {
  
  var parameters: PathThreadid
  
  var requestBody: ContentApplicationjsonIgnored
  
  var responses: `200304401403`
}
object RequestBodyContentApplicationjsonIgnored {
  
  inline def apply(parameters: PathThreadid, requestBody: ContentApplicationjsonIgnored, responses: `200304401403`): RequestBodyContentApplicationjsonIgnored = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonIgnored]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonIgnored](x: Self) {
    
    inline def setParameters(value: PathThreadid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonIgnored): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304401403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
