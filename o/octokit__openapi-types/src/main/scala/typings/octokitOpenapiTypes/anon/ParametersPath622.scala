package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath622 extends StObject {
  
  var parameters: Path622
  
  var responses: `200304401403404500`
}
object ParametersPath622 {
  
  inline def apply(parameters: Path622, responses: `200304401403404500`): ParametersPath622 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath622]
  }
  
  extension [Self <: ParametersPath622](x: Self) {
    
    inline def setParameters(value: Path622): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304401403404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
