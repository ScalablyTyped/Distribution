package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonIncludeallbranches extends StObject {
  
  var parameters: PathTemplateowner
  
  var requestBody: ContentApplicationjsonIncludeallbranches
  
  var responses: `568`
}
object RequestBodyContentApplicationjsonIncludeallbranches {
  
  inline def apply(
    parameters: PathTemplateowner,
    requestBody: ContentApplicationjsonIncludeallbranches,
    responses: `568`
  ): RequestBodyContentApplicationjsonIncludeallbranches = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonIncludeallbranches]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonIncludeallbranches] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTemplateowner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonIncludeallbranches): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `568`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
