package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonSelectedrepositoryids extends StObject {
  
  var parameters: PathSecretname
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
  
  var responses: `409`
}
object RequestBodyContentApplicationjsonSelectedrepositoryids {
  
  inline def apply(
    parameters: PathSecretname,
    requestBody: ContentApplicationjsonSelectedrepositoryids,
    responses: `409`
  ): RequestBodyContentApplicationjsonSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonSelectedrepositoryids]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonSelectedrepositoryids](x: Self) {
    
    inline def setParameters(value: PathSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
