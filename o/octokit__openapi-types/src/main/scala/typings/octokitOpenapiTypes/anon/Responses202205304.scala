package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202205304 extends StObject {
  
  var requestBody: ContentApplicationjsonLastreadat
  
  var responses: `202205304`
}
object Responses202205304 {
  
  inline def apply(requestBody: ContentApplicationjsonLastreadat, responses: `202205304`): Responses202205304 = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202205304]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses202205304] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonLastreadat): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202205304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
