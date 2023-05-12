package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content89 extends StObject {
  
  var parameters: Path378
  
  var requestBody: js.UndefOr[ContentApplicationjsonRecentfolders] = js.undefined
  
  var responses: `200Content89`
}
object Responses200Content89 {
  
  inline def apply(parameters: Path378, responses: `200Content89`): Responses200Content89 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content89]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content89] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path378): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonRecentfolders): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200Content89`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
