package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses168 extends StObject {
  
  var parameters: PathCommentidOwner
  
  var requestBody: ContentApplicationjsonBodyString
  
  var responses: `168`
}
object Responses168 {
  
  inline def apply(parameters: PathCommentidOwner, requestBody: ContentApplicationjsonBodyString, responses: `168`): Responses168 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses168]
  }
  
  extension [Self <: Responses168](x: Self) {
    
    inline def setParameters(value: PathCommentidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `168`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
