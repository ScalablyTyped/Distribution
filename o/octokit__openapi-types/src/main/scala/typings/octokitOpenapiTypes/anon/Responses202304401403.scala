package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202304401403 extends StObject {
  
  var requestBody: js.UndefOr[ContentApplicationjsonLastreadat] = js.undefined
  
  var responses: `202304401403`
}
object Responses202304401403 {
  
  inline def apply(responses: `202304401403`): Responses202304401403 = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202304401403]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses202304401403] (val x: Self) extends AnyVal {
    
    inline def setRequestBody(value: ContentApplicationjsonLastreadat): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `202304401403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
