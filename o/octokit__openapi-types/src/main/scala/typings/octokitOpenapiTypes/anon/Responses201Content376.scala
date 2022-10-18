package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content376 extends StObject {
  
  var parameters: PathCommentidOwnerRepo
  
  var requestBody: ContentApplicationjson62
  
  var responses: `201Content376`
}
object Responses201Content376 {
  
  inline def apply(
    parameters: PathCommentidOwnerRepo,
    requestBody: ContentApplicationjson62,
    responses: `201Content376`
  ): Responses201Content376 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content376]
  }
  
  extension [Self <: Responses201Content376](x: Self) {
    
    inline def setParameters(value: PathCommentidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson62): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content376`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
