package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonLine extends StObject {
  
  var parameters: PathCommentidOwner
  
  var requestBody: ContentApplicationjsonBodyString
  
  var responses: `200ContentApplicationjsonLine`
}
object Responses200ContentApplicationjsonLine {
  
  inline def apply(
    parameters: PathCommentidOwner,
    requestBody: ContentApplicationjsonBodyString,
    responses: `200ContentApplicationjsonLine`
  ): Responses200ContentApplicationjsonLine = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonLine]
  }
  
  extension [Self <: Responses200ContentApplicationjsonLine](x: Self) {
    
    inline def setParameters(value: PathCommentidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonLine`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
