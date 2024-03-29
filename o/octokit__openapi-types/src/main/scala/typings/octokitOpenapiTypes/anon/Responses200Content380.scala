package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content380 extends StObject {
  
  var parameters: PathPullnumber
  
  var requestBody: js.UndefOr[ContentApplicationjsonComments] = js.undefined
  
  var responses: `200Content380`
}
object Responses200Content380 {
  
  inline def apply(parameters: PathPullnumber, responses: `200Content380`): Responses200Content380 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content380]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content380] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonComments): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200Content380`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
