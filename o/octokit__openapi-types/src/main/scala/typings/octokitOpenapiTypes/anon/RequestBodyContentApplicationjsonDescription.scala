package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonDescription extends StObject {
  
  var requestBody: ContentApplicationjsonDescription
  
  var responses: `201304`
}
object RequestBodyContentApplicationjsonDescription {
  
  inline def apply(requestBody: ContentApplicationjsonDescription, responses: `201304`): RequestBodyContentApplicationjsonDescription = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonDescription] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonDescription): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
