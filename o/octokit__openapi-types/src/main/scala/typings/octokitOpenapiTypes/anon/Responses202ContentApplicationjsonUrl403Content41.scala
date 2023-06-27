package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202ContentApplicationjsonUrl403Content41 extends StObject {
  
  var parameters: PathPullnumberRepo
  
  var requestBody: js.UndefOr[Content382] = js.undefined
  
  var responses: `202ContentApplicationjsonUrl403Content41`
}
object Responses202ContentApplicationjsonUrl403Content41 {
  
  inline def apply(parameters: PathPullnumberRepo, responses: `202ContentApplicationjsonUrl403Content41`): Responses202ContentApplicationjsonUrl403Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202ContentApplicationjsonUrl403Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses202ContentApplicationjsonUrl403Content41] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumberRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content382): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `202ContentApplicationjsonUrl403Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
