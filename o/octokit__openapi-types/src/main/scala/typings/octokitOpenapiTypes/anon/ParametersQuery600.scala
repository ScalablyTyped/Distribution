package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery600 extends StObject {
  
  var parameters: Query600
  
  var responses: `200Content349Headers24`
}
object ParametersQuery600 {
  
  inline def apply(parameters: Query600, responses: `200Content349Headers24`): ParametersQuery600 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery600]
  }
  
  extension [Self <: ParametersQuery600](x: Self) {
    
    inline def setParameters(value: Query600): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content349Headers24`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
