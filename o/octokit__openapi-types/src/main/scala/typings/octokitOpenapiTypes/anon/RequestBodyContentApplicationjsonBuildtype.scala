package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBuildtype extends StObject {
  
  var parameters: `144`
  
  var requestBody: ContentApplicationjsonBuildtype
  
  var responses: `400422`
}
object RequestBodyContentApplicationjsonBuildtype {
  
  inline def apply(parameters: `144`, requestBody: ContentApplicationjsonBuildtype, responses: `400422`): RequestBodyContentApplicationjsonBuildtype = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBuildtype]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonBuildtype](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBuildtype): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
