package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonLastreadatRead extends StObject {
  
  var requestBody: ContentApplicationjsonLastreadatRead
  
  var responses: `205`
}
object RequestBodyContentApplicationjsonLastreadatRead {
  
  inline def apply(requestBody: ContentApplicationjsonLastreadatRead, responses: `205`): RequestBodyContentApplicationjsonLastreadatRead = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonLastreadatRead]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonLastreadatRead](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonLastreadatRead): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `205`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
