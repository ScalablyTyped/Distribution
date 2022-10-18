package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonNamePermissions extends StObject {
  
  var parameters: PathRoleid
  
  var requestBody: ContentApplicationjsonNamePermissions
  
  var responses: `200ContentApplicationjsonBaseroleCreatedat`
}
object RequestBodyContentApplicationjsonNamePermissions {
  
  inline def apply(
    parameters: PathRoleid,
    requestBody: ContentApplicationjsonNamePermissions,
    responses: `200ContentApplicationjsonBaseroleCreatedat`
  ): RequestBodyContentApplicationjsonNamePermissions = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonNamePermissions]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonNamePermissions](x: Self) {
    
    inline def setParameters(value: PathRoleid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNamePermissions): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBaseroleCreatedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
