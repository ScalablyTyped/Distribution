package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath608 extends StObject {
  
  var parameters: Path608
  
  var responses: `200Content370`
}
object ParametersPath608 {
  
  inline def apply(parameters: Path608, responses: `200Content370`): ParametersPath608 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath608]
  }
  
  extension [Self <: ParametersPath608](x: Self) {
    
    inline def setParameters(value: Path608): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content370`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
