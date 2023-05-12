package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonObject extends StObject {
  
  var parameters: `141`
  
  var requestBody: ContentApplicationjsonObject
  
  var responses: `201Content251`
}
object RequestBodyContentApplicationjsonObject {
  
  inline def apply(parameters: `141`, requestBody: ContentApplicationjsonObject, responses: `201Content251`): RequestBodyContentApplicationjsonObject = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonObject] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonObject): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content251`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
