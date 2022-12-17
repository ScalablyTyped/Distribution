package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBio extends StObject {
  
  var requestBody: ContentApplicationjsonBio
  
  var responses: `200Content347`
}
object RequestBodyContentApplicationjsonBio {
  
  inline def apply(requestBody: ContentApplicationjsonBio, responses: `200Content347`): RequestBodyContentApplicationjsonBio = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBio]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonBio](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonBio): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content347`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
