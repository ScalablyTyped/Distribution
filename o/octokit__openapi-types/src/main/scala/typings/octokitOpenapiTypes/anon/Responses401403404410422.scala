package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses401403404410422 extends StObject {
  
  var parameters: PathProjectidNumber
  
  var requestBody: ContentApplicationjsonOrganizationpermission
  
  var responses: `401403404410422`
}
object Responses401403404410422 {
  
  inline def apply(
    parameters: PathProjectidNumber,
    requestBody: ContentApplicationjsonOrganizationpermission,
    responses: `401403404410422`
  ): Responses401403404410422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses401403404410422]
  }
  
  extension [Self <: Responses401403404410422](x: Self) {
    
    inline def setParameters(value: PathProjectidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonOrganizationpermission): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401403404410422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
