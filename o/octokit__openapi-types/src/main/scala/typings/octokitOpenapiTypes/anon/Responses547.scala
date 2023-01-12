package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses547 extends StObject {
  
  var parameters: PathCommentidOwnerRepo
  
  var requestBody: ContentApplicationjsonBody
  
  var responses: `547`
}
object Responses547 {
  
  inline def apply(parameters: PathCommentidOwnerRepo, requestBody: ContentApplicationjsonBody, responses: `547`): Responses547 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses547]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses547] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `547`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
