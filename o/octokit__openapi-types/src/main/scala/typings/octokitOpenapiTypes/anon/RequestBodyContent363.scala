package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent363 extends StObject {
  
  var requestBody: Content363
  
  var responses: `202401`
}
object RequestBodyContent363 {
  
  inline def apply(requestBody: Content363, responses: `202401`): RequestBodyContent363 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent363]
  }
  
  extension [Self <: RequestBodyContent363](x: Self) {
    
    inline def setRequestBody(value: Content363): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
