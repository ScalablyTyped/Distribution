package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAssigneesBody extends StObject {
  
  var parameters: PathIssuenumber
  
  var requestBody: ContentApplicationjsonAssigneesBody
  
  var responses: `301403`
}
object RequestBodyContentApplicationjsonAssigneesBody {
  
  inline def apply(parameters: PathIssuenumber, requestBody: ContentApplicationjsonAssigneesBody, responses: `301403`): RequestBodyContentApplicationjsonAssigneesBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAssigneesBody]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonAssigneesBody](x: Self) {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAssigneesBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `301403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
