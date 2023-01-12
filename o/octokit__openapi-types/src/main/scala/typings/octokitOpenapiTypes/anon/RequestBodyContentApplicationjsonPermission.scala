package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonPermission extends StObject {
  
  var parameters: PathProjectidTeamid
  
  var requestBody: ContentApplicationjsonPermission
  
  var responses: `403ContentApplicationjsonDocumentationurl404`
}
object RequestBodyContentApplicationjsonPermission {
  
  inline def apply(
    parameters: PathProjectidTeamid,
    requestBody: ContentApplicationjsonPermission,
    responses: `403ContentApplicationjsonDocumentationurl404`
  ): RequestBodyContentApplicationjsonPermission = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonPermission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonPermission] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathProjectidTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPermission): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403ContentApplicationjsonDocumentationurl404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
