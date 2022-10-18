package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonNameOrganizationpermission extends StObject {
  
  var parameters: PathProjectidNumber
  
  var requestBody: ContentApplicationjsonNameOrganizationpermission
  
  var responses: `410422`
}
object RequestBodyContentApplicationjsonNameOrganizationpermission {
  
  inline def apply(
    parameters: PathProjectidNumber,
    requestBody: ContentApplicationjsonNameOrganizationpermission,
    responses: `410422`
  ): RequestBodyContentApplicationjsonNameOrganizationpermission = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonNameOrganizationpermission]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonNameOrganizationpermission](x: Self) {
    
    inline def setParameters(value: PathProjectidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNameOrganizationpermission): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `410422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
