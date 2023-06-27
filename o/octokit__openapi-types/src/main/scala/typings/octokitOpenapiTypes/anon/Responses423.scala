package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses423 extends StObject {
  
  var parameters: `165`
  
  var requestBody: js.UndefOr[ContentApplicationjsonSubscribed] = js.undefined
  
  var responses: `423`
}
object Responses423 {
  
  inline def apply(parameters: `165`, responses: `423`): Responses423 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses423]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses423] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSubscribed): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `423`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
