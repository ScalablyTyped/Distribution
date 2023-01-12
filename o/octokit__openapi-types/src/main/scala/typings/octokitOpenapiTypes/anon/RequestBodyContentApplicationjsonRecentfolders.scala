package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonRecentfolders extends StObject {
  
  var parameters: Path356
  
  var requestBody: ContentApplicationjsonRecentfolders
  
  var responses: `200Content85`
}
object RequestBodyContentApplicationjsonRecentfolders {
  
  inline def apply(parameters: Path356, requestBody: ContentApplicationjsonRecentfolders, responses: `200Content85`): RequestBodyContentApplicationjsonRecentfolders = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonRecentfolders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonRecentfolders] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path356): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonRecentfolders): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content85`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
