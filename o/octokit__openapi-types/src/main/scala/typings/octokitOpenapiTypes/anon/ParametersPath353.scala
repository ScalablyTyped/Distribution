package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath353 extends StObject {
  
  var parameters: Path353
  
  var responses: `200Content354`
}
object ParametersPath353 {
  
  inline def apply(parameters: Path353, responses: `200Content354`): ParametersPath353 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath353]
  }
  
  extension [Self <: ParametersPath353](x: Self) {
    
    inline def setParameters(value: Path353): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content354`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
