package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAccesstokenPermissions extends StObject {
  
  var parameters: Path238
  
  var requestBody: ContentApplicationjsonAccesstokenPermissions
  
  var responses: `200401403404422`
}
object RequestBodyContentApplicationjsonAccesstokenPermissions {
  
  inline def apply(
    parameters: Path238,
    requestBody: ContentApplicationjsonAccesstokenPermissions,
    responses: `200401403404422`
  ): RequestBodyContentApplicationjsonAccesstokenPermissions = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAccesstokenPermissions]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonAccesstokenPermissions](x: Self) {
    
    inline def setParameters(value: Path238): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAccesstokenPermissions): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200401403404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
