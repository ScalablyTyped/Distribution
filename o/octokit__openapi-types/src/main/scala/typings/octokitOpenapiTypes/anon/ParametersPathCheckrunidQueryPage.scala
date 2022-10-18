package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCheckrunidQueryPage extends StObject {
  
  var parameters: PathCheckrunidQueryPage
  
  var responses: `200Content100`
}
object ParametersPathCheckrunidQueryPage {
  
  inline def apply(parameters: PathCheckrunidQueryPage, responses: `200Content100`): ParametersPathCheckrunidQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCheckrunidQueryPage]
  }
  
  extension [Self <: ParametersPathCheckrunidQueryPage](x: Self) {
    
    inline def setParameters(value: PathCheckrunidQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content100`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
