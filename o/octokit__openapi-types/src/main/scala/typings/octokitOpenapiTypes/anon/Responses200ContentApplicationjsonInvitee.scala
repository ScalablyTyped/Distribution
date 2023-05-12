package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonInvitee extends StObject {
  
  var parameters: PathInvitationidOwnerRepo
  
  var requestBody: js.UndefOr[ContentApplicationjson269] = js.undefined
  
  var responses: `200ContentApplicationjsonInvitee`
}
object Responses200ContentApplicationjsonInvitee {
  
  inline def apply(parameters: PathInvitationidOwnerRepo, responses: `200ContentApplicationjsonInvitee`): Responses200ContentApplicationjsonInvitee = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonInvitee]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonInvitee] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathInvitationidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson269): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200ContentApplicationjsonInvitee`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
