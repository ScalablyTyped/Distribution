package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBody extends StObject {
  
  var parameters: PathGistid
  
  var requestBody: ContentApplicationjsonBody
  
  var responses: `201304403`
}
object RequestBodyContentApplicationjsonBody {
  
  inline def apply(parameters: PathGistid, requestBody: ContentApplicationjsonBody, responses: `201304403`): RequestBodyContentApplicationjsonBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBody]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonBody](x: Self) {
    
    inline def setParameters(value: PathGistid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201304403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
