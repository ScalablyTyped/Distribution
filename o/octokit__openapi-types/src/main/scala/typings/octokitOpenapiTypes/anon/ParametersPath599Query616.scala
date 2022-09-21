package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath599Query616 extends StObject {
  
  var parameters: Path599Query616
  
  var responses: `200Content622`
}
object ParametersPath599Query616 {
  
  inline def apply(parameters: Path599Query616, responses: `200Content622`): ParametersPath599Query616 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath599Query616]
  }
  
  extension [Self <: ParametersPath599Query616](x: Self) {
    
    inline def setParameters(value: Path599Query616): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content622`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
