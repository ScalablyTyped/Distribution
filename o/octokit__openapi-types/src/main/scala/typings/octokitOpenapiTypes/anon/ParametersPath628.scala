package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath628 extends StObject {
  
  var parameters: Path628
  
  var responses: `275`
}
object ParametersPath628 {
  
  inline def apply(parameters: Path628, responses: `275`): ParametersPath628 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath628]
  }
  
  extension [Self <: ParametersPath628](x: Self) {
    
    inline def setParameters(value: Path628): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `275`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
