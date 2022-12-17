package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent350Responses201202401 extends StObject {
  
  var requestBody: Content350
  
  var responses: `201202401`
}
object RequestBodyContent350Responses201202401 {
  
  inline def apply(requestBody: Content350, responses: `201202401`): RequestBodyContent350Responses201202401 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent350Responses201202401]
  }
  
  extension [Self <: RequestBodyContent350Responses201202401](x: Self) {
    
    inline def setRequestBody(value: Content350): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201202401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
