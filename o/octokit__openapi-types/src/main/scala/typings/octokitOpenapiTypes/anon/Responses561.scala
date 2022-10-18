package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses561 extends StObject {
  
  var parameters: PathCommentidOwnerRepo
  
  var requestBody: ContentApplicationjsonBodyString
  
  var responses: `561`
}
object Responses561 {
  
  inline def apply(
    parameters: PathCommentidOwnerRepo,
    requestBody: ContentApplicationjsonBodyString,
    responses: `561`
  ): Responses561 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses561]
  }
  
  extension [Self <: Responses561](x: Self) {
    
    inline def setParameters(value: PathCommentidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `561`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
