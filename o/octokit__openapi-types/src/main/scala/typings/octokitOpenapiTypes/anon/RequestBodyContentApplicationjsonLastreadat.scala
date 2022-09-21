package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonLastreadat extends StObject {
  
  var requestBody: ContentApplicationjsonLastreadat
  
  var responses: `205`
}
object RequestBodyContentApplicationjsonLastreadat {
  
  inline def apply(requestBody: ContentApplicationjsonLastreadat, responses: `205`): RequestBodyContentApplicationjsonLastreadat = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonLastreadat]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonLastreadat](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonLastreadat): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `205`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
