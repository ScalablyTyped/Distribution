package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202ContentApplicationjsonUrl403Content36 extends StObject {
  
  var parameters: PathPullnumberRepo
  
  var requestBody: js.UndefOr[Content327] = js.undefined
  
  var responses: `202ContentApplicationjsonUrl403Content36`
}
object Responses202ContentApplicationjsonUrl403Content36 {
  
  inline def apply(parameters: PathPullnumberRepo, responses: `202ContentApplicationjsonUrl403Content36`): Responses202ContentApplicationjsonUrl403Content36 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202ContentApplicationjsonUrl403Content36]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses202ContentApplicationjsonUrl403Content36] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumberRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content327): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `202ContentApplicationjsonUrl403Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
