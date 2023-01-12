package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonExcludeattachments extends StObject {
  
  var parameters: `57`
  
  var requestBody: ContentApplicationjsonExcludeattachments
  
  var responses: `201Content90`
}
object RequestBodyContentApplicationjsonExcludeattachments {
  
  inline def apply(parameters: `57`, requestBody: ContentApplicationjsonExcludeattachments, responses: `201Content90`): RequestBodyContentApplicationjsonExcludeattachments = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonExcludeattachments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonExcludeattachments] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `57`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonExcludeattachments): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content90`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
