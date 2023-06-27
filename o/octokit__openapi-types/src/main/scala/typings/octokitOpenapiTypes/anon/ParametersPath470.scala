package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath470 extends StObject {
  
  var parameters: Path470
  
  var responses: `200Content109304`
}
object ParametersPath470 {
  
  inline def apply(parameters: Path470, responses: `200Content109304`): ParametersPath470 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath470]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath470] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path470): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content109304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
