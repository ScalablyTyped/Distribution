package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPullnumberQueryPage extends StObject {
  
  var parameters: PathPullnumberQueryPage
  
  var responses: `200Content197`
}
object ParametersPathPullnumberQueryPage {
  
  inline def apply(parameters: PathPullnumberQueryPage, responses: `200Content197`): ParametersPathPullnumberQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPullnumberQueryPage]
  }
  
  extension [Self <: ParametersPathPullnumberQueryPage](x: Self) {
    
    inline def setParameters(value: PathPullnumberQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content197`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
