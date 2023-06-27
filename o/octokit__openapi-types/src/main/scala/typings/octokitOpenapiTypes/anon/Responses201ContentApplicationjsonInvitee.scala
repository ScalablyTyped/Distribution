package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonInvitee extends StObject {
  
  var parameters: PathOwnerRepoUsername
  
  var requestBody: js.UndefOr[ContentApplicationjson151] = js.undefined
  
  var responses: `201ContentApplicationjsonInvitee`
}
object Responses201ContentApplicationjsonInvitee {
  
  inline def apply(parameters: PathOwnerRepoUsername, responses: `201ContentApplicationjsonInvitee`): Responses201ContentApplicationjsonInvitee = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonInvitee]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonInvitee] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRepoUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson151): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `201ContentApplicationjsonInvitee`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
