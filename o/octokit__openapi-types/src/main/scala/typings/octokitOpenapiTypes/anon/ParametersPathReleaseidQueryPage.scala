package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathReleaseidQueryPage extends StObject {
  
  var parameters: PathReleaseidQueryPage
  
  var responses: `200Content319`
}
object ParametersPathReleaseidQueryPage {
  
  inline def apply(parameters: PathReleaseidQueryPage, responses: `200Content319`): ParametersPathReleaseidQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathReleaseidQueryPage]
  }
  
  extension [Self <: ParametersPathReleaseidQueryPage](x: Self) {
    
    inline def setParameters(value: PathReleaseidQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content319`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
