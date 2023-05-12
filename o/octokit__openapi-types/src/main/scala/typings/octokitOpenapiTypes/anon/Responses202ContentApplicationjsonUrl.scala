package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202ContentApplicationjsonUrl extends StObject {
  
  var parameters: `141`
  
  var requestBody: js.UndefOr[ContentApplicationjson303] = js.undefined
  
  var responses: `202ContentApplicationjsonUrl`
}
object Responses202ContentApplicationjsonUrl {
  
  inline def apply(parameters: `141`, responses: `202ContentApplicationjsonUrl`): Responses202ContentApplicationjsonUrl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202ContentApplicationjsonUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses202ContentApplicationjsonUrl] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson303): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `202ContentApplicationjsonUrl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
