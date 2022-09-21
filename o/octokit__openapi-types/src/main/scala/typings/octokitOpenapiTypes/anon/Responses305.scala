package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses305 extends StObject {
  
  var parameters: PathCommentidOwner
  
  var requestBody: ContentApplicationjsonBody
  
  var responses: `305`
}
object Responses305 {
  
  inline def apply(parameters: PathCommentidOwner, requestBody: ContentApplicationjsonBody, responses: `305`): Responses305 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses305]
  }
  
  extension [Self <: Responses305](x: Self) {
    
    inline def setParameters(value: PathCommentidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `305`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
