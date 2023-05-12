package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content115 extends StObject {
  
  var parameters: PathDiscussionnumber
  
  var requestBody: js.UndefOr[ContentApplicationjsonTitle] = js.undefined
  
  var responses: `200Content115`
}
object Responses200Content115 {
  
  inline def apply(parameters: PathDiscussionnumber, responses: `200Content115`): Responses200Content115 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content115]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content115] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDiscussionnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonTitle): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200Content115`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
