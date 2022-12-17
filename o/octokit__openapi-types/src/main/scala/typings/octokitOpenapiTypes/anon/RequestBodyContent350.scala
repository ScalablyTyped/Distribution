package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent350 extends StObject {
  
  var requestBody: Content350
  
  var responses: `202401`
}
object RequestBodyContent350 {
  
  inline def apply(requestBody: Content350, responses: `202401`): RequestBodyContent350 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent350]
  }
  
  extension [Self <: RequestBodyContent350](x: Self) {
    
    inline def setRequestBody(value: Content350): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
