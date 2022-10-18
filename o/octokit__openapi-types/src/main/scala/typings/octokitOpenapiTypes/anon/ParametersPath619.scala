package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath619 extends StObject {
  
  var parameters: Path619
  
  var responses: `200Content620`
}
object ParametersPath619 {
  
  inline def apply(parameters: Path619, responses: `200Content620`): ParametersPath619 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath619]
  }
  
  extension [Self <: ParametersPath619](x: Self) {
    
    inline def setParameters(value: Path619): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content620`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
