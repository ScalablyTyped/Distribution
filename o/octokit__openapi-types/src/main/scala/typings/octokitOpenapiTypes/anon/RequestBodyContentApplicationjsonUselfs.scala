package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonUselfs extends StObject {
  
  var parameters: `165`
  
  var requestBody: ContentApplicationjsonUselfs
  
  var responses: `200422503`
}
object RequestBodyContentApplicationjsonUselfs {
  
  inline def apply(parameters: `165`, requestBody: ContentApplicationjsonUselfs, responses: `200422503`): RequestBodyContentApplicationjsonUselfs = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonUselfs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonUselfs] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonUselfs): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200422503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
