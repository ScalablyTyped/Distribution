package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonUselfs extends StObject {
  
  var parameters: `76`
  
  var requestBody: ContentApplicationjsonUselfs
  
  var responses: `200ContentApplicationjsonAuthorscount422Content8`
}
object RequestBodyContentApplicationjsonUselfs {
  
  inline def apply(
    parameters: `76`,
    requestBody: ContentApplicationjsonUselfs,
    responses: `200ContentApplicationjsonAuthorscount422Content8`
  ): RequestBodyContentApplicationjsonUselfs = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonUselfs]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonUselfs](x: Self) {
    
    inline def setParameters(value: `76`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonUselfs): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonAuthorscount422Content8`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
