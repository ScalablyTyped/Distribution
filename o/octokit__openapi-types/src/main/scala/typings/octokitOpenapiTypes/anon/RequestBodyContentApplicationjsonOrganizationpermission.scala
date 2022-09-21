package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonOrganizationpermission extends StObject {
  
  var parameters: Path139
  
  var requestBody: ContentApplicationjsonOrganizationpermission
  
  var responses: `410422`
}
object RequestBodyContentApplicationjsonOrganizationpermission {
  
  inline def apply(
    parameters: Path139,
    requestBody: ContentApplicationjsonOrganizationpermission,
    responses: `410422`
  ): RequestBodyContentApplicationjsonOrganizationpermission = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonOrganizationpermission]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonOrganizationpermission](x: Self) {
    
    inline def setParameters(value: Path139): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonOrganizationpermission): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `410422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
