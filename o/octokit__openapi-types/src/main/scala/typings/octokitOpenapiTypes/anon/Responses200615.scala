package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200615 extends StObject {
  
  var parameters: PathPullnumberRepo
  
  var requestBody: js.UndefOr[ContentApplicationjsonMaintainercanmodify] = js.undefined
  
  var responses: `200615`
}
object Responses200615 {
  
  inline def apply(parameters: PathPullnumberRepo, responses: `200615`): Responses200615 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200615]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200615] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumberRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonMaintainercanmodify): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200615`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
