package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200201 extends StObject {
  
  var parameters: PathTeamslug
  
  var requestBody: js.UndefOr[ContentApplicationjsonNotificationsetting] = js.undefined
  
  var responses: `200201`
}
object Responses200201 {
  
  inline def apply(parameters: PathTeamslug, responses: `200201`): Responses200201 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200201]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200201] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNotificationsetting): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200201`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
