package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonParents extends StObject {
  
  var parameters: `135`
  
  var requestBody: ContentApplicationjsonParents
  
  var responses: `201Content232`
}
object RequestBodyContentApplicationjsonParents {
  
  inline def apply(parameters: `135`, requestBody: ContentApplicationjsonParents, responses: `201Content232`): RequestBodyContentApplicationjsonParents = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonParents]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonParents](x: Self) {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonParents): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content232`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
