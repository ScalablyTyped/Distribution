package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBodyString extends StObject {
  
  var parameters: PathGistid
  
  var requestBody: ContentApplicationjsonBodyString
  
  var responses: `201304403`
}
object RequestBodyContentApplicationjsonBodyString {
  
  inline def apply(parameters: PathGistid, requestBody: ContentApplicationjsonBodyString, responses: `201304403`): RequestBodyContentApplicationjsonBodyString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBodyString]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonBodyString](x: Self) {
    
    inline def setParameters(value: PathGistid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201304403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
