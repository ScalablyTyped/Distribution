package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentnumberDiscussionnumberQueryContentPage extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumberQueryContentPage
  
  var responses: `200Content119`
}
object ParametersPathCommentnumberDiscussionnumberQueryContentPage {
  
  inline def apply(parameters: PathCommentnumberDiscussionnumberQueryContentPage, responses: `200Content119`): ParametersPathCommentnumberDiscussionnumberQueryContentPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentnumberDiscussionnumberQueryContentPage]
  }
  
  extension [Self <: ParametersPathCommentnumberDiscussionnumberQueryContentPage](x: Self) {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumberQueryContentPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content119`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
