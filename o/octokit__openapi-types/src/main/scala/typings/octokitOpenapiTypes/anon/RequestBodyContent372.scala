package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent372 extends StObject {
  
  var requestBody: Content372
  
  var responses: `202401`
}
object RequestBodyContent372 {
  
  inline def apply(requestBody: Content372, responses: `202401`): RequestBodyContent372 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent372]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent372] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: Content372): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
