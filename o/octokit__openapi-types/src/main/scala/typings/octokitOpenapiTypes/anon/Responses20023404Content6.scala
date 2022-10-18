package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses20023404Content6 extends StObject {
  
  var parameters: PathCommentid
  
  var requestBody: ContentApplicationjsonBodyString
  
  var responses: `20023404Content6`
}
object Responses20023404Content6 {
  
  inline def apply(
    parameters: PathCommentid,
    requestBody: ContentApplicationjsonBodyString,
    responses: `20023404Content6`
  ): Responses20023404Content6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses20023404Content6]
  }
  
  extension [Self <: Responses20023404Content6](x: Self) {
    
    inline def setParameters(value: PathCommentid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `20023404Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
