package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonKeyidSelectedrepositoryids extends StObject {
  
  var parameters: Path353
  
  var requestBody: ContentApplicationjsonKeyidSelectedrepositoryids
  
  var responses: `201Content40404`
}
object RequestBodyContentApplicationjsonKeyidSelectedrepositoryids {
  
  inline def apply(
    parameters: Path353,
    requestBody: ContentApplicationjsonKeyidSelectedrepositoryids,
    responses: `201Content40404`
  ): RequestBodyContentApplicationjsonKeyidSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonKeyidSelectedrepositoryids]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonKeyidSelectedrepositoryids](x: Self) {
    
    inline def setParameters(value: Path353): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonKeyidSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content40404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
