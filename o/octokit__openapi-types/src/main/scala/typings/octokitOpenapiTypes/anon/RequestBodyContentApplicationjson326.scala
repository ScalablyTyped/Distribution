package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjson326 extends StObject {
  
  var parameters: PathReleaseid
  
  var requestBody: ContentApplicationjson326
  
  var responses: `200201422`
}
object RequestBodyContentApplicationjson326 {
  
  inline def apply(parameters: PathReleaseid, requestBody: ContentApplicationjson326, responses: `200201422`): RequestBodyContentApplicationjson326 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjson326]
  }
  
  extension [Self <: RequestBodyContentApplicationjson326](x: Self) {
    
    inline def setParameters(value: PathReleaseid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson326): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200201422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
