package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200307 extends StObject {
  
  var parameters: `165`
  
  var requestBody: js.UndefOr[ContentApplicationjsonAllowforking] = js.undefined
  
  var responses: `200307`
}
object Responses200307 {
  
  inline def apply(parameters: `165`, responses: `200307`): Responses200307 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200307]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200307] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAllowforking): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200307`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
