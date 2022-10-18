package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonPublic extends StObject {
  
  var requestBody: ContentApplicationjsonPublic
  
  var responses: `201304`
}
object RequestBodyContentApplicationjsonPublic {
  
  inline def apply(requestBody: ContentApplicationjsonPublic, responses: `201304`): RequestBodyContentApplicationjsonPublic = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonPublic]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonPublic](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonPublic): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
