package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200HeadersContentType extends StObject {
  
  var requestBody: ContentApplicationjsonContext
  
  var responses: `200HeadersContentType`
}
object Responses200HeadersContentType {
  
  inline def apply(requestBody: ContentApplicationjsonContext, responses: `200HeadersContentType`): Responses200HeadersContentType = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200HeadersContentType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200HeadersContentType] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonContext): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200HeadersContentType`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
