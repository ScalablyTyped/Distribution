package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery609 extends StObject {
  
  var parameters: Query609
  
  var responses: `200Content610`
}
object ParametersQuery609 {
  
  inline def apply(parameters: Query609, responses: `200Content610`): ParametersQuery609 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery609]
  }
  
  extension [Self <: ParametersQuery609](x: Self) {
    
    inline def setParameters(value: Query609): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content610`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
