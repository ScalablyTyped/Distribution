package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses370 extends StObject {
  
  var parameters: PathCommentidOwner
  
  var requestBody: ContentApplicationjsonBody
  
  var responses: `370`
}
object Responses370 {
  
  inline def apply(parameters: PathCommentidOwner, requestBody: ContentApplicationjsonBody, responses: `370`): Responses370 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses370]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses370] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `370`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
