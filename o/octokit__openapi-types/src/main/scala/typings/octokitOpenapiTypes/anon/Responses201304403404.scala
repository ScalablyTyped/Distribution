package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201304403404 extends StObject {
  
  var requestBody: ContentApplicationjsonDescription
  
  var responses: `201304403404`
}
object Responses201304403404 {
  
  inline def apply(requestBody: ContentApplicationjsonDescription, responses: `201304403404`): Responses201304403404 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201304403404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201304403404] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonDescription): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201304403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
