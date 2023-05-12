package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonEncoding extends StObject {
  
  var parameters: `141`
  
  var requestBody: ContentApplicationjsonEncoding
  
  var responses: `403404409`
}
object RequestBodyContentApplicationjsonEncoding {
  
  inline def apply(parameters: `141`, requestBody: ContentApplicationjsonEncoding, responses: `403404409`): RequestBodyContentApplicationjsonEncoding = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonEncoding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonEncoding] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEncoding): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
