package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses634 extends StObject {
  
  var parameters: `540`
  
  var requestBody: js.UndefOr[ContentApplicationjsonSubscribed] = js.undefined
  
  var responses: `634`
}
object Responses634 {
  
  inline def apply(parameters: `540`, responses: `634`): Responses634 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses634]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses634] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSubscribed): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `634`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
