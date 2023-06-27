package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonLabels extends StObject {
  
  var parameters: `55`
  
  var requestBody: ContentApplicationjsonLabels
  
  var responses: `201404`
}
object RequestBodyContentApplicationjsonLabels {
  
  inline def apply(parameters: `55`, requestBody: ContentApplicationjsonLabels, responses: `201404`): RequestBodyContentApplicationjsonLabels = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonLabels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonLabels] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `55`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonLabels): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
