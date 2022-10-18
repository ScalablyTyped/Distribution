package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath627 extends StObject {
  
  var parameters: Path627
  
  var responses: `200Content626`
}
object ParametersPath627 {
  
  inline def apply(parameters: Path627, responses: `200Content626`): ParametersPath627 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath627]
  }
  
  extension [Self <: ParametersPath627](x: Self) {
    
    inline def setParameters(value: Path627): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content626`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
