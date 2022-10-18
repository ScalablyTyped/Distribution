package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent196 extends StObject {
  
  var requestBody: Content196
  
  var responses: `202401`
}
object RequestBodyContent196 {
  
  inline def apply(requestBody: Content196, responses: `202401`): RequestBodyContent196 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent196]
  }
  
  extension [Self <: RequestBodyContent196](x: Self) {
    
    inline def setRequestBody(value: Content196): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
