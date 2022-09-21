package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentidOwnerQueryContentPage extends StObject {
  
  var parameters: PathCommentidOwnerQueryContentPage
  
  var responses: `200Content119404`
}
object ParametersPathCommentidOwnerQueryContentPage {
  
  inline def apply(parameters: PathCommentidOwnerQueryContentPage, responses: `200Content119404`): ParametersPathCommentidOwnerQueryContentPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentidOwnerQueryContentPage]
  }
  
  extension [Self <: ParametersPathCommentidOwnerQueryContentPage](x: Self) {
    
    inline def setParameters(value: PathCommentidOwnerQueryContentPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content119404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
