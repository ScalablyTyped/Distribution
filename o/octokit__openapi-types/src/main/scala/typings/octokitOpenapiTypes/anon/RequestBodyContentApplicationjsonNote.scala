package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonNote extends StObject {
  
  var parameters: PathCardid
  
  var requestBody: ContentApplicationjsonNote
  
  var responses: `401403404422`
}
object RequestBodyContentApplicationjsonNote {
  
  inline def apply(parameters: PathCardid, requestBody: ContentApplicationjsonNote, responses: `401403404422`): RequestBodyContentApplicationjsonNote = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonNote]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonNote](x: Self) {
    
    inline def setParameters(value: PathCardid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNote): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401403404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
