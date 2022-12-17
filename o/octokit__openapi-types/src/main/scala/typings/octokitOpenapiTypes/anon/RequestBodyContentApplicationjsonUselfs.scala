package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonUselfs extends StObject {
  
  var parameters: `135`
  
  var requestBody: ContentApplicationjsonUselfs
  
  var responses: `200Content245422`
}
object RequestBodyContentApplicationjsonUselfs {
  
  inline def apply(parameters: `135`, requestBody: ContentApplicationjsonUselfs, responses: `200Content245422`): RequestBodyContentApplicationjsonUselfs = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonUselfs]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonUselfs](x: Self) {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonUselfs): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content245422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
