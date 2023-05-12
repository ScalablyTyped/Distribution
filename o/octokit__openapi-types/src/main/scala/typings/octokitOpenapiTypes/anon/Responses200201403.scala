package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200201403 extends StObject {
  
  var parameters: PathTeamslugString
  
  var requestBody: js.UndefOr[ContentApplicationjsonNotificationsetting] = js.undefined
  
  var responses: `200201403`
}
object Responses200201403 {
  
  inline def apply(parameters: PathTeamslugString, responses: `200201403`): Responses200201403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200201403]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200201403] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTeamslugString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNotificationsetting): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200201403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
