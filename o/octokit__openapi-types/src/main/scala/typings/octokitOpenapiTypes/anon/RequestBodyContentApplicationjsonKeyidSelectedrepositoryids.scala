package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonKeyidSelectedrepositoryids extends StObject {
  
  var parameters: PathSecretname
  
  var requestBody: ContentApplicationjsonKeyidSelectedrepositoryids
  
  var responses: `201Content4`
}
object RequestBodyContentApplicationjsonKeyidSelectedrepositoryids {
  
  inline def apply(
    parameters: PathSecretname,
    requestBody: ContentApplicationjsonKeyidSelectedrepositoryids,
    responses: `201Content4`
  ): RequestBodyContentApplicationjsonKeyidSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonKeyidSelectedrepositoryids]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonKeyidSelectedrepositoryids](x: Self) {
    
    inline def setParameters(value: PathSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonKeyidSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content4`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
