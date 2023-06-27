package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonObject extends StObject {
  
  var parameters: `165`
  
  var requestBody: ContentApplicationjsonObject
  
  var responses: `201Content295`
}
object RequestBodyContentApplicationjsonObject {
  
  inline def apply(parameters: `165`, requestBody: ContentApplicationjsonObject, responses: `201Content295`): RequestBodyContentApplicationjsonObject = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonObject] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonObject): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content295`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
