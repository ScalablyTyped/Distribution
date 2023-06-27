package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent447Responses201202401 extends StObject {
  
  var requestBody: Content447
  
  var responses: `201202401`
}
object RequestBodyContent447Responses201202401 {
  
  inline def apply(requestBody: Content447, responses: `201202401`): RequestBodyContent447Responses201202401 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent447Responses201202401]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent447Responses201202401] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: Content447): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201202401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
