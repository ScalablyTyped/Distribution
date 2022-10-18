package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath611 extends StObject {
  
  var parameters: Path611
  
  var responses: `200Content381`
}
object ParametersPath611 {
  
  inline def apply(parameters: Path611, responses: `200Content381`): ParametersPath611 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath611]
  }
  
  extension [Self <: ParametersPath611](x: Self) {
    
    inline def setParameters(value: Path611): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content381`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
