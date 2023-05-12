package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonOneOf extends StObject {
  
  var parameters: Path131
  
  var requestBody: ContentApplicationjsonOneOf
  
  var responses: `201304401`
}
object RequestBodyContentApplicationjsonOneOf {
  
  inline def apply(parameters: Path131, requestBody: ContentApplicationjsonOneOf, responses: `201304401`): RequestBodyContentApplicationjsonOneOf = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonOneOf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonOneOf] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path131): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonOneOf): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201304401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
