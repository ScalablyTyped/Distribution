package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses766 extends StObject {
  
  var parameters: `639`
  
  var requestBody: js.UndefOr[ContentApplicationjsonSubscribed] = js.undefined
  
  var responses: `766`
}
object Responses766 {
  
  inline def apply(parameters: `639`, responses: `766`): Responses766 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses766]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses766] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSubscribed): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `766`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
