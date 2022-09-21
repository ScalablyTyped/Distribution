package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonRecentfolders extends StObject {
  
  var parameters: Path369
  
  var requestBody: ContentApplicationjsonRecentfolders
  
  var responses: `200Content93`
}
object RequestBodyContentApplicationjsonRecentfolders {
  
  inline def apply(parameters: Path369, requestBody: ContentApplicationjsonRecentfolders, responses: `200Content93`): RequestBodyContentApplicationjsonRecentfolders = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonRecentfolders]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonRecentfolders](x: Self) {
    
    inline def setParameters(value: Path369): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonRecentfolders): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content93`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
