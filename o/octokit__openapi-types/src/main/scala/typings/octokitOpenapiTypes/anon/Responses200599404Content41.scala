package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200599404Content41 extends StObject {
  
  var parameters: PathHookidOrg
  
  var requestBody: js.UndefOr[ContentApplicationjsonEventsName] = js.undefined
  
  var responses: `200599404Content41`
}
object Responses200599404Content41 {
  
  inline def apply(parameters: PathHookidOrg, responses: `200599404Content41`): Responses200599404Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200599404Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200599404Content41] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathHookidOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEventsName): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200599404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
