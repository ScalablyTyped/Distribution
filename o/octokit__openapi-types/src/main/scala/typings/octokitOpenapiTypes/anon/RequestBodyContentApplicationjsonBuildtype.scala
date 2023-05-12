package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBuildtype extends StObject {
  
  var parameters: `141`
  
  var requestBody: ContentApplicationjsonBuildtype
  
  var responses: `400409`
}
object RequestBodyContentApplicationjsonBuildtype {
  
  inline def apply(parameters: `141`, requestBody: ContentApplicationjsonBuildtype, responses: `400409`): RequestBodyContentApplicationjsonBuildtype = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBuildtype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonBuildtype] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBuildtype): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
