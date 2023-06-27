package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content792 extends StObject {
  
  var requestBody: js.UndefOr[ContentApplicationjsonEmails] = js.undefined
  
  var responses: `201Content792`
}
object Responses201Content792 {
  
  inline def apply(responses: `201Content792`): Responses201Content792 = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content792]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201Content792] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonEmails): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `201Content792`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
