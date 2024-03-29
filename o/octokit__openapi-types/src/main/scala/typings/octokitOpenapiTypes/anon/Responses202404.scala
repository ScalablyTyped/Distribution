package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202404 extends StObject {
  
  var parameters: PathUsername
  
  var requestBody: js.UndefOr[ContentApplicationjsonAsync] = js.undefined
  
  var responses: `202404`
}
object Responses202404 {
  
  inline def apply(parameters: PathUsername, responses: `202404`): Responses202404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses202404] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAsync): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `202404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
