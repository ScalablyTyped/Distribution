package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAllowautomerge extends StObject {
  
  var parameters: `55`
  
  var requestBody: ContentApplicationjsonAllowautomerge
  
  var responses: `201403422`
}
object RequestBodyContentApplicationjsonAllowautomerge {
  
  inline def apply(parameters: `55`, requestBody: ContentApplicationjsonAllowautomerge, responses: `201403422`): RequestBodyContentApplicationjsonAllowautomerge = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAllowautomerge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonAllowautomerge] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `55`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAllowautomerge): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201403422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
