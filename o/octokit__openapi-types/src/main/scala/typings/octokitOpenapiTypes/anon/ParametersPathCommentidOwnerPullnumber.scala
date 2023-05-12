package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentidOwnerPullnumber extends StObject {
  
  var parameters: PathCommentidOwnerPullnumber
  
  var requestBody: ContentApplicationjsonBody
  
  var responses: `201ContentApplicationjsonInreplytoidHeadersLocation404Content36`
}
object ParametersPathCommentidOwnerPullnumber {
  
  inline def apply(
    parameters: PathCommentidOwnerPullnumber,
    requestBody: ContentApplicationjsonBody,
    responses: `201ContentApplicationjsonInreplytoidHeadersLocation404Content36`
  ): ParametersPathCommentidOwnerPullnumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentidOwnerPullnumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCommentidOwnerPullnumber] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentidOwnerPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonInreplytoidHeadersLocation404Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
