package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentidOwnerPullnumber extends StObject {
  
  var parameters: PathCommentidOwnerPullnumber
  
  var requestBody: ContentApplicationjsonBodyString
  
  var responses: `201Content560HeadersLocation404`
}
object ParametersPathCommentidOwnerPullnumber {
  
  inline def apply(
    parameters: PathCommentidOwnerPullnumber,
    requestBody: ContentApplicationjsonBodyString,
    responses: `201Content560HeadersLocation404`
  ): ParametersPathCommentidOwnerPullnumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentidOwnerPullnumber]
  }
  
  extension [Self <: ParametersPathCommentidOwnerPullnumber](x: Self) {
    
    inline def setParameters(value: PathCommentidOwnerPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content560HeadersLocation404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
