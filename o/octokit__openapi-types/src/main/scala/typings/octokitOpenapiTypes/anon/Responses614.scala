package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses614 extends StObject {
  
  var parameters: PathCommentidOwnerRepo
  
  var requestBody: ContentApplicationjsonBody
  
  var responses: `614`
}
object Responses614 {
  
  inline def apply(parameters: PathCommentidOwnerRepo, requestBody: ContentApplicationjsonBody, responses: `614`): Responses614 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses614]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses614] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `614`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
