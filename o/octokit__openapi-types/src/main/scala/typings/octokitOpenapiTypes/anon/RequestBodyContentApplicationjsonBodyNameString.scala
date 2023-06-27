package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBodyNameString extends StObject {
  
  var requestBody: ContentApplicationjsonBodyNameString
  
  var responses: `201Content121`
}
object RequestBodyContentApplicationjsonBodyNameString {
  
  inline def apply(requestBody: ContentApplicationjsonBodyNameString, responses: `201Content121`): RequestBodyContentApplicationjsonBodyNameString = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBodyNameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonBodyNameString] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonBodyNameString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content121`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
