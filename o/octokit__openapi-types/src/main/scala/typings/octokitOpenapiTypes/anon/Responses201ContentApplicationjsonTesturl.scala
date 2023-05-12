package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonTesturl extends StObject {
  
  var parameters: `540`
  
  var requestBody: js.UndefOr[Content587] = js.undefined
  
  var responses: `201ContentApplicationjsonTesturl`
}
object Responses201ContentApplicationjsonTesturl {
  
  inline def apply(parameters: `540`, responses: `201ContentApplicationjsonTesturl`): Responses201ContentApplicationjsonTesturl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonTesturl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonTesturl] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content587): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `201ContentApplicationjsonTesturl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
