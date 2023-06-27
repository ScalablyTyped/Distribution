package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonParents extends StObject {
  
  var parameters: `165`
  
  var requestBody: ContentApplicationjsonParents
  
  var responses: `201Content290`
}
object RequestBodyContentApplicationjsonParents {
  
  inline def apply(parameters: `165`, requestBody: ContentApplicationjsonParents, responses: `201Content290`): RequestBodyContentApplicationjsonParents = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonParents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonParents] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonParents): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content290`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
