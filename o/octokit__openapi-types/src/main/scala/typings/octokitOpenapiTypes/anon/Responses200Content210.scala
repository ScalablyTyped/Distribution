package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content210 extends StObject {
  
  var parameters: PathInvitationidOwner
  
  var requestBody: js.UndefOr[ContentApplicationjson269] = js.undefined
  
  var responses: `200Content210`
}
object Responses200Content210 {
  
  inline def apply(parameters: PathInvitationidOwner, responses: `200Content210`): Responses200Content210 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content210]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content210] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathInvitationidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson269): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200Content210`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
