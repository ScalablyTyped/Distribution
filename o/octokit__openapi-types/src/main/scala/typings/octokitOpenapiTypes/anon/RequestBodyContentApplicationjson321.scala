package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson321 extends StObject {
  
  var parameters: PathReleaseid
  
  var requestBody: ContentApplicationjson321
  
  var responses: `200201422`
}
object RequestBodyContentApplicationjson321 {
  
  inline def apply(parameters: PathReleaseid, requestBody: ContentApplicationjson321, responses: `200201422`): RequestBodyContentApplicationjson321 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson321]
  }
  
  extension [Self <: RequestBodyContentApplicationjson321](x: Self) {
    
    inline def setParameters(value: PathReleaseid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson321): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200201422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
