package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses354 extends StObject {
  
  var parameters: `141`
  
  var requestBody: js.UndefOr[ContentApplicationjsonSubscribed] = js.undefined
  
  var responses: `354`
}
object Responses354 {
  
  inline def apply(parameters: `141`, responses: `354`): Responses354 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses354]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses354] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSubscribed): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `354`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
