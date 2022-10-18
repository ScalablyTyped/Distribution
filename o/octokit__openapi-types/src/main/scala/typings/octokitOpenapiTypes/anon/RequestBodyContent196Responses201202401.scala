package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent196Responses201202401 extends StObject {
  
  var requestBody: Content196
  
  var responses: `201202401`
}
object RequestBodyContent196Responses201202401 {
  
  inline def apply(requestBody: Content196, responses: `201202401`): RequestBodyContent196Responses201202401 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent196Responses201202401]
  }
  
  extension [Self <: RequestBodyContent196Responses201202401](x: Self) {
    
    inline def setRequestBody(value: Content196): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201202401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
