package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonInvitationteamsurl extends StObject {
  
  var parameters: `582`
  
  var requestBody: js.UndefOr[ContentApplicationjsonEmail] = js.undefined
  
  var responses: `201ContentApplicationjsonInvitationteamsurl`
}
object Responses201ContentApplicationjsonInvitationteamsurl {
  
  inline def apply(parameters: `582`, responses: `201ContentApplicationjsonInvitationteamsurl`): Responses201ContentApplicationjsonInvitationteamsurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonInvitationteamsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonInvitationteamsurl] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `582`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEmail): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `201ContentApplicationjsonInvitationteamsurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
