package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyResponses202ContentApplicationjsonUrl extends StObject {
  
  var parameters: `639`
  
  var requestBody: js.UndefOr[ContentApplicationjson356] = js.undefined
  
  var responses: `202ContentApplicationjsonUrl`
}
object RequestBodyResponses202ContentApplicationjsonUrl {
  
  inline def apply(parameters: `639`, responses: `202ContentApplicationjsonUrl`): RequestBodyResponses202ContentApplicationjsonUrl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyResponses202ContentApplicationjsonUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyResponses202ContentApplicationjsonUrl] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson356): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `202ContentApplicationjsonUrl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
