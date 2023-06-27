package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonIsalphanumeric extends StObject {
  
  var parameters: `165`
  
  var requestBody: ContentApplicationjsonIsalphanumeric
  
  var responses: `201Content199`
}
object RequestBodyContentApplicationjsonIsalphanumeric {
  
  inline def apply(parameters: `165`, requestBody: ContentApplicationjsonIsalphanumeric, responses: `201Content199`): RequestBodyContentApplicationjsonIsalphanumeric = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonIsalphanumeric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonIsalphanumeric] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonIsalphanumeric): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content199`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
