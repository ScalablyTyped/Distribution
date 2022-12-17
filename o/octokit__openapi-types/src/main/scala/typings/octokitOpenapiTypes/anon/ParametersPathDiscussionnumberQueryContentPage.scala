package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberQueryContentPage extends StObject {
  
  var parameters: PathDiscussionnumberQueryContentPage
  
  var responses: `200Content112`
}
object ParametersPathDiscussionnumberQueryContentPage {
  
  inline def apply(parameters: PathDiscussionnumberQueryContentPage, responses: `200Content112`): ParametersPathDiscussionnumberQueryContentPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberQueryContentPage]
  }
  
  extension [Self <: ParametersPathDiscussionnumberQueryContentPage](x: Self) {
    
    inline def setParameters(value: PathDiscussionnumberQueryContentPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content112`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
