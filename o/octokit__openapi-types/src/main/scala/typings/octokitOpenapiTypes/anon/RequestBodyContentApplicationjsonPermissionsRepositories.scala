package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonPermissionsRepositories extends StObject {
  
  var parameters: Path234
  
  var requestBody: ContentApplicationjsonPermissionsRepositories
  
  var responses: `201401`
}
object RequestBodyContentApplicationjsonPermissionsRepositories {
  
  inline def apply(
    parameters: Path234,
    requestBody: ContentApplicationjsonPermissionsRepositories,
    responses: `201401`
  ): RequestBodyContentApplicationjsonPermissionsRepositories = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonPermissionsRepositories]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonPermissionsRepositories](x: Self) {
    
    inline def setParameters(value: Path234): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPermissionsRepositories): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
