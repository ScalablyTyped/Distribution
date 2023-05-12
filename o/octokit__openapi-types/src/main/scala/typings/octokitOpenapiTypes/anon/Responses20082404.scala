package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses20082404 extends StObject {
  
  var parameters: PathHookid
  
  var requestBody: js.UndefOr[ContentApplicationjsonConfig] = js.undefined
  
  var responses: `20082404`
}
object Responses20082404 {
  
  inline def apply(parameters: PathHookid, responses: `20082404`): Responses20082404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses20082404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses20082404] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathHookid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonConfig): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `20082404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
