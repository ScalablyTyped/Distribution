package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath317Query309 extends StObject {
  
  var parameters: Path317Query309
  
  var responses: `318`
}
object ParametersPath317Query309 {
  
  inline def apply(parameters: Path317Query309, responses: `318`): ParametersPath317Query309 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath317Query309]
  }
  
  extension [Self <: ParametersPath317Query309](x: Self) {
    
    inline def setParameters(value: Path317Query309): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `318`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
