package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonPatids extends StObject {
  
  var parameters: `47`
  
  var requestBody: ContentApplicationjsonPatids
  
  var responses: `202403`
}
object RequestBodyContentApplicationjsonPatids {
  
  inline def apply(parameters: `47`, requestBody: ContentApplicationjsonPatids, responses: `202403`): RequestBodyContentApplicationjsonPatids = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonPatids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonPatids] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `47`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPatids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
