package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200403422 extends StObject {
  
  var parameters: PathUsername
  
  var requestBody: js.UndefOr[ContentApplicationjson91] = js.undefined
  
  var responses: `200403422`
}
object Responses200403422 {
  
  inline def apply(parameters: PathUsername, responses: `200403422`): Responses200403422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200403422]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200403422] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson91): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200403422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
