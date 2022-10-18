package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath607Query378 extends StObject {
  
  var parameters: Path607Query378
  
  var responses: `200Content324Headers404`
}
object ParametersPath607Query378 {
  
  inline def apply(parameters: Path607Query378, responses: `200Content324Headers404`): ParametersPath607Query378 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath607Query378]
  }
  
  extension [Self <: ParametersPath607Query378](x: Self) {
    
    inline def setParameters(value: Path607Query378): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content324Headers404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
